import java.util.Scanner;

class CarRental  {
	//instance variables
    private String customerName;
	private String carModel;
	private int rentalDays;
	//default constructor
	 public CarRental  (){

	}
	//parametrised constructor
    public CarRental  (String customerName ,String carModel ,int rentalDays){
		this.customerName=customerName;
		this.carModel=carModel;
		this.rentalDays=rentalDays;
	}
	//method to Find total cost
	public void totalCost(int pricePerDay){
	   double cost=pricePerDay*rentalDays;
	   System.out.println("The total cost is " +cost);

    }
	
	//method to display result
	public void display(){
		System.out.println("The Name of customer is " +customerName);
		System.out.println("The model of car is " +carModel);
		System.out.println("The number of Days is " +rentalDays);
    }

// main methods
    public static void main(String[] args) {
		//objects 
		 System.out.println("\n First car");
         CarRental   car1 = new CarRental  ("BMW" , "xyz",5);
         car1.display();
		 car1.totalCost(5000);
		 System.out.println("\n Secound car \n");
		 CarRental   car2 = new CarRental  ("Audi" , "abc",1);
         car2.display();
		 car2.totalCost(8000);
		 
         
        
     }
  }
  