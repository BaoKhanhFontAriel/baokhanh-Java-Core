public class Question2 {
    public static void run() {
        System.out.println("câu 2: ");
        print10Prime();
        printPrimeLessThan10();
    }

    public static void print10Prime() {
        System.out.println("10 số nguyên tố đầu là ");
        int num = 1;
        int count = 0;
        boolean isPrime = true;
        while (count < 10) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + "\t");
                count++;
            }
            isPrime = true;
            num++;
        }
    }

    public static void printPrimeLessThan10() {
        System.out.println("\nsố nguyên tố nhỏ hơn 10 là: ");
        boolean isPrime = true;
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) { 
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + "\t");
            }
            isPrime = true;
        }
    }
}
