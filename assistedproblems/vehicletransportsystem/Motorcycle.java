package inheritance.assistedproblems.vehicletransportsystem;

public class Motorcycle extends Vehicle{
    private String motorcycleColor;

    public Motorcycle(int maxSpeed, String fuelType, String motorcycleColor) {
        super(maxSpeed, fuelType);
        this.motorcycleColor = motorcycleColor;
    }
    @Override
    public void displayInfo(){
        System.out.println("The max speed of motorcycle is "+getMaxSpeed()+"km/hr , fuel type is "+getFuelType()+" and the color is "+ motorcycleColor);
    }
}
