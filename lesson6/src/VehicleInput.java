import java.util.Scanner;

public class VehicleInput{
    public static void run(Scanner scanner){
        Vehicle[] vehicles = new Vehicle[3];
        getInput(vehicles, scanner);
        show(vehicles);
    }
    public static void getInput(Vehicle[] listVehicle, Scanner scanner){
        for (int i = 0; i < listVehicle.length; i++){
            System.out.println("nhập phương tiện thứ " + (i + 1) + " : ");
            System.out.print("mã: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("tên: ");
            String name = scanner.nextLine();
            System.out.print("vận tốc tối đa: ");
            int maxSpeed = scanner.nextInt();
            listVehicle[i] = new Vehicle(id, name, maxSpeed);
        }
    }

    public static void show(Vehicle[] listVehicle){

        for (Vehicle vehicle: listVehicle){
            System.out.println(vehicle.toString());
        }
    }
}