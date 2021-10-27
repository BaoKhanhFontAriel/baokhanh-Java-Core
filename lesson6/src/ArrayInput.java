
import java.util.Scanner;
public class ArrayInput{
    public void getInput(int[] inputs){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < inputs.length; i++){
            System.out.print("nhập số thứ " + (i + 1) +": ");
            inputs[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public void show(int[] inputs){
        for (int i : inputs){
            System.out.print(i + "\t");
        }
    }

    public void findMin(int[] inputs){
        int min = inputs[0];
        for (int input : inputs){
            if (input < min){
                min = input;
            }
        }
        System.out.println("\nphần tử số nguyên nhỏ nhất là: " + min);
    }

    public void findMax(int[] inputs){
        int max = inputs[0];
        for (int input : inputs){
            if (input > max){
                max = input;
            }
        }
        System.out.println("phần tử số nguyên lớn nhất là: " +  max);
    }
}

