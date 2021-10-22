public class App {
    public static void main(String[] args) throws Exception {
        // 1
        FindE.findE("Hello every one");

        // 2
        String strA = "Thằng Bờm có cái quạt mo. Phú ông xin đổi ba bò, chín trâu";
        String strB = "Phú ông";
        System.out.println("Vị trí được tìm thấy: " + FindString.findStrBinStrA(strA, strB));

        //3
        String phrase = "Không có gì quý hơn độc lập tự do";
        System.out.println("Từ dài nhất trong chuỗi là: " + LongestWord.longestWord(phrase));
        String phrase2 = "The best studied member of the river’s distinctive ecosystem is the humpback chub, a creature as bizarre as fish come";
        System.out.println("Từ dài nhất trong chuỗi là: " + LongestWord.longestWord(phrase2));
    }
}
