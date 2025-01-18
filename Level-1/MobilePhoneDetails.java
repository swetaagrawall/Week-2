import java.util.Scanner;

class MobilePhone {
    String brand;
    String model;
    int price;

    public MobilePhone(String brand , String model , int price){
        this.brand = brand;
        this.model=model;
        this.price=price;
	} 
    
    public void display(){
		System.out.println("Phone Details : ");
		System.out.println("Brand name is "+brand + " , model name is " +model +" and price is "+price);
	}
    
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        MobilePhone ti = new MobilePhone("Poco" , "0010", 20000);
       MobilePhone ti1 = new MobilePhone("Realme" , "3932", 50000);
       
        ti.display();
        ti1.display();
        
    }
}
