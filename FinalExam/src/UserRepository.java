import java.util.ArrayList;

public class UserRepository {
    public static ArrayList<User> getUsers() {
        return users;
    }

    private static ArrayList<User> users = new ArrayList<>();
    public static void getData(){
        users.add(new User("khanh123", "khanh123", "khanh@gmail.com"));
    }

    public static void addUser(User user){
        users.add(user);
    }
}
