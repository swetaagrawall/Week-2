package inheritance.assistedproblems.employeemanagementsystem;

public class Intern extends Employee{
    private int assignments;
    public Intern(String name,int id,double salary,int assignments){
        super(name, id, salary);
        this.assignments=assignments;
    }
    @Override
    public void displayDetails() {
        System.out.println("Name of intern is : "+name);
        System.out.println("Id of intern is : "+id);
        System.out.println("Salary of intern is : "+salary);
        System.out.println("Number of assignments : "+assignments);
        System.out.println("=================================");

    }
}
