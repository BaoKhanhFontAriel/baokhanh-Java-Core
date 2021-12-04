import java.util.Scanner;
import java.util.regex.Pattern;

public class SignUp {
    public static void signUp(Scanner scanner){
        String username = signUpUsername(scanner);
        String email = signUpEmail(scanner);
        String password = signUpPassword(scanner);
        UserRepository.addUser(new User(username, password, email));
    }

    public static boolean checkExist(String email){
        for (User user : UserRepository.getUsers()) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public static String signUpUsername(Scanner scanner){
        System.out.print("nhập username: ");
        return scanner.nextLine();
    }

    public static String signUpEmail(Scanner scanner){
        while (true){
            System.out.print("nhập email: ");
            String email = scanner.nextLine();
            String emailRegex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";

            if (email.matches(emailRegex)){
                if (checkExist(email)){
                    System.out.println("Email đã tồn tại");
                }
                else {
                    System.out.println("Email hợp lệ! Đăng kí thành công!");
                    return email;
                }
            } else System.out.println("email không hợp lê! Vui lòng nhập lại!");
        }
    }

    public static String signUpPassword(Scanner scanner){
        while (true){
            System.out.println("password chua 8 ki tu, it nhat 1 chu, 1 so va 1 ki tu dac biet");
            System.out.print("nhập password: ");
            String password = scanner.nextLine();
            String pwRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
            if (password.matches(pwRegex)){
                System.out.println("Mật khẩu hợp lệ! Đăng kí thành công!");
                return password;
            } else System.out.println("mật khẩu không hợp lê! Vui lòng nhập lại!");
        }
    }


}
