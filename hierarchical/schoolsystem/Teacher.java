package inheritance.hierarchical.schoolsystem;

public class Teacher extends  Person{
    private String subject;

    public Teacher(String name, int age,String role, String subject) {
        super(name, age , role);
        this.subject = subject;
    }
    public void displayRole(){
        System.out.println("Role : "+role);

    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Subject : "+subject);
        displayRole();
    }
}
