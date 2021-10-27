import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // 1
        ArrayInput.run(scanner);
        // 2
        VehicleInput.run(scanner);
        scanner.close();
    }
}
