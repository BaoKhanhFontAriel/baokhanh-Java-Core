import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // write your code here
        Scanner scanner = new Scanner(new InputStreamReader(System.in, "UTF-8"));      
        System.out.println("nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("tên: " + name);
        System.out.println("tuổi: " + age);
        System.out.println(" địa chỉ: " + address);
        scanner.close();

        //tại sao vậy
    }
}
