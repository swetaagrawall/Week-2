import java.util.Scanner;

class TrackInventory {
    int itemCode;
    String itemName;
    int price;

    public TrackInventory(int itemCode , String itemName , int price){
        this.itemCode = itemCode;
        this.itemName=itemName;
        this.price=price;
	} 
    public int calculate(int quantity){
        int totalPrice=quantity*price;
        return totalPrice;
    }
    public void display(){
		System.out.println("Book Details : ");
		System.out.println("Item code is "+itemCode + " , item name is " +itemName +" and price is "+price);
	}
    
}

public class TrackInventoryItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Itemcode ");
       int itemCode=sc.nextInt();
	   System.out.println("Enter Itemname ");
       String itemName =sc.next();
	   System.out.println("Enter price of the item");
       int price=sc.nextInt();
       System.out.println("Enter quantity of the items");
       int quantity=sc.nextInt();
      
        TrackInventory ti = new TrackInventory(itemCode , itemName, price);
        ti.display();
        System.out.println("The total price for qantity "+quantity+" is "+ti.calculate(quantity));
    }
}
