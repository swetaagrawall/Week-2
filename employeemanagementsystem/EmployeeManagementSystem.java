package encapsulationandpolymorphism.employeemanagementsystem;

import java.util.ArrayList;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employee= new ArrayList<>();
        Employee emp;
        emp= new FullTimeEmployee(1001 ,"Sweta Agrawal" ,900000 ,4 ,5000);
        emp.calculateSalary();
        emp.assignDepartment("Software engineer");
        employee.add(emp);

        emp=new PartTimeEmployee(2001 ,"Niketa Jain" ,950 ,78 ,10);
        emp.calculateSalary();
        emp.assignDepartment("HR");
        employee.add(emp);
        for (Employee e:employee) {
              e.displayDetails();
            System.out.println();
        }
    }
}
