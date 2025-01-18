import java.util.Scanner;

class AreaAndCircumference{
    int radius;

	public AreaAndCircumference(int radius){
		this.radius=radius;
	}

    public double areaCalculate(int radius){
		     double area=Math.PI*radius*radius;
         return area;
    }
    public double circumferenceCalculate(int radus){
       double circumference=2*radus*Math.PI;
       return circumference;
    }

	public void display(double area , double circumference){
		System.out.println("The Area of circle is " +area+" ans the circumference of circle is "+circumference);
    }
}

   

public class AreaAndCircumferenceOfCircle {
    public static void main(String[] args) {
        
    
        Scanner sc= new Scanner(System.in);
        //taking inputs from user
        System.out.println("Enter radius of circle ");
         int radius=sc.nextInt();
        
         AreaAndCircumference ac = new AreaAndCircumference(radius);
         double area =ac.areaCalculate(radius);
         double circumference=ac.circumferenceCalculate(radius);
         ac.display(area, circumference);
         
        
     }
  }
  