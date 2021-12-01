import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static ArrayList<Movie> movies;
    public static void main(String[] args){
        movies = MovieRepository.getData();
        showAllMovies();
        showHighestViews();
        sortCategory();
        sortGenre();
    }

    public static void showAllMovies(){
        System.out.println("Hiển thị tất cả các bộ phim: ");
        movies.forEach(System.out::println);
    }

    public static void showHighestViews(){
        System.out.println("3 phim có lượt xem cao nhất: ");
        movies.stream()
                .sorted(((o1, o2) -> o2.getViews() - o1.getViews())).limit(3)
                .forEach(System.out::println);
    }

    public static void sortCategory(){
        System.out.println("Liệt kê phim theo category");
        System.out.println("movie: ");
        movies.stream()
                .filter(movie -> movie.getCategory() == Category.MOVIE)
                .forEach(System.out::println);
        System.out.println("TV show: ");
        movies.stream()
                .filter(movie -> movie.getCategory() == Category.TV_SHOW)
                .forEach(System.out::println);
    }

    public static void sortGenre(){
        System.out.println("Liệt kê phim theo thể loại: ");
        System.out.print("nhập thể loại cần tìm: ");
        Scanner scanner = new Scanner(System.in);
        String genre = scanner.nextLine();

        ArrayList<Movie> foundMovies = (ArrayList<Movie>) movies.stream()
                .filter(movie -> movie.getGenre().toLowerCase().contains(genre))
                .collect(Collectors.toList());

        if (!foundMovies.isEmpty()){
            foundMovies.forEach(System.out::println);
        } else System.out.println("không tìm thấy phim thuộc thể loại này!");

        scanner.close();
    }
}
