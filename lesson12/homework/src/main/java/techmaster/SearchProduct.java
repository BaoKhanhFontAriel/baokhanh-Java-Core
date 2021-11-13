package techmaster;

import java.util.Scanner;

public class SearchProduct {
    public static void run(Scanner scanner){
        scanner.nextLine();
        System.out.print("nhập tên sản phẩm cần tìm: ");
        String searchWord = scanner.nextLine();
        search(searchWord);
    }

    public static void search(String searchWord){
        for (Product product:
             ProductRepository.getProducts()) {
            if (product.getName().toLowerCase().contains(searchWord.toLowerCase())){
                System.out.println(product.toString());
            }
        }
    }
}
