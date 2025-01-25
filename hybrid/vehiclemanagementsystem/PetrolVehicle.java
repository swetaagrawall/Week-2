package inheritance.hybrid.vehiclemanagementsystem;

public class PetrolVehicle extends Vehicles implements  Refuelable{
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    public void refuel(){
        System.out.println("PETROLVEHICLE");
        super.displayDetails();
        System.out.println("Refueling.....");
    }
}
