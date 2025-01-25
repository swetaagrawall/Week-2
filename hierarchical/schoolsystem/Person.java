package inheritance.hierarchical.schoolsystem;

public class Person {
    private String name;
    private int age;
    protected String role;

    public Person(String name, int age ,String role) {
        this.name = name;
        this.age = age;
        this.role=role;
    }
    public void displayDetails(){
        System.out.println("Name :"+name+"\nAge : "+age);
    }

}
