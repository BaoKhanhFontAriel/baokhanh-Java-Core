package com.example;

import java.text.DecimalFormat;

public class Product {
    private int id;
    private String product_name;
    private int selling_price;
    private String category;
    private int inventory;
    private int sales_quantity;


    public Product(int id, String product_name, int selling_price, String category, int inventory, int number_of_sales) {
        this.id = id;
        this.product_name = product_name;
        this.selling_price = selling_price;
        this.category = category;
        this.inventory = inventory;
        this.sales_quantity = number_of_sales;
    }

    public Category getCategory() {
        return Category.getCategory(category);
    }

    public int getSellingPrice() {
        return selling_price;
    }

    public String getProductName() {
        return product_name;
    }

    public int getId() {
        return id;
    }

    public int getInventory() {
        return inventory;
    }

    public int getSalesQuantity() {
        return sales_quantity;
    }

    public String format(int number){
        DecimalFormat df = new DecimalFormat("###,###,###");
        return df.format(number);
    }



    @Override
    public String toString() {
        return "mã sản phẩm: " + id + " - tên: " + product_name + " - giá bán: " + format(selling_price) + " - danh mục: " + category + " - số lượng: " + inventory + " - số lượng bán được: " + sales_quantity;
    }
}
