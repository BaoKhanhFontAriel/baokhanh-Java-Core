
public class Waiter extends Employee {

    private int compensate;
    public Waiter(int id, String name, int age, int basicSalary, int compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    @Override
    public int calculatorSalary() {
        return basicSalary + compensate;
    }

    @Override
    public String toString() {
        return super.toString() + ", thưởng: " + compensate +", tổng lương: " + format(calculatorSalary());
    }
}