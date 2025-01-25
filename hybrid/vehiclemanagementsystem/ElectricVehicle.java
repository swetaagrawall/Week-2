package inheritance.hybrid.vehiclemanagementsystem;

public class ElectricVehicle extends Vehicles{
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    public void charge(){
        System.out.println("ELECTRICVEHICLE");
        super.displayDetails();
        System.out.println("ElectricVehicle is  charging");
    }
}
