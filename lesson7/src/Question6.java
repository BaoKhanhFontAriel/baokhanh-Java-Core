public class Question6 {
    public static void run(){
        System.out.println("câu 6: ");

        String email1 = "baokhanh1111@gmail.com";
        validateEmail(email1);
        String email2 = "baokhanh.gmail.com";
        validateEmail(email2);
    }

    public static void validateEmail(String email){
        if (isEmail(email)){
            System.out.println(email + " hợp lệ");
        } else System.out.println(email + " không hợp lệ");
    }

    public static boolean isEmail(String email) {
        String regex = "^(.+)@(.+)$";       
        return email.matches(regex);
    }
}
