
import java.text.DecimalFormat;

public abstract class Employee {
    int id;
    String name;
    int age;
    int basicSalary;

    public Employee(int id, String name, int age, int basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public abstract int calculatorSalary();
    
    @Override
    public String toString() {
        return "id: " + id + ", tên: " + name + ", tuổi: " + age + ", lương cơ bản: " + format(basicSalary);
    }

    public String format(int salary){
        DecimalFormat df = new DecimalFormat("###,###,###");
        return df.format(salary) + " VND"; 
    }
}
