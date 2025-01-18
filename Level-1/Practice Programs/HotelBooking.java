import java.util.Scanner;

class HotelBooking {
	//instance variables
    private String guestName;
	private String roomType;
	private int nights;
	//default constructor
	 public HotelBooking (){

	}
	//parametrised constructor
    public HotelBooking (String guestName ,String roomType ,int nights){
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
	}
	//copy constructor
	public HotelBooking (HotelBooking previousBooking){
		this.guestName=previousBooking.guestName;
		this.roomType=previousBooking.roomType;
		this.nights=previousBooking.nights;
		
	}
	//method to display result
	public void display(){
		System.out.println("The Name of guest is " +guestName);
		System.out.println("The room type is " +roomType);
		System.out.println("The no number of nights is " +nights);
    }

// main methods
    public static void main(String[] args) {
		
		//objects 
		System.out.println("Dafult values : \n ");
		HotelBooking  booking1 = new HotelBooking ();
         booking1.display();
		 System.out.println("\n User-defined values : \n");
         HotelBooking  booking = new HotelBooking ("Sweta Agrawal" , "A.C",2);
         booking.display();
		 System.out.println("\n Copy Constructor : \n");
		 HotelBooking  previousBooking = new HotelBooking (booking);
         previousBooking.display();
		 
         
        
     }
  }
  