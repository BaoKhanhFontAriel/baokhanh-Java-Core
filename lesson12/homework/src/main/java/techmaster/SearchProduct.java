package techmaster;

import java.util.*;

public class SearchProduct {
    public static void run(Scanner scanner){
        System.out.print("nhập tên sản phẩm cần tìm: ");
        String searchWord = scanner.nextLine();
        search(searchWord);
    }

    public static void search(String searchWord){
        ArrayList<Product> listFoundProduct = new ArrayList<>();
        for (Product product:
             ProductRepository.getProducts()) {
            if (product.getName().toLowerCase().contains(searchWord.toLowerCase())){
                listFoundProduct.add(product);
            }
        }

        System.out.println("tìm được " + listFoundProduct.size() + " sản phẩm có chứa \"" + searchWord + "\"");

        for (Product product: listFoundProduct
             ) {
            System.out.println(product.toString());
        }
    }
}
