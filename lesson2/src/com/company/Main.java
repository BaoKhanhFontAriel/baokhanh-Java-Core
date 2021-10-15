package com.company;

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

    }
}
