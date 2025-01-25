package inheritance.singlelevel.smarthomedevices;

public class Device {
    protected int deviceId;
    protected String status;

    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    public void displayStatus(){
        System.out.println("The device id is "+ deviceId + " and status is "+status);
    }

}
