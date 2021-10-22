public class LongestWord {
    public static String longestWord(String input) {
        String currentWord = "";
        String longestWord = "";
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' '){
                if(currentWord.length() > longestWord.length()){
                    longestWord = currentWord;
                }
                currentWord = "";
            }
            else {
                currentWord += input.charAt(i);
            }
        }
        return longestWord;
      }
}
