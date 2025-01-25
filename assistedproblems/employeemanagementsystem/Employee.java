package inheritance.assistedproblems.employeemanagementsystem;

public class Employee {
    protected String name;
    protected int id;
    protected double salary;
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Name of employee is : "+name);
        System.out.println("Id of employee is : "+id);
        System.out.println("Salary of employee is : "+salary);
        System.out.println("=================================");
    }
}
