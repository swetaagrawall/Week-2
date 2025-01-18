public class Vehicle {

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 500.0;  
    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name is " + ownerName);
        System.out.println("Vehicle Type is " + vehicleType);
        System.out.println("Registration Fee is" + registrationFee);
    }

    // Class method 
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method 
    public static void main(String[] args) {
        // Creating Vehicle objects
        Vehicle vehicle1 = new Vehicle("sweta", "Car");
        System.out.println("Before updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        Vehicle vehicle2 = new Vehicle("Nikii", "Bike");
        vehicle2.displayVehicleDetails();
		
        Vehicle.updateRegistrationFee(150.0);
		
        System.out.println("\nAfter updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
