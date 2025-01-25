package inheritance.assistedproblems.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee employee;
        employee=new Employee("EmployeeA",101,50000);
        employee.displayDetails();
        employee=new Manager("ManagerM",201,70000,12);
        employee.displayDetails();
        employee=new Developer("DeveloperD",301,80000,6);
        employee.displayDetails();
        employee=new Intern("InternI",401,30000,5);
        employee.displayDetails();

    }

}
