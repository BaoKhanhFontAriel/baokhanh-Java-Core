package com.example;

public enum Category {
    HOME_APPLIANCES("đồ gia dụng"),
    FASHION("thời trang"),
    COSMETICS("mỹ phẩm"),
    FOOD("thực phẩm");

    private String value;
    Category(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public static Category getCategory(String value){
        for (Category s : Category.values()){
            if(s.getValue().equals(value)){
                return s;
            }
        }
        return null;
    }
}
