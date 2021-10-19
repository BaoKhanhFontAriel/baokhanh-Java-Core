import java.util.Scanner;

public class CheckTriangle { 

    public static void enterInput() {
        int sideA, sideB, sideC;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập 3 cạnh: ");
        System.out.print("a = ");
        sideA = scanner.nextInt();
        System.out.print("b = ");
        sideB = scanner.nextInt();
        System.out.print("c = ");
        sideC = scanner.nextInt();
        checkInput(sideA, sideB, sideC);
        scanner.close();
    }

    public static void checkInput(int sideA, int sideB, int sideC) {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            System.out.println("Có tam giác được tạo thành từ giá trị của 3 cạnh");
            findTriagleType(sideA, sideB, sideC);
        } else
            System.out.println("không có tam giác được tạo thành từ giá trị của 3 cạnh");
    }

    public static void findTriagleType(int sideA, int sideB, int sideC) {
        if (Math.pow(sideA, 2) == Math.pow(sideB, 2) + Math.pow(sideC, 2) || Math.pow(sideB, 2) == Math.pow(sideB, 2) + Math.pow(sideA, 2)
                || Math.pow(sideC, 2) == Math.pow(sideB, 2) + Math.pow(sideA, 2)) {
            System.out.println("đó là 1 tam giác vuông");
        } else if (sideA == sideB) {
            if (sideC == sideB) {
                System.out.println("đó là 1 tam giác đều");
            } else
                System.out.println("đó là 1 tam giác cân");
        } else
            System.out.println("đó là 1 tam giác thường");
    }
}