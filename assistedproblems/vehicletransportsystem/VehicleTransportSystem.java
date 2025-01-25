package inheritance.assistedproblems.vehicletransportsystem;

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle[] v=new Vehicle[4];
        v[0]= new Vehicle(110 ,"Diesel" );
        v[1]=new Car(150  , "Petrol" , 6) ;
        v[2]=new Truck(150 , "CNG" , "Layland");
        v[3]= new Motorcycle(110 , "HEVs" , "black");
        for(Vehicle v1 : v){
            v1.displayInfo();
        }
    }
}
