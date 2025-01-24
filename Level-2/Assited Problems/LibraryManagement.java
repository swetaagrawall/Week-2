import java.util.*;
class Library{
    //aggregation
    private ArrayList<Book> books;
    public Library(){
        books=new ArrayList<Book>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void showAllBooks(){
        for(Book book:books){
            System.out.println("Title  : "+book.getTitle()+",\tAuthor : "+book.getAuthor() );
        }
    }

}
class Book{
    private String title;
    private String author;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Book book1=new Book("Java","James Gosling");
        Book book2=new Book("Let Us Java","Yashwant Kanetkar");
        Library library=new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.showAllBooks();
    }

}

