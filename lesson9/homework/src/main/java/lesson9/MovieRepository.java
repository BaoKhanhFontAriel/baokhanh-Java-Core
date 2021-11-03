package lesson9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MovieRepository{
    
    public ArrayList<Movie> getData(){
        ArrayList<Movie> movies = new ArrayList<Movie>();

        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader("movie.json");
            Type objectType = new TypeToken<ArrayList<Movie>>(){}.getType();

            movies = gson.fromJson(reader, objectType);
        }
        catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file");
        }
        
        return movies;
    }

    public void printList(ArrayList<Movie> list){
        for (Movie p: list) {
                System.out.println(p);
            }
    }
}