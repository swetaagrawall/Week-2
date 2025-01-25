package inheritance.hybrid.restaurantmanagementsystem;

public class Waiter extends Persons implements Worker{
    public Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties(){
        System.out.println("WAITER");
        super.displayDetails();
        System.out.println("The duty is "+"Serving...");
    }
}
