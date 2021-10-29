import java.util.Random;

public class Question5 {
    public static void run(){
        System.out.println("câu 5: ");
        System.out.println();
        int number = new Random().nextInt(1, 100);
        isPrime(number);
    }

    public static void isPrime(int num){
        boolean isPrime = true;
        for (int i = 2; i <= num/2; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num + " là số nguyên tố");
        } else System.out.println(num + " không phải là số nguyên tố");
    }
}
