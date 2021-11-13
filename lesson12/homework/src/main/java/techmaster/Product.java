package techmaster;

import com.google.gson.annotations.SerializedName;

public class Product {
    private int id;
    private String name;
    private String description;
    private int price;
    @SerializedName("quantity")
    private int inventory;
    private int quantitySold;
    private String brand;
    private Category category;

    public Product(int id, String name, String description, int price, int inventory, int quantitySold, String brand,
            Category category) {
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.setPrice(price);
        this.setInventory(inventory);
        this.setQuantitySold(quantitySold);
        this.setBrand(brand);
        this.setCategory(category);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Mã SP: "+ id 
        + ", tên: " + name 
        + ", mô tả: " + description 
        + ", giá: " + price 
        + ", số lượng: " + inventory 
        + ", số lượng bán: " + quantitySold 
        + ", hãng: " + brand 
        + ", danh mục: " + category.getValue();
    }
}
