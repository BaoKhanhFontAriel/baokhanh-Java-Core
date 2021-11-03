package lesson9;

import com.google.gson.annotations.SerializedName;

public class Movie {
    int id;
    String title;
    String genre;

    @SerializedName("running_time")
    int runningTime;    

    @SerializedName("production_company")
    String productionCompany;

    @SerializedName("release_year")
    int releaseYear;

    public Movie(int id, String title, String genre, int runningTime, String productionCompany, int releaseYear) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.runningTime = runningTime;
        this.productionCompany = productionCompany;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + genre + " - " + convertToHour(runningTime) + " - " + productionCompany + " - "
                + releaseYear;
    }

    public String convertToHour(int number) {
        int hours = number / 60;
        int minutes = number % 60;
        String runningTime = String.format("%d:%02d", hours, minutes);
        return runningTime;
    }
}
