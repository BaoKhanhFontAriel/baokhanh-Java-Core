import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        CheckTriangle.enterInput(scanner);
        scanner.nextLine();
        PersonalInfomation.run(scanner);
        scanner.close();
    }
}
