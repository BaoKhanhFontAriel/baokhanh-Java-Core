
import java.util.Scanner;
public class ArrayInput{
    public void getInput(){
        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[5];
        for (int i = 0; i < inputs.length; i++){
            System.out.print("nhập số thứ " + (i + 1) +": ");
            inputs[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();

        for (int i : inputs){
            System.out.print(i + "\t");
        }

        System.out.println("\nphần tử số nguyên nhỏ nhất là: " + findMin(inputs));
        System.out.println("phần tử số nguyên lớn nhất là: " + findMax(inputs));
    }

    public int findMin(int[] inputs){
        int min = 0;
        for (int input : inputs){
            if (input < min){
                min = input;
            }
        }
        return min;
    }

    public int findMax(int[] inputs){
        int max = 0;
        for (int input : inputs){
            if (input > max){
                max = input;
            }
        }
        return max;
    }
}

