package com.example;

import com.google.gson.annotations.SerializedName;

public enum Category {
    @SerializedName("đồ gia dụng")
    HOME_APPLIANCES("đồ gia dụng"),
    @SerializedName("thời trang")
    FASHION("thời trang"),
    @SerializedName("mỹ phẩm")
    COSMETICS("mỹ phẩm"),
    @SerializedName("thực phẩm")
    FOOD("thực phẩm");

    private String value;
    Category(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
