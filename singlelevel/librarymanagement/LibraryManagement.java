package inheritance.singlelevel.librarymanagement;

public class LibraryManagement {
    public static void main(String[] args) {
        Book b= new Author("To Kill a Mockingbird",1960,"Harper Lee" ,"Harper Lee (April 28, 1926 February 19, 2016) was an American novelist best known for her Pulitzer Prize-winning novel ");
        b.displayInfo();
        System.out.println("==================================");
        Book b1= new Author("1984", 1949,"George Orwell" ,"George Orwell (June 25, 1903 January 21, 1950) was an English writer, journalist, and social critic");
        b1.displayInfo();

    }
}
