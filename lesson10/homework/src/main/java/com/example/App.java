package com.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    private static ProductRepository repo = new ProductRepository();

    public static void main(String[] args) {
        repo.getData();
        menu();
    }

    public static void menu() {
        System.out.println("hãy lựa chọn 1 mục trong menu dưới đây: ");
        System.out.println(
                "1 - In thông tin tất cả sản phẩm ra màn hình\n2 - In thông tin các sản phẩm có giá lớn hơn 100.000\n3 - Sắp xếp sản phẩm theo số lượng bán được\n4 - Lấy ra sản phẩm bán chạy nhất\n5 - In thông tin sản phẩm theo danh mục: Đồ gia dụng, Thời trang, Mỹ phẩm, Thực phẩm\n6 - Tìm kiếm sản phẩm theo tên\n0 - Thoát chương trình\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("bạn chọn: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                repo.printProducts();
                break;
            case 2:
                repo.sellingPriceMoreThan100000();
                break;
            case 3:
                repo.sortNumberOfSales();
                repo.printProducts();
                break;
            case 4:
                repo.getBestseller();
                break;
            case 5:
                repo.sortCategory();
                break;
            case 6:
                scanner.nextLine();
                System.out.print("tên sản phẩm cần tìm: ");
                String name = scanner.nextLine();
                repo.search(name);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("số bạn chọn không hơp lệ");
                break;
        }
        scanner.close();
    }
}
