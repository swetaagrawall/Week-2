public class Student {

    private  String name;
    private  final int rollNumber;
    private  String grade;
    private static String universityName  ="TIT Group";
    private static int numOfStudents;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        numOfStudents++;
    }
    public static int displayTotalStudents(){
        return numOfStudents;
    }
    public void displayStudentDetails(){
        System.out.println("The univeristy name is "+universityName);
        System.out.println("The name of student is "+name);
        System.out.println("The roll num of student is "+rollNumber);
        System.out.println("The grade of student is "+grade);

    }
    public static void main(String[] args) {
    Student s1= new Student("Sweta" , 50 , "A+");
    Student s2= new Student("Anjani" , 40 , "A");
    if(s1 instanceof Student){
            System.out.println("Student 1");
            System.out.println("yes s1 is instance of product");
            s1.displayStudentDetails();
        }
        System.out.println(" ");
    if(s2 instanceof Student){
            System.out.println("Student 2");
            System.out.println("yes s2 is instance of product");
            s2.displayStudentDetails();
        }
    System.out.println("The total number of students are "+numOfStudents);
    }
}
