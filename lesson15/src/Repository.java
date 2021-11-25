import java.util.ArrayList;

public class Repository {
    private static ArrayList<Waiter> waiters = new ArrayList<Waiter>();
    private static ArrayList<Kitchen> kitchens = new ArrayList<Kitchen>();

    public static ArrayList<Waiter> getWaiters(){
       waiters.add(new Waiter(1, "Minh", 22, 3000000, 100000));
       waiters.add(new Waiter(2, "Nga", 21, 3000000, 200000));
       waiters.add(new Waiter(3, "Lan", 20, 3000000, 300000));
        return waiters;

    }

    public static ArrayList<Kitchen> getKitchen(){
        kitchens.add(new Kitchen(1, "Linh", 26, 6000000, 200000));
        kitchens.add(new Kitchen(2, "John", 30, 6000000, 1000000));
        kitchens.add(new Kitchen(3, "Lam", 34, 6000000, 3000000));
        return kitchens;
    }
}
