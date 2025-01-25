package inheritance.hierarchical.schoolsystem;

public class Staff extends  Person{
    private double salary;

    public Staff(String name, int age,String role, double salary) {
        super(name, age ,role);
        this.salary = salary;
    }

    public void displayRole(){
        System.out.println("Role : "+role);

    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Salary : "+salary);
        displayRole();
    }
}
