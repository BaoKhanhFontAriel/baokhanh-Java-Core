public class FindE{
    public static void findE(String str){
        int countE = 0;
        String indicesOfE = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e'){
                    countE++;
                    indicesOfE += i + ", ";
            }
        }
        System.out.println("e xuất hiện: " + countE + " lần");
        System.out.println("Ở các vị trí: " + indicesOfE);
    } 
}