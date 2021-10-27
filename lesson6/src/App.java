
public class App {
    public static void main(String[] args) throws Exception {
        // 1
        int[] inputs = new int[5];
        // ArrayInput arrayInput = new ArrayInput();
        // arrayInput.getInput(inputs);
        // arrayInput.show(inputs);
        // arrayInput.findMin(inputs);
        // arrayInput.findMax(inputs);

        // 2
        Vehicle[] vehicles = new Vehicle[3];
        VehicleInput vehicleInput = new VehicleInput();
        vehicleInput.getInput(vehicles);
        vehicleInput.show(vehicles);
    }
}
