package inheritance.hybrid.restaurantmanagementsystem;

public class Persons {
    private String name;
    private  int id;

    public Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayDetails(){
        System.out.println("The name is "+name+"\nThe id is "+id);
    }

}
