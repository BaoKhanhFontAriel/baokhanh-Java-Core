package techmaster;

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
        switch (number) {
        case 1:
            showPruductFrom(0, 2 * (int) Math.pow(10, 6));
            break;
        case 2:
            showPruductFrom(2 * (int) Math.pow(10, 6), 4 * (int) Math.pow(10, 6));
            break;
        case 3:
            showPruductFrom(4 * (int) Math.pow(10, 6), 7 * (int) Math.pow(10, 6));
            break;
        case 4:
            showPruductFrom(7 * (int) Math.pow(10, 6), 13 * (int) Math.pow(10, 6));
            break;
        case 5:
            showPruductFrom(13 * (int) Math.pow(10, 6), Integer.MAX_VALUE);
            break;
        }
    }

    public static void showPruductFrom(int beginPrice, int endPrice) {
        for (Product product : ProductRepository.getProducts()) {
            if (product.getPrice() >= beginPrice && product.getPrice() < endPrice) {
                System.out.println(product.toString());
            }
        }
    }
}
