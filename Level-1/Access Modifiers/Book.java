class Book{
    public int isbn;
    protected String title;
    private String author;
    //parameterized constructor
    public Book(int isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
    //getter for author name
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void display(){
        System.out.println("ISBN : "+isbn+", Title : "+title+", Author : "+getAuthor());

    }
	 public static void main(String[] args) {
        Book book1=new Book(1111,"Java","Abc");
        System.out.println("Book1:");
        book1.display();
        book1.setAuthor("abc");
        System.out.println("Book1:\nAfter changing author : ");
        book1.display();
        EBook book2=new EBook(2222,"Python","Xyz");
        System.out.println("Book2 : ");
        book2.displayISBN();
        book2.dispalyTitle();
    }
}
class EBook extends Book{
    public EBook(int isbn,String title, String author){
        super(isbn,title,author);
    }
    public void displayISBN(){
        System.out.println("ISBN : "+isbn);
    }
    public void dispalyTitle(){
        System.out.println("Title : "+title);
    }

}

   

