public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Ertiga", "Red", "Maruti");
        Car car2 = new Car("XUV 500", "Black", "Mahindra");
        Car car3 = new Car("CX5", "White", "Mazda");

        System.out.println(car1.toString());
        car1.size(100);
        car1.speed(50);
        car1.brand("toyota");

        System.out.println(car2.toString());
        car2.size(200);
        car2.speed(100);
        car2.brand("toyota");

        System.out.println(car1.toString());
        car3.size(200);
        car3.speed(100);
        car3.brand("toyota");
    }
}
