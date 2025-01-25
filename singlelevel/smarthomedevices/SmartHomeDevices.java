package inheritance.singlelevel.smarthomedevices;

public class SmartHomeDevices {
    public static void main(String[] args) {
        Device d= new Thermostat(101 , "Heating" ,"72F" );
        d.displayStatus();
        System.out.println("=======================================");
        Device d1= new Thermostat(201 , "Cooling" ,"76F" );
        d1.displayStatus();
    }
}
