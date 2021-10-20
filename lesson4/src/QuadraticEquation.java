import java.util.Scanner;

public class QuadraticEquation {
    private static int a;
    private static int b;
    private static int c;

    public static void enterInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("phương trình bậc 2 có dạng ax^2 + bx + c = 0 với a != 0");
        System.out.println("nhập 3 hệ số: ");
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();

        if (a == 0) {
            System.out.println("a không phù hợp với điều kiên do a = 0");
        } else
            findRoot();

        scanner.close();
    }

    public static void findRoot() {
        double delta = calcDelta();
        if (delta < 0) {
            System.out.println("phương trình vô nghiệm");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("Phương trình có nghiệm kép: x = %.2f", x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f\n", x2);
        }

    }

    public static double calcDelta() {
        return (double) Math.pow(b, 2) - 4 * a * c;
    }

}
