package techmaster;

import com.google.gson.annotations.SerializedName;

public enum Category {

    @SerializedName("ĐIỆN_THOẠI")
    SMARTPHONE("điện thoại"),
    @SerializedName("LAPTOP")
    LAPTOP("Laptop"), 
    @SerializedName("APPLE")
    APPLE("Apple"),
    @SerializedName("PHỤ_KIỆN")
    ACCESSORIES("Phụ kiện");

    private String value;
    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
