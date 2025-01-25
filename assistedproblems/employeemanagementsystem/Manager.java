package inheritance.assistedproblems.employeemanagementsystem;

public class Manager extends Employee{
    private int teamSize;
    public Manager(String name,int id,double salary,int teamSize){
        super(name, id, salary);
        this.teamSize=teamSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name of manager is : "+name);
        System.out.println("Id of manager is : "+id);
        System.out.println("Salary of manager is : "+salary);
        System.out.println("Team size of manager is : "+teamSize);
        System.out.println("=================================");
    }
}
