package inheritance.hybrid.restaurantmanagementsystem;

public class Chef extends Persons implements Worker{
    public Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties(){
        System.out.println("CHEF");
        super.displayDetails();
        System.out.println("The duty is "+"Cooking...");
    }
}
