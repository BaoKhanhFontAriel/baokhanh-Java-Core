public class Car {
    String model;String color; String brand;

    public Car(String model, String color, String brand) {
        this.model = model;
        this.color = color;
        this.brand = brand;
    }

    public void speed(int speed) {
        System.out.println("vận tốc: " + speed + " km/h");
    }

    public void size(int size) {
        System.out.println("kích cỡ: "+size);
    }

    public void brand(String brand) {
        System.out.println("hãng: "+brand);
    }

    @Override
    public String toString() {
        return model + " - " + color + " - " + brand;
    }

}
