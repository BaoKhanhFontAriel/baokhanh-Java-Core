package techmaster;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cook cook = new Cook(1, "John", 25, 6000000, 2000000);
        System.out.println(cook.toString());

        Waiter waiter = new Waiter(2, "Minh", 22, 3000000, 100000);
        System.out.println(waiter.toString());
    }
}
