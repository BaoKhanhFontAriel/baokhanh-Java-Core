package techmaster;

public class Cook extends Employee{

    private int serviceCharge;

    public Cook(int id, String name, int age, int basicSalary, int serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = basicSalary;
    }

    @Override
    public int calculatorSalary() {
        return serviceCharge + basicSalary;
    }

    @Override
    public String toString() {
        return super.toString() + ", phí phục vụ: " + serviceCharge + ", tổng lương: " + format(calculatorSalary());
    }
}
