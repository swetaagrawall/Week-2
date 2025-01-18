class Movieticket{
    String movieName;
    int seatNumber;
    int price;

    public Movieticket(String movieName, int seatNumber, int price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    public void display(){
        System.out.println("Ticket is booked successfully :");
        System.out.println("The name is movie is "+movieName);
        System.out.println("The seat number is "+seatNumber);
        System.out.println("The price is "+price);


    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Movieticket m=new Movieticket("Abc" , 8 , 250);
         m.display();
        Movieticket m1=new Movieticket("Xyz" , 45 , 230);
        m1.display();
        Movieticket m2=new Movieticket("Mno" , 15, 320);
        m2.display();


    }
}
