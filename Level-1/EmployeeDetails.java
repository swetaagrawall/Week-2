import java.util.Scanner;
class Employee{
    String name;
    int id;
	double salary;

	public Employee(String name , int id , double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void display(){
		System.out.println("employee Details : ");
		System.out.println("Name: "+name + " , id is " +id +" and salary is "+salary);
	}
}
public class EmployeeDetails{
   public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);
	  //taking inputs from user
	  System.out.println("Enter Your Name ");
       String name =sc.nextLine();
	   System.out.println("Enter Your id ");
       int id=sc.nextInt();
	   System.out.println("Enter Your salary ");
       double salary=sc.nextDouble();
      
	   Employee emp = new Employee(name,id,salary);
	   emp.display();
	   
	  
   }
}