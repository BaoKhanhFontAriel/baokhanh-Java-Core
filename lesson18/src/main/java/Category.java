import com.google.gson.annotations.SerializedName;

public enum Category {
    @SerializedName("Tv show")
    TV_SHOW("TV show"),

    @SerializedName("Movie")
    MOVIE("Movie");

    private String value;
    Category(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
