package inheritance.assistedproblems.employeemanagementsystem;

public class Developer extends Employee{
    private int projects;
    public Developer(String name,int id,double salary,int projects){
        super(name, id, salary);
        this.projects=projects;
    }
    @Override
    public void displayDetails() {
        System.out.println("Name of developer is : "+name);
        System.out.println("Id of developer is : "+id);
        System.out.println("Salary of developer is : "+salary);
        System.out.println("Projects compleated : "+projects);
        System.out.println("=================================");
    }
}
