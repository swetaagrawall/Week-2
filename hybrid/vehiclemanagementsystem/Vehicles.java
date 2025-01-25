package inheritance.hybrid.vehiclemanagementsystem;

public class Vehicles {
    private int maxSpeed;
    private String model;

    public Vehicles(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    public void displayDetails(){
        System.out.println("The max speed is "+maxSpeed+"\nThe model is "+model);
    }

}
