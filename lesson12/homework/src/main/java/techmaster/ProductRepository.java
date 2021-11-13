package techmaster;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ProductRepository {

    private static ArrayList<Product> productsList;
    public static void getData(){
        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader("product.json");
            Type objectType = new TypeToken<ArrayList<Product>>() {}.getType();
            productsList = gson.fromJson(reader, objectType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Product> getProducts() {
        return productsList;
    }
}
