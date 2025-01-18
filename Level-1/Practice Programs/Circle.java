import java.util.Scanner;

class Circle{
    private double radius;
	///deafult constructor
    public Circle(){
		//Constructor chaining
		this(1.0);
	}
	public Circle(double radius){
		this.radius=radius;
		
	}
	//method to display result
	public void display(){
		System.out.println("The Radius of circle is " +radius);
    }

   //main method
    public static void main(String[] args) {
		//objects
         Circle c1 = new Circle();
         c1.display();
		 Circle c2 = new Circle(50.0);
         c2.display();
		 
         
        
     }
  }
  