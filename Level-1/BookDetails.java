import java.util.Scanner;

class Books {
    String title;
    String author;
    int price;

    public Books(String title , String author , int price){
        this.title = title;
        this.author = author;
        this.price=price;	
	} 
    public void display(){
		System.out.println("Book Details : ");
		System.out.println("Name: "+title + " , author is " +author +" and price is "+price);
	}
    
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name ");
       String name =sc.nextLine();
	   System.out.println("Enter author name ");
       String author =sc.nextLine();
	   System.out.println("Enter price of book");
       int price=sc.nextInt();
      
        Books b = new Books(name , author , price);
        b.display();
    }
}
