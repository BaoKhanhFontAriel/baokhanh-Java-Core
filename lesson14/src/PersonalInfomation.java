import java.time.LocalDate;
import java.util.Scanner;

public class PersonalInfomation {
    public static void run(Scanner scanner) {
        System.out.println("nhập tên: ");
        String name = scanner.nextLine();
        int year = vadilateAge(scanner);
        System.out.println("nhập địa chỉ: ");
        String address = scanner.nextLine();

        System.out.println("tên: " + name + ", năm sinh: " + year + ", địa chỉ: " + address);
    }

    public static int vadilateAge(Scanner scanner){
        int year = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println("nhập năm sinh: ");
            try { 
                year = Integer.parseInt(scanner.nextLine());
                checkAge(year);
                isValid = true;
            }
            catch (NumberFormatException n){
                System.out.println("bạn phải nhập số, vui lòng nhập lại!");
            }
            catch (InvalidYearException e){
                System.out.println("bạn phải nhập năm từ 1900 đến 2021, vui lòng nhập lại");
            }
        }

        return year;
    }

    public static void checkAge(int year) throws InvalidYearException {
        if (year < 1990 || year > LocalDate.now().getYear())
            throw new InvalidYearException("năm sinh phải từ 1990 đến 2021");
        else
            System.out.println("năm sinh hợp lệ");
    }
}
