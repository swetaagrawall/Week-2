package inheritance.assistedproblems.vehicletransportsystem;

public class Vehicle {
    private int maxSpeed;
    private String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getFuelType(){
        return fuelType;
    }

    public void displayInfo(){
        System.out.println("The max speed of vehicle is "+maxSpeed+"km/hr and fuel type is "+fuelType);
    }
}
