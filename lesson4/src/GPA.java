import java.util.Scanner;

public class GPA {
    public static void enterInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập điểm Toán: ");
        int math = scanner.nextInt();
        System.out.print("nhập điểm Văn: ");
        int literature = scanner.nextInt();
        System.out.print("nhập điểm Lý: ");
        int physics = scanner.nextInt();
        System.out.print("nhập điểm Hóa: ");
        int chemistry = scanner.nextInt();
        calcGPA(math, literature, physics, chemistry);
        scanner.close();
    }

    public static void calcGPA(int math, int literature, int physics, int chemistry) {
        double GPA = (math + literature + physics + chemistry) / 4;
        System.out.println("GPA = " + GPA);
        if (0 >= GPA && GPA < 4.5) {
            System.out.println("hạng yếu");
        } else if (GPA >= 4.5 && GPA < 6.5) {
            System.out.println("hạng trung bình");
        } else if (GPA >= 6.5 && GPA < 8) {
            System.out.println("hạng khá");
        } else if (GPA >= 8) {
            System.out.println("hạng giỏi");
        } else
            System.out.println("điểm không hợp lệ");

    }
}