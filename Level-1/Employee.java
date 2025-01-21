public class Employee {

    private  String name;
    private final int id ;
    private  String designation ;
    private static String companyName  ="BridgeLabz";
    private static int noOfEmployee=0;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        noOfEmployee++;
    }
    public void displayEmployeeDetails(){
        System.out.println("The name of company is "+companyName);
        System.out.println("The name of employee is "+ name);
        System.out.println("The id of employee is "+id);
        System.out.println("The designation of employee is "+designation);
    }
    public static int displayTotalEmployees(){
        return noOfEmployee;
    }

    public static void main(String[] args) {
     Employee e1= new Employee("Sweta" , 101, "Sr. Developer" );
     Employee e2= new Employee("Niketa" , 201, "Jr. Developer" );
        System.out.println("Employee 1");
        if(e1 instanceof Employee) {
            System.out.println("Yes e1 is an inatance of Employee");
            e1.displayEmployeeDetails();
        }

        System.out.println("\nEmployee 2");
        if(e2 instanceof Employee) {
            System.out.println("Yes e2 is an inatance of Employee");
            e2.displayEmployeeDetails();
        }
        System.out.println("The total number of employees are "+displayTotalEmployees());
    }
}
