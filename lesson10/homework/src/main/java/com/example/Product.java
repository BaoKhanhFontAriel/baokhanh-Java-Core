package com.example;

import java.text.DecimalFormat;

public class Product {
    private int id;
    private String product_name;
    private int selling_price;
    private String category;
    private int inventory;
    private int number_of_sale;


    public Product(int id, String product_name, int selling_price, String category, int inventory, int number_of_sale) {
        this.id = id;
        this.product_name = product_name;
        this.selling_price = selling_price;
        this.category = category;
        this.inventory = inventory;
        this.number_of_sale = number_of_sale;
    }

    public Category getCategory() {
        return Category.getCategory(category);
    }

    public int getSelling_price() {
        return selling_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public int getId() {
        return id;
    }

    public int getInventory() {
        return inventory;
    }

    public int getNumberOfSales() {
        return number_of_sale;
    }

    public String format(int number){
        DecimalFormat df = new DecimalFormat("###,###,###");
        return df.format(number);
    }



    @Override
    public String toString() {
        return "mã sản phẩm: " + id + " - tên: " + product_name + " - giá bán: " + format(selling_price) + " - danh mục: " + getCategory().getValue() + " - số lượng: " + inventory + " - số lượng bán được: " + number_of_sale; 
    }
}
