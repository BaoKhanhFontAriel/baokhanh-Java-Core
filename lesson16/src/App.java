import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    static int BALANCE = 5000000;
    static DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static DecimalFormat df = new DecimalFormat("###,###,###");
    public static void main(String[] args) throws Exception {
        System.out.println("tiến hành đăng nhập vào ngan hàng VPbank!");
        Scanner scanner = new Scanner(System.in);
        account.login(scanner);
        menu(scanner);
    }

    static  public void menu(Scanner scanner){
        System.out.println("ngân hàng VPbank chào mừng quý khách!");
        System.out.println("xin hãy chọn việc bạn muốn làm:");
        System.out.println(
                "1 - Truy vấn số dư tài khoản\n" +
                "2- Chuyển tiền\n" +
                "3 - Xem lịch sử giao dịch\n"+
                        "4 - Thoát");
        while (true){
            System.out.print("bạn chọn: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1: account.checkBalance(); break;
                case 2: account.transferMoney(scanner); break;
                case 3: account.checkTransactionHistory(); break;
                case 4: System.exit(1);
            }
        }
    }

    static IInternetBanking account = new IInternetBanking() {
        @Override
        public void login(Scanner scanner) {
            boolean isLoginCorrected = false;
            while (!isLoginCorrected){
                System.out.println("nhập SDT:");
                String nMobile = scanner.nextLine();
                System.out.println("nhập  mật khẩu:");
                String nPassword = scanner.nextLine();

                String mobile = "0123456789";
                String password = "123456789";
                if (nMobile.equals(mobile) && nPassword.equals(password)){
                    System.out.println("đăng nhập thành công!");
                    isLoginCorrected = true;
                }
                else {
                    System.out.println("bạn nhập sai số điên thoại hoặc mật khẩu, xin hãy đăng nhập lại!");
                }
            }
        }

        @Override
        public void transferMoney(Scanner scanner) {
            System.out.print("nhập ngân hàng cần chuyển tiền: ");
            String bank = scanner.nextLine();

            boolean isValid = false;
            String recipientAccount = "";
            while (!isValid){
                try {
                    System.out.print("nhập số tài khoản: ");
                    recipientAccount = scanner.nextLine();
                    IAccount.checkAccount(recipientAccount);
                    isValid = true;
                }
                catch (InvalidBankAccountException e){
                    System.out.println(e.getMessage() + ", xin hãy nhập lại!");
                }
            }

            isValid = false;
            int amount = 0;
            while (!isValid){
                try {
                    System.out.print("nhập số tiền bạn muốn chuyển: ");
                    amount = Integer.parseInt(scanner.nextLine());
                    IAmount.checkAmount(amount);
                    isValid = true;
                }
                catch (InvalidAmountException e){
                    System.out.println(e.getMessage() + ", xin hãy nhập lại!");
                }
            }

            System.out.print("nhập mô tả: ");
            String detail = scanner.nextLine();

            // tiến hàng giao dịch
            BALANCE = BALANCE - amount;
            transactionList.add(dateTimeFormatter.format(LocalDate.now()) + " - " + detail + " - " + recipientAccount + " - " + bank + " - " + df.format(amount));
        }

        @Override
        public void checkBalance() {
            System.out.println(df.format(BALANCE));
        }

        @Override
        public void checkTransactionHistory() {
            transactionList.forEach(System.out::println);
        }
    };

    static IAccount IAccount = account -> {
        char[] array = account.toCharArray();
        if (array.length < 8 || array.length > 16)
            throw new InvalidBankAccountException("stk phải là các số gồm từ 8 đến 16 ký tự");
        else {
            for (Character c: array
            ) {
                if (!Character.isDigit(c))
                    throw new InvalidBankAccountException("stk phải là các số gồm từ 8 đến 16 ký tự");
            }
        }} ;

    static IAmount IAmount = amount -> {
        if (amount < 50000 || amount > BALANCE - 50000)
            throw new InvalidAmountException("Số tiền muốn chuyển cần lớn hơn 50.000 và nhỏ hơn số dư tài khoản trừ 50000");
    };
}
