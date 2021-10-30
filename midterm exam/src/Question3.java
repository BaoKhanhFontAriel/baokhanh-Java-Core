import java.util.Scanner;

public class Question3 {
    public static void run(){
        System.out.println();
        System.out.println("câu 3: ");

        Scanner scanner = new Scanner(System.in);
        // chuẩn hóa chuỗi 
        System.out.print("nhập tên của bạn: ");
        String name = scanner.nextLine();
        standardize(name);

        System.out.print("nhập chuỗi bất kì: ");
        String phrase = scanner.nextLine();
        isPalindrome(phrase);
    }

    public static void standardize(String str){
        System.out.println("chuỗi cũ: " + str);
        // eliminate leading and trailing spaces 
        str = str.trim();

        // remove redundant spaces between word
        str = str.replaceAll("\\s+", " ");

        // uppercase the first character and lowercase the rest
        str = capitalizeLetter(str);

        System.out.println("chuỗi sau khi chuẩn hóa: " + str);
    } 

    public static String capitalizeLetter(String str){
        char[] chars = str.toCharArray();
        String newStr = "";
        for (int i = 0; i < chars.length; i++){
            if (i == 0){
                chars[i] = Character.toUpperCase(chars[i]);
            }
            else chars[i] = Character.toLowerCase(chars[i]);
            newStr += chars[i];
        }
        return newStr;
    }

    public static void isPalindrome(String str){
        boolean isPal = true;
        for (int i = 0; i <= str.length() / 2;i++){
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                    isPal = false;
                    break;
                }
        }

        if (isPal){
            System.out.println(str + " là chuỗi Palindrome");
        }
        else {
            System.out.println(str + " không phải là chuỗi Palindrome");
        }
    } 
}
