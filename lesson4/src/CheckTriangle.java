import java.util.Scanner;

public class CheckTriangle {
    private int sideA, sideB, sideC;

    public void enterInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập 3 cạnh: ");
        System.out.print("a = ");
        sideA = scanner.nextInt();
        System.out.print("b = ");
        sideB = scanner.nextInt();
        System.out.print("c = ");
        sideC = scanner.nextInt();
        checkInput();
        scanner.close();
    }

    public void checkInput() {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            System.out.println("Có tam giác được tạo thành từ giá trị của 3 cạnh");
            findTriagleType();
        } else
            System.out.println("không có tam giác được tạo thành từ giá trị của 3 cạnh");
    }

    public void findTriagleType() {
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