package inheritance.assistedproblems.vehicletransportsystem;

public class Truck extends Vehicle{
    private String truckCompany;

    public Truck(int maxSpeed, String fuelType, String truckCompany) {
        super(maxSpeed, fuelType);
        this.truckCompany = truckCompany;
    }
    @Override
    public void displayInfo(){
        System.out.println("The max speed of truck is "+getMaxSpeed()+"km/hr , fuel type is "+getFuelType()+" and the Company is "+ truckCompany);
    }
}
