package inheritance.hybrid.vehiclemanagementsystem;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev= new ElectricVehicle(96,"EV-393");
        ev.charge();
        System.out.println();
        PetrolVehicle pv = new PetrolVehicle(154,"PET-3709");
        pv.refuel();
    }
}
