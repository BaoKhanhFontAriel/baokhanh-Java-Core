public class FindString {
    public static int findStrBinStrA(String strA, String strB){
        if(strA.length() >= strB.length()){
            int limit = strA.length() - strB.length();
            for (int i = 0; i <= limit; i++){
                for (int j = 0; j < strB.length(); j++){
                    if(strA.charAt(i + j) != strB.charAt(j)){
                        break;
                    } else {
                        if (j == strB.length() - 1){
                            return i;
                        }
                    }
                }
            }
        }

        return -1;
    }
}
