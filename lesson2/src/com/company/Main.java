package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // 1
        String s = "học lập trình java không khó";

        //Lấy độ dài của chuỗi
        System.out.println("Độ dài của chuỗi: " + s.length());

        //viết in hoa tất cả các chữ k trong chuỗi
        String s_with_uppercase_k = s.replace('k', 'K');
        System.out.println("viết in hoa tất cả các chữ k trong chuỗi: " + s_with_uppercase_k);

        //Thay thế chữ "khó" thành chữ "dễ"
        String s_replace_word = s.replace("khó", "dễ");
        System.out.println("Thay thế chữ \"khó\" thành chữ \"dễ\": " + s_replace_word);

        //Tìm index của ký tự 'j' trong chuỗi
        System.out.println("index của ký tự 'j' trong chuỗi: " + s.indexOf('j'));

        // 2
        Day day = Day.FRIDAY;
        System.out.println(Day.THURSDAY);
        System.out.println(Day.FRIDAY +" : "+day.getValue());


        //bonus
        String s2 = "học lập trình java không khó";

        // Viết hoa chứ cái dầu của chuỗi
        String s2_first_char = s2.substring(0, 1).toUpperCase();

        // viết hoa chữ cái cuối cùng của chuỗi
        String s2_last_char = s2.substring(s.length() - 1).toUpperCase();

        // tách chứ cái dầu và chữ cái cuối khỏi chuỗi
        String s2_no_first_last = s2.substring(1, s2.length() - 1);

        // hợp nhất để tạo ra chuỗi có chữ cái đàu và cuối viết hoa
        String new_s2 = s2_first_char + s2_no_first_last + s2_last_char;
        System.out.println("chuỗi có chữ cái đàu và cuối viết hoa: "+ new_s2);

        char c1 = s.charAt(0);
        char c_last = s.charAt(s.length() - 1);
    }
}
