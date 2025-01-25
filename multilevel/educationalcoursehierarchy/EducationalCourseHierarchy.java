package inheritance.multilevel.educationalcoursehierarchy;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Course course1=new PaidOnlineCourse("Java",7,"Udemy",true,12000,20);
        Course course2=new PaidOnlineCourse("Python",5,"GeeksForGeeks",false,9000,15);
        course1.display();
        System.out.println("===========================");
        course2.display();
    }
}
