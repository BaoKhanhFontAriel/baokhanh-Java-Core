package lesson9;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        MovieRepository repo = new MovieRepository();
        ArrayList<Movie> movies = repo.getData();
        repo.printList(movies);
    }
}
