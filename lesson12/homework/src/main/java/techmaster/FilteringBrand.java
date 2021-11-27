package techmaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FilteringBrand {
    private static Map<String, Integer> map = new HashMap<>();
    public static void run(Scanner scanner){
        listBrand();
        getProduct(scanner);
    }


    public static void listBrand(){
        System.out.println("chọn 1 hãng: ");
        for (Product product : ProductRepository.getProducts()) {
            if (map.containsKey(product.getBrand())){
                map.put(product.getBrand(), map.get(product.getBrand()) + 1);
            } else  map.put(product.getBrand(),  1);
        }

        int index = 1;
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(index + " - " + entry.getKey() + " - " + entry.getValue() + " sản phẩm");
            index++;
        }
    }

    public static void getProduct(Scanner scanner){
        scanner.nextLine();
        System.out.print("bạn chọn: ");
        String brand = scanner.nextLine();


            for (Product product: ProductRepository.getProducts()) {
                if (product.getBrand().toLowerCase().equals(brand)){
                    System.out.println(product.toString());
                }
            }
    }
}
