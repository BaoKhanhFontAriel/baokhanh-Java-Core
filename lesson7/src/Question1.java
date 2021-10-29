public class Question1 {
    public static void run(){
        System.out.println("câu 1: ");
        printLeftTriangle();
        printCenterTriangle();
        printSquare();
    }

    public static void printLeftTriangle(){
        System.out.println("left triagle");

        for (int i  = 1; i <= 4; i ++){
            for (int j = 1; j <= i; j++){
                System.out.print("*    ");
            }
            System.out.println("\n");
        }
    }

    public static void printCenterTriangle(){
        System.out.println("center triagle");

        for (int i  = 1; i <= 4; i++){
            for (int j = 1; j <= 4 - i; j++){
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++){
                    System.out.print("*     ");
            }
            System.out.println("\n");
        }
    }

    public static void printSquare(){
        System.out.println("square");

        for (int i  = 1; i <= 4; i ++){
            for (int j = 1; j <= 4; j++){
                System.out.print("*    ");
            }
            System.out.println("\n");
        }
    }
}
