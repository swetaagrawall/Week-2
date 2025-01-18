public class Book {

    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
       
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

   
    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price);
    }

    // Main method 
    public static void main(String[] args) {
        // Using the default constructor
        Book b1 = new Book();
        b1.displayBookDetails();
       // Using the parameterized constructor
        Book b2 = new Book("Maha Kavithai ", "Vairamuthu", 10.99);
        b2.displayBookDetails();
    }
}
