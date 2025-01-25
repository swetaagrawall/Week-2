package inheritance.singlelevel.smarthomedevices;

public class Thermostat extends Device{
    private String temperatureSetting;

    public Thermostat(int deviceId, String status, String temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    public void displayStatus(){
        super.displayStatus();
        System.out.println("The device temperature setting is "+ temperatureSetting );
    }

}
