public class Question4{
    public static void run(){
        System.out.println("câu 4: ");
        String str = "You only live once, but if you do it right, once is enough";
        countWords(str);
        countO(str);
    }

    public static void countWords(String str){
        int count = 0;
        for (int i = 0 ; i < str.length(); i ++){
            if (str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("số từ trong chuỗi là: " + count);
    }

    public static void countO(String str){
        int count = 0;
        String index = "";
        for (int i = 0 ; i < str.length(); i ++){
            if (str.charAt(i) == 'o'){
                count++;
                index += i + ", ";
            }
        }
        System.out.println("số kí tự o chuỗi là: " + count);
        System.out.println("index của o là: " + index);
    }
}