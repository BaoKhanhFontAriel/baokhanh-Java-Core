package com.company;

public enum Day {
    MONDAY("Thứ hai"),
    TUESDAY("Thứ ba"),
    WEDNESDAY("Thứ tư"),
    THURSDAY("Thứ năm"),
    FRIDAY("Thứ sáu"),
    SATURDAY("Thứ bảy"),
    SUNDAY("Chủ nhật");

    private String value;

    private Day(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

