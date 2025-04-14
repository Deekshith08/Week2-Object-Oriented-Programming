//Sample Problem 2: Smart Home Devices

public class Device {
    
    int deviceId;
    String status;

    Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus(){
        System.out.println("---Device Status---");
        System.out.println("Device id : " + deviceId);
        System.out.println("Status : " + status);
    }
}

class Thermostat extends Device{

    int temperatureSetting;

    Thermostat(int deviceId, String status, int temp){
        super(deviceId,status);
        this.temperatureSetting = temp;
    }
    @Override
    void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting : " + temperatureSetting);
    }
}

class New{
    public static void main(String[] args) {
        Thermostat t = new Thermostat(1, "on", 33);
        t.displayStatus();
    }
}
