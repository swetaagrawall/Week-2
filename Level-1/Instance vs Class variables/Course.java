public class Course {

    // Instance variables
    private String courseName;
    private String duration;
    private double fee;
	private static String instituteName = "Technocrtas Institute Of Technology";

    //Paramterised Constructor 
    public Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    //instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name is " + instituteName);
        System.out.println("Course Name is " + courseName);
        System.out.println("Duration is " + duration);
        System.out.println("Fee is " + fee);
    }
    //class method
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method 
    public static void main(String[] args) {
        // Creating objects
        Course course1 = new Course("Java Programming", "3 Months", 500.0);
        Course course2 = new Course("Git Github", "4 Months", 600.0);

        System.out.println("Before updating Institute name: ");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
		
        Course.updateInstituteName("New TIT");

        System.out.println("\nAfter updating Institute name: ");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
