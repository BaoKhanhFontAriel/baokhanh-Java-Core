import java.util.Scanner;

public class Login {
    private static User mUser;

    public static void login(Scanner scanner){
        System.out.println("tiến hành đăng nhập!");
        checkUserName(scanner);
        checkPassword(scanner);
    }

    public static void checkUserName(Scanner scanner){
        boolean isMatch = false;
        while (!isMatch){
            System.out.println("nhập tên đăng nhập: ");
            String username = scanner.nextLine();
            for (User user : UserRepository.getUsers()) {
                if (user.getUsername().equals(username)) {
                    mUser = user;
                    isMatch = true;
                    break;
                }
            }

            if (!isMatch){
                System.out.println("Sai username! xin nhập lại!");
            }
        }
    }

    public static void checkPassword(Scanner scanner){
            System.out.println("nhập mật khẩu: ");
            String password = scanner.nextLine();
            if (!password.equals(mUser.getPassword())){
                System.out.println("Sai mật khẩu!");
                menuPassword(scanner);
            } else {
                menuSuccessfulLogin(scanner);
            }
    }

    public static void menuSuccessfulLogin(Scanner scanner){
        System.out.println("Chào mừng " + mUser.getUsername() + ", bạn có thể thực hiện các công việc sau:");
        System.out.println("1 - Thay đổi username\n" +
                "2 - Thay đổi email\n" +
                "3 - Thay đổi mật khẩu\n" +
                "4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)\n" +
                "0 - Thoát chương trình");
        System.out.print("bạn chọn: ");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option){
            case 1: changeUsername(scanner); break;
            case 2: changeEmail(scanner); break;
            case 3: changePassword(scanner); break;
            case 4: Main.menu(scanner); break;
            case 0: System.exit(1); break;
            default:
                System.out.println("không hợp lệ!");
        }
    }

    public static void menuPassword(Scanner scanner){
        System.out.println("hãy lựa chọn: ");
        System.out.println("1 - Đăng nhập lại\n" +
                "2 - Quên mật khẩu");
        System.out.print("bạn chọn: ");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option){
            case 1: checkPassword(scanner); break;
            case 2: forgetPassword(scanner);
        }
    }

    public static void changeUsername(Scanner scanner){
        System.out.print("Nhập username mới: ");
        mUser.setUsername(scanner.nextLine());
        System.out.println("Đổi username thành công!");
    }

    public static void changeEmail(Scanner scanner){
        mUser.setEmail(SignUp.signUpEmail(scanner));
    }

    public static void changePassword(Scanner scanner){
        mUser.setPassword(SignUp.signUpPassword(scanner));
    }

    public static void forgetPassword(Scanner scanner){
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        for (User user: UserRepository.getUsers()
             ) {
            if (email.equals(user.getEmail())){
                user.setPassword(SignUp.signUpPassword(scanner));
                System.out.println("mật khẩu thay dổi thành công!");
                login(scanner);
            } else System.out.println("tài khoản không tồn tại!");
        }
    }
}
