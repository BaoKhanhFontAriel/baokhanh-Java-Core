import java.util.Scanner;

public class CheckTriangle {
    private static int sideA, sideB, sideC;

    public static void enterInput(Scanner scanner) {
        System.out.println("nhập 3 cạnh: ");
    
        sideA = checkInput("a = ", scanner);
        sideB = checkInput("b = ", scanner);
        sideC = checkInput("c = ", scanner);
        checkSides();
    }

    public static int checkInput(String message, Scanner scanner) {
        boolean isNumber = false;
        int side = 0;
        while (!isNumber) {
            System.out.print(message);
            try {
                side = Integer.parseInt(scanner.next());
                checkInteger(side);
                isNumber = true;
            } catch (NumberFormatException e) {
                System.out.println("Bạn cần phải nhập số, vui lòng nhập lại!");
            } catch (InvalidIntergerException e) {
                System.out.println("Bạn cần phải nhập cạnh lớn hơn 0, vui lòng nhập lại!");
            }
        }
        return side;
    }

    public static void checkInteger(int side) throws InvalidIntergerException {
        if (side <= 0) throw new InvalidIntergerException("");
    }

    public static void checkSides() {
        System.out.println("ba cạnh là a = " + sideA + ", b = " + sideB + ", c = " + sideC);

        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            System.out.println("Có tam giác được tạo thành từ giá trị của 3 cạnh");
            findTriagleType();
        } else
            System.out.println("không có tam giác được tạo thành từ giá trị của 3 cạnh");
    }

    public static void findTriagleType() {
        if (Math.pow(sideA, 2) == Math.pow(sideB, 2) + Math.pow(sideC, 2)
                || Math.pow(sideB, 2) == Math.pow(sideB, 2) + Math.pow(sideA, 2)
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