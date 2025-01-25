package inheritance.multilevel.educationalcoursehierarchy;

public class Course {
    private String courseName;
    private int duration;
    public Course(String courseName,int duration){
        this.courseName=courseName;
        this.duration=duration;
    }
    public void display(){
        System.out.println("Course name : "+courseName);
        System.out.println("Course duration : "+duration+"months");
    }
}
