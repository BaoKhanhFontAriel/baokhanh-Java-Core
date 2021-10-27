import java.util.Scanner;

public class VehicleInput{
    public void getInput(Vehicle[] listVehicle){
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();
    }

    public void show(Vehicle[] listVehicle){

        for (Vehicle vehicle: listVehicle){
            System.out.println(vehicle.toString());
        }
    }
}