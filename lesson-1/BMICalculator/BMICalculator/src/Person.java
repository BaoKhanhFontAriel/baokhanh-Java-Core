public class Person {
    String name;
    double weight;
    double height;

    void printBMI(){
        System.out.println("ket qua BMI cua " + name + " : " + weight / (height * height));
    }
}
