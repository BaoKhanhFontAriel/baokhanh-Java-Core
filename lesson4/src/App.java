import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        chooseHomework();
    }

    public static void chooseHomework() {
        System.out.println("hãy chọn 1 bài tập: ");
        System.out.println("1 - kiểm tra 3 cạnh có tạo thành 1 tam giác");
        System.out.println("2 - tính điểm TBC");
        System.out.println("3 - tính phuong trình bậc 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("bạn chọn bài tập: ");
        int chooseHomework = scanner.nextInt();
        switch (chooseHomework) {
            case 1:
                CheckTriangle.enterInput();
                break;
            case 2:
                GPA.enterInput();
                break;
            case 3:
                QuadraticEquation.enterInput();
                break;
            default:
                System.out.println("không có bài tập này");
        }
        scanner.close();
    }
}
