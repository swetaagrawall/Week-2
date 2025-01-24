
import java.util.ArrayList;

class Student{
   // static list to store subjects of a student
   private static ArrayList<Subject> subjects;
   private String name;
    private String grade;
  // constructor
    public Student(String name ) {
        this.name = name;
       this.subjects= new ArrayList<>();
    }
   //method to get subjects
    public ArrayList<Subject> getSubjects(){
        return subjects;
    }
    public void addSubjects(Subject subject){
       subjects.add(subject);
    }
    public void computeGrade(Student student) {
        GradeCalculator obj = new GradeCalculator();
        String g = obj.calculatorGrade(student);
        grade = g;
    }
    public void display(){
        System.out.println("Student name is "+ name);
        for(Subject subject :subjects){
            System.out.println("The subject is "+subject.getSubject()+" And marks is "+subject.getMarks());
        }
        System.out.println(" And the grade is "+ grade);
    }

}
class Subject{
    //attributes
    private String name;
    private int marks;
    //constructor

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public  String getSubject() {
        return  name;
    }

    public int getMarks() {
        return marks;
    }
}
class GradeCalculator{
    public  String calculatorGrade(Student student){
        int totalMarks=0;
        for(Subject subject : student.getSubjects()) {
            totalMarks += subject.getMarks();
        }
        // calculating average
        int average = totalMarks / student.getSubjects().size();
        String grade = "";
        // returns grade
        if(average >= 90){
            return grade + "A";
        }else if(average >= 80){
            return grade + "B";
        }else if(average >= 70){
            return grade + "C";
        }else if(average >= 60){
            return grade + "D";
        }else {
            return grade + "F";
        }
    }

}
public class SchoolResult {
    public static void main(String[] args) {
     Student s1= new Student("John" );
     Subject su1=new Subject("Maths" , 90);
     Subject su2=new Subject("Science" , 85);
     s1.addSubjects(su1);
     s1.addSubjects(su2);
     s1.getSubjects();
     s1.computeGrade(s1);
     s1.display();

    }
}
