import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        UserRepository.getData();
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
        scanner.close();
    }

    public static void menu(Scanner scanner){
        System.out.println("lựa chọn sau: ");
        System.out.println("1 - Đăng nhập\n" +
                "2 - Đăng ký");
        System.out.print("bạn chọn: ");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option){
            case 1: Login.login(scanner); break;
            case 2: SignUp.signUp(scanner); break;
            default:
                System.out.println("không hợp lệ!");
        }
    }
}
