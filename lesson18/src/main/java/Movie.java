import com.google.gson.annotations.SerializedName;

import java.text.DecimalFormat;

public class Movie {
    private int id;
    @SerializedName("movie_name")
    private String movie;
    @SerializedName("director ")
    private String director;
    private String genre;

    @SerializedName("category ")
    private Category category;
    private int views;
    @SerializedName("duration ")
    private int duration;

    public int getViews() {
        return views;
    }

    public int getDuration() {
        return duration;
    }

    public int getId() {
        return id;
    }

    public String getMovie() {
        return movie;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public Category getCategory() {
        return category;
    }

    public Movie(int id, String movie, String director, String genre, Category category) {
        this.id = id;
        this.movie = movie;
        this.director = director;
        this.genre = genre;
        this.category = category;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", tên phim: " + movie +
                ", đạo diễn: " + director +
                ", thể loại: " + genre +
                ", danh mục: " + category.getValue() +
                ", lượt xem: " + formatNumber(views) +
                ", độ đài: " + convertTime(duration);
    }

    public String convertTime(int time){
        int hours = time / 60;
        int minutes = time % 60;
        return hours + "h:" + minutes + "p";
    }

    public String formatNumber(int number){
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        return decimalFormat.format(number);
    }
}
