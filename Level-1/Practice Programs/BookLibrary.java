import java.util.Scanner;

class BookLibrary {

    private String title;
    private String author;
    private double price;
	private String availability;

  
    // Parameterized constructor
    public BookLibrary(String title, String author, double price, String availability) {
        this.title = title;
        this.author = author;
        this.price = price;
		this.availability=availability;
    }

   
    //Implement a method to borrow a book.
    public void borrowbook() {
        if(availability.equals("Yes")){
			System.out.println("Book can be borrowed");
			availability="No";
		}else{
			System.out.println("Book can't be borrowed");
		}
    }

    // Main method 
    public static void main(String[] args) {
        BookLibrary b1 = new BookLibrary("java" ,"abc" , 200 , "Yes");
        BookLibrary b2 = new BookLibrary("c++" ,"xyz" , 100 , "No");
		System.out.println("Borrowing book1");
		b1.borrowbook();
		System.out.println("Borrowing book2");
        b2.borrowbook();
		System.out.println("Borrowing book1 Again");
		b1.borrowbook();
		
    }
}
