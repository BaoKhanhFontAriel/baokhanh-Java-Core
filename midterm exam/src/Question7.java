import java.util.Scanner;

public class Question7 {
    static Scanner scanner = new Scanner(System.in);

    public static void run() {
        System.out.println("câu 7: ");
        getInput();
    }

    public static void getInput() {
        System.out.print("nhập số hàng: ");
        int row = scanner.nextInt();
        scanner.nextLine();
        System.out.print("nhập số cột: ");
        int col = scanner.nextInt();
        int[][] array = new int[row][col];

        getElement(array);
        printInput(array);
        printDiagonal(array);
    }

    public static void printInput(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void getElement(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("nhập ở hàng " + (i + 1) + ", cột " + (j + 1) + " : ");
                array[i][j] = scanner.nextInt();

            }
            System.out.println();
        }
    }

    public static void printDiagonal(int[][] array) {
        System.out.println("in đường chéo: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + "\t");
        }
    }
}
