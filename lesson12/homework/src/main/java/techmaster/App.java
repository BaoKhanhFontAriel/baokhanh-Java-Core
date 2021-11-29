package techmaster;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ProductRepository.getData();


         Scanner scanner = new Scanner(System.in);
        hashMap(scanner);
//         menu(scanner);
         scanner.close();
    }

    public static void hashMap(Scanner scanner){
        System.out.println("A - Liệt kê mỗi danh mục có bao nhiêu sản phẩm: ");
        FilteringCategory.listCategory();
        System.out.println("B - Liệt kê mỗi hãng có bao nhiêu sản phẩm: ");
        FilteringBrand.listBrand();
        System.out.println("C - Tìm sản phẩm theo tên, liệt kê số lượng sản phẩm tìm được và in thông tin các sản phẩm đó ra màn hình");
        SearchProduct.run(scanner);
    }

//    public static void menu(Scanner scanner) {
//        System.out.println("chọn 1 mục: ");
//        System.out.println("1 - In thông tin dựa trên danh mục");
//        System.out.println("2 - In thông tin các sản phẩm dựa theo hãng");
//        System.out.println("3 - In thông tin sản phẩm dựa trên mức giá.");
//        System.out.println("4 - Tìm kiếm sản phẩm");
//        System.out.print("bạn chọn: ");
//        int menu = scanner.nextInt();
//        switch (menu) {
//        case 1:
//            FilteringCategory.menu(scanner);
//            break;
//        case 2:
//            FilteringBrand.run(scanner);
//            break;
//        case 3:
//            FilteringPrice.run(scanner);
//            break;
//        case 4:
//            SearchProduct.run(scanner);
//            break;
//        }
//    }
}
