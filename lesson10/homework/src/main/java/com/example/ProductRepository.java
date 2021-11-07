package com.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductRepository {
    private ArrayList<Product> products;

    public void getData() {
        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader("product.json");
            Type objectType = new TypeToken<ArrayList<Product>>() {
            }.getType();
            products = gson.fromJson(reader, objectType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printProducts() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void sellingPriceMoreThan100000() {
        for (Product product : products) {
            if (product.getSellingPrice() > 100000) {
                System.out.println(product.toString());
            }
        }
    }

    public void sortNumberOfSales() {
        Collections.sort(products, new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getSalesQuantity() - o1.getSalesQuantity();
            }
        });
    }

    public void sortCategory() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return getCategoryOrder(o2.getCategory()) - getCategoryOrder(o1.getCategory());
            }
        });

        printProducts();
    }

    public int getCategoryOrder(Category category){
        switch (category){
            case HOME_APPLIANCES: return 4;
            case FASHION: return 3;
            case COSMETICS: return 2;
            case FOOD: return 1;
        }
        return -1;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void getBestseller() {
        sortNumberOfSales();
        System.out.println(products.get(0).toString());
    }

    public void search(String name){
        boolean isFound = false;
        for (Product product : products){
            if (product.getProductName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(product.toString());
                isFound = true;
            }
        }

        if (!isFound){
            System.out.println("sản phẩm không tồn tại!");;
        }
    }
}
