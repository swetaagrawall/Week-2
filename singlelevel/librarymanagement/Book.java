package inheritance.singlelevel.librarymanagement;

public class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo(){
        System.out.println("The title of book is "+title+" and the publication year is "+ publicationYear);
    }
}
