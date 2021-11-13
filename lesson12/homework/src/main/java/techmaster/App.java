package techmaster;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ProductRepository.getData();
        menu();
    }

    public static void menu() {
        System.out.println("chọn 1 mục: ");
        System.out.println("1 - In thông tin dựa trên danh mục");
        System.out.println("2 - In thông tin các sản phẩm dựa theo hãng");
        System.out.println("3 - In thông tin sản phẩm dựa trên mức giá.");
        System.out.println("4 - Tìm kiếm sản phẩm");
        System.out.print("bạn chọn: ");
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        switch (menu) {
        case 1:
            FilteringCategory.run(scanner);
            break;
        case 2:
            FilteringBrand.run(scanner);
            break;
        case 3:
            FilteringPrice.run(scanner);
            break;
        case 4:
            SearchProduct.run(scanner);
            break;
        }
        scanner.close();
    }
}
