import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 1
        int randomNumber = new Random().nextInt(100);
        String result = randomNumber % 2 == 0 ? randomNumber + " là số chẵn" : randomNumber + " là số lẻ";
        System.out.println("Số ngãu nhiên từ 0 tới 100 là: " + result);

        // 2
        double hypotenuse = Math.sqrt(Math.pow(3, 2) + Math.pow(4,2));
        System.out.printf("Cạnh huyền của tam giác vuông có canh là 3 và 4 là: %.0f \n", hypotenuse);

        //3
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập y: ");
        int y = scanner.nextInt();
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + ((double) x / y));

        scanner.close();
    }
}
