import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<? extends Employee> waiters = new ArrayList<>();
        System.out.println("danh sách người phục vụ: ");
        waiters = Repository.getWaiters();
        print(waiters);

        System.out.println("danh sách đầu bếp: ");
        ArrayList<? extends Employee> cooks = new ArrayList<>();
        cooks = Repository.getKitchen();
        print(cooks);
    }

    public static void print(ArrayList<? extends Employee> employees){
        for (Object employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
