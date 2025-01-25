package inheritance.assistedproblems.vehicletransportsystem;

public class Car extends Vehicle{
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override
    public void displayInfo(){
        System.out.println("The max speed of Car is "+getMaxSpeed()+"km/hr , fuel type is "+getFuelType()+" and the seat capacity is "+ seatCapacity);
    }
}
