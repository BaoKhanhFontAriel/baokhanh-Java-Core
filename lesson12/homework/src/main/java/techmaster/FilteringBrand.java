package techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class FilteringBrand {
    static ArrayList<String> brandList = new ArrayList<String>();
    public static void run(Scanner scanner){
        getBrands();
        showBrands();
        getProduct(scanner);
    }

    public static void getBrands(){
        for (Product product : ProductRepository.getProducts()) {
            if (!brandList.contains(product.getBrand())){
                brandList.add(product.getBrand());
            }
        }
    }

    public static void showBrands(){
        System.out.println("chọn 1 hãng: ");
        int index = 0;
        for (String brand: brandList){
            System.out.println(index + " - " + brand);
            index++;
        } 
    }

    public static void getProduct(Scanner scanner){
        System.out.print("bạn chọn: ");
        int index = scanner.nextInt();

        if (index >= 0 && index <= 6){
            String brand = brandList.get(index);
            for (Product product: ProductRepository.getProducts()) {
                if (product.getBrand().equals(brand)){
                    System.out.println(product.toString());
                }
            }
        }
        else System.out.println("hãng không tồn tại");
    }
}
