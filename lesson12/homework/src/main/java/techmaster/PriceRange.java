package techmaster;

public enum PriceRange{
    SMALLER_2_MIL("Dưới 2 triệu"),
    FROM_2_TO_4_MIL("Từ 2 - 4 triệu"),
    FROM_4_TO_7_MIL("Từ 4 - 7 triệu"),
    FROM_7_TO_13_MIL("Từ 7 - 13 triệu"),
    BIGGER_13_MIL("Trên 13 triệu");

    private String value;

    PriceRange(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public static PriceRange getRange(int price){
        if (0 <= price && price < 2000000){
            return SMALLER_2_MIL;
        }
        else if (2000000 <= price && price < 4000000){
            return FROM_2_TO_4_MIL;
        }
        else if (4000000 <= price && price < 7000000){
            return FROM_4_TO_7_MIL;
        }
        else if (7000000 <= price && price < 13000000){
            return FROM_7_TO_13_MIL;
        }
        else if (price >= 13000000){
            return BIGGER_13_MIL;
        }
        return null;
    }
}
