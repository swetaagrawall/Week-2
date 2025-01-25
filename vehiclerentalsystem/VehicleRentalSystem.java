package encapsulationandpolymorphism.vehiclerentalsystem;

import java.util.ArrayList;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles= new ArrayList<>();
        Vehicle v;
        v=new Truck(1001,"Truck" , 450.5, "TRU1001" );
        v.calculateRentalCost(10);
         vehicles.add(v);
        v=new Car(2001,"Car" , 250.5, "CAR2001" );
        v.calculateRentalCost(11);
        vehicles.add(v);
        v=new Bike(3001,"Bike" , 150.5, "BUS3001" );
        v.calculateRentalCost(13);
       vehicles.add(v);
        for (Vehicle vehicle:vehicles) {
            vehicle.displayDetails();
            System.out.println();
        }
    }
}
