package techmaster;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class FilteringCategory {
    public static void listCategory(){
        Map<Category, Integer> map = new HashMap<>();
        for (Product product : ProductRepository.getProducts()) {
            if (map.containsKey(product.getCategory())){
                map.put(product.getCategory(), map.get(product.getCategory()) + 1);
            } else  map.put(product.getCategory(),  1);
        }

        for(Map.Entry<Category, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey().getValue() + " - " + entry.getValue() + " sản phẩm");
        }
    }

    public static void menu(Scanner scanner){
        System.out.println("chọn 1 danh mục: ");
        System.out.println("1 - Điện thoại");
        System.out.println("2 - Laptop");
        System.out.println("3 - Apple");
        System.out.println("4 - Phụ kiện");
        System.out.print("bạn chọn: ");
        int category = scanner.nextInt();
        scanner.nextLine();
        switch (category) {
        case 1:
            showProductOf(Category.SMARTPHONE);
            break;
        case 2:
            showProductOf(Category.LAPTOP);
            break;
        case 3:
            showProductOf(Category.APPLE);
            break;
        case 4:
            showProductOf(Category.ACCESSORIES);
            break;
        }
    }

    public static void showProductOf(Category category) {
        for (Product product : ProductRepository.getProducts()) {
            if (product.getCategory() == category) {
                System.out.println(product.toString());
            }
        }
    }
}
