package encapsulationandpolymorphism.employeemanagementsystem;

public class FullTimeEmployee extends Employee {
    private int extraHours;
    private int amount;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, int extraHours, int amount) {
        super(employeeId, name, baseSalary);
        this.extraHours = extraHours;
        this.amount = amount;
    }

    @Override
    void calculateSalary() {
        double ans = getBaseSalary() + (extraHours * amount);
        setBaseSalary(ans);

    }


}
