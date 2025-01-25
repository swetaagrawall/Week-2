package inheritance.hierarchical.schoolsystem;

public class SchoolSystem {
    public static void main(String[] args) {
        Person p;
        p=new Teacher("Manish" , 42 , "Teaching" ,"Physics");
        p.displayDetails();
        System.out.println();
        p=new Student("Sweta", 22 , "Study" ,"A+");
        p.displayDetails();
        System.out.println();
        p=new Staff("Ankita" ,35,"Management" , 45000);
        p.displayDetails();
    }
}
