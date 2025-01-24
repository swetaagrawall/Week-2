import java.util.ArrayList;

class Company{
    private ArrayList<Department> departments;
    private String name;
    public Company(String name){
        this.name=name;
        departments=new ArrayList<>();
    }
    public void addDepartment(String deptName){
        departments.add(new Department(deptName));
        System.out.println("Department "+deptName+" added!");

    }
    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department '" + departmentName + "' not found in " + name);
    }
    public void displayCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.showAllEmployees();
        }
    }

    // Deleting the company (for demonstration)
    public void deleteCompany() {
        System.out.println("Deleting company: " + name);
        departments.clear();
        System.out.println("All departments and employees removed.");
    }
}
class Department{
    private ArrayList<Employee> employees;
    private String name;
    public Department(String name){
        this.name=name;
        employees=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addEmployee(String empName){
        employees.add(new Employee(empName));
        System.out.println("Employee "+empName+" added");
    }
    public void showAllEmployees(){
        for(Employee employee:employees){
            System.out.println(employee.getName());
        }
    }


}
class Employee{
    private String name;
    public Employee(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class CompanyManagement {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        // Add departments
        company.addDepartment("Engineering");
        company.addDepartment("Human Resources");

        // Add employees to departments
        company.addEmployeeToDepartment("Engineering", "Alice");
        company.addEmployeeToDepartment("Engineering", "Bob");
        company.addEmployeeToDepartment("Human Resources", "Charlie");

        // Display the company structure
        company.displayCompanyStructure();

        // Delete the company (for demonstration purposes)
        company.deleteCompany();
    }
}

