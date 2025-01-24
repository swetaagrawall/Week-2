import java.util.ArrayList;

class School{
    private String schoolName;
    private ArrayList<Student> students;
    public School(String schoolName){
        this.schoolName=schoolName;
        students=new ArrayList<>();
    }
    public void addStudentInSchool(Student student){
        students.add(student);
        System.out.println("Student "+student.getStudentName()+" added");
    }
    public void displaySchoolAndStudents(){
        System.out.println("School is "+schoolName);
        System.out.println("Students : ");
        for(Student student:students){
            student.displayCoursesOfStudent();
            System.out.println("===============");
        }
    }

}
class Student{
    private String studentName;
    private ArrayList<Course> courses;
    public Student(String studentName){
        this.studentName=studentName;
        courses=new ArrayList<>();
    }
    public String getStudentName(){
        return studentName;
    }
    public ArrayList<Course> getCourses(){
        return courses;
    }
    public void addCourse(Course course){
        courses.add(course);
        System.out.println("Course "+course.getCourseName()+" added");
    }
    public void displayCoursesOfStudent(){
        System.out.println("Student's name : "+studentName);
        System.out.println("Courses : ");
        for(Course course:courses){
            System.out.println(course.getCourseName());
        }
    }
}
class Course{
    private String courseName;
    private ArrayList<Student> students;
    public Course(String courseName){
        this.courseName=courseName;
        students=new ArrayList<>();
    }
    public String getCourseName(){
        return courseName;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student "+student.getStudentName()+" added");
    }
    public void displayStudentsInCourse(){
        System.out.println("Course is "+courseName);
        System.out.println("Students : ");
        for(Student student:students){
            System.out.println(student.getStudentName());
        }
    }
}
public class SchoolManagement {
    public static void main(String[] args) {
        School school=new School("TIT School");
        Student student1=new Student("Alice");
        Student student2=new Student("Bob");
        Student student3=new Student("Charlie");
        Student student4=new Student("David");
        Student student5=new Student("Eric");
        Student student6=new Student("Frank");
        school.addStudentInSchool(student1);
        school.addStudentInSchool(student2);
        Course course1=new Course("B.Tech");
        Course course2=new Course("B.Sc.");
        Course course3=new Course("MBA");
        student1.addCourse(course1);
        student2.addCourse(course2);
        student1.addCourse(course3);
        student3.addCourse(course1);
        student3.addCourse(course2);
        course1.addStudent(student4);
        course1.addStudent(student5);
        course1.addStudent(student6);
        System.out.println("===========================================");
        System.out.println("School and students of school : ");
        school.displaySchoolAndStudents();
        System.out.println("============================================");
        System.out.println("Student and courses in which student is enrolled : ");
        student1.displayCoursesOfStudent();
        System.out.println("=============================================");
        System.out.println("Course and students enrolled in course : ");
        course1.displayStudentsInCourse();

    }
}