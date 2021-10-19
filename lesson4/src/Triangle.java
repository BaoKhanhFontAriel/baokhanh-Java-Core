import java.util.Scanner;

public class Triangle {
    private int a, b, c;

    public void enterInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập 3 cạnh: ");
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();
        calcInput();
        scanner.close();
    }

    public void calcInput() {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Có tam giác được tạo thành từ giá trị của 3 cạnh");
            findTriagleType();
        } else
            System.out.println("không có tam giác được tạo thành từ giá trị của 3 cạnh");
    }

    public void findTriagleType() {
        if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2) || Math.pow(b, 2) == Math.pow(b, 2) + Math.pow(a, 2)
                || Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2)) {
            System.out.println("đó là 1 tam giác vuông");
        } else if (a == b) {
            if (c == b) {
                System.out.println("đó là 1 tam giác đều");
            } else
                System.out.println("đó là 1 tam giác cân");
        } else
            System.out.println("đó là 1 tam giác thường");
    }
}