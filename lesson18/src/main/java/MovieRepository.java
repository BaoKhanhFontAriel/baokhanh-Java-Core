import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class MovieRepository {
    private static ArrayList<Movie> movies = new ArrayList<>();
    public static ArrayList<Movie> getData(){
        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader("Movie.json");
            Type objectType = new TypeToken<ArrayList<Movie>>(){}.getType();
            movies = gson.fromJson(reader, objectType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return movies;
    }
}
