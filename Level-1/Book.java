public class Book {
    private  String title;
    private  String author;
    private final long isbn ;
    private static String libraryName ="Book Villa";


    public Book(String title, String author, long isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBookDetails(){
        System.out.println("The title of book is "+ title);
        System.out.println("The author of book is "+author);
        System.out.println("The isbn of book is "+isbn);
    }
    public static  void displayLibraryName() {
        System.out.println("The name of library is " + libraryName);
    }

    public static void main(String[] args) {
     displayLibraryName();
     Book b1 = new Book("Java" , "Abc" ,10001);
     Book b2 = new Book("C++" , "Xyz" ,20002);
     System.out.println("Book 1");
     if(b1 instanceof Book) {
         System.out.println("Yes b1 is an inatance of Book");
         b1.displayBookDetails();
     }

    System.out.println("\nBook 2");
     if(b2 instanceof Book) {
            System.out.println("Yes b2 is an inatance of Book");
            b1.displayBookDetails();
        }
    }
}
