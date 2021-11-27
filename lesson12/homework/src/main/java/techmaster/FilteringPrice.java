package techmaster;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FilteringPrice {
    public static void run(Scanner scanner) {
        System.out.println("chọn 1 mức giá: ");
        System.out.println("1 - Dưới 2 triệu");
        System.out.println("2 - Từ 2 - 4 triệu");
        System.out.println("3 - Từ 4 - 7 triệu");
        System.out.println("4 - Từ 7 - 13 triệu");
        System.out.println("5 - Trên 13 triệu");
        System.out.print("bạn chọn: ");
        int number = scanner.nextInt();
        switch (PriceRange.getRange(number)) {
            case SMALLER_2_MIL:
            showProductFrom(PriceRange.SMALLER_2_MIL);
            break;
            case FROM_2_TO_4_MIL:
            showProductFrom(PriceRange.FROM_2_TO_4_MIL);
            break;
            case FROM_4_TO_7_MIL:
            showProductFrom(PriceRange.FROM_4_TO_7_MIL);
            break;
            case FROM_7_TO_13_MIL:
            showProductFrom(PriceRange.FROM_7_TO_13_MIL);
            break;
            case BIGGER_13_MIL:
            showProductFrom(PriceRange.BIGGER_13_MIL);
            break;
        }
    }

    public static void listPrice(){
        Map<PriceRange, Integer> map = new HashMap<>();

        for (Product product : ProductRepository.getProducts()) {
            PriceRange priceRange = PriceRange.getRange(product.getPrice());
            if (map.containsKey(priceRange)){
                map.put(priceRange, map.get(priceRange) + 1);
            } else  map.put(priceRange,  1);
        }

        for(Map.Entry<PriceRange, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey().getValue() + " - " + entry.getValue() + " sản phẩm");
        }
    }

    public static void showProductFrom(PriceRange range) {
        for (Product product : ProductRepository.getProducts()) {
            if (PriceRange.getRange(product.getPrice()).equals(range)) {
                System.out.println(product.toString());
            }
        }
    }
}
