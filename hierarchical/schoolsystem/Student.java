package inheritance.hierarchical.schoolsystem;

public class Student extends  Person{
    private String grade;

    public Student(String name, int age,String role, String grade) {
        super(name, age , role);
        this.grade = grade;
    }

    public void displayRole(){
        System.out.println("Role : "+role);
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("grade : "+grade);
        displayRole();
    }
}
