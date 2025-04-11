//6

public class Vehicle {
    static int registrationFee = 500;
    String ownerName;
    String vehicleType;
    final int registrationNumber;

    Vehicle(String ownerName, String vehicleType, int registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(int fee){
        registrationFee = fee;
    }

    public boolean checkInstance(Vehicle obj){
        return obj instanceof Vehicle;
    }

    public void displayDetails(Vehicle obj){
        if(checkInstance(obj)){
            System.out.println("---Student Details---");
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Registration number : " + registrationNumber);
        System.out.println("----------------------");
        }
        else System.out.println("Not an instance");
    }
}

class Registration{
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Neel", "2 wheeler", 9999);
        v1.displayDetails(v1);
        Vehicle v2 = new Vehicle("Madhan", "4 wheeler", 1234);
        v2.displayDetails(v2);
        System.out.println("Registration fee : " + Vehicle.registrationFee);
        Vehicle.updateRegistrationFee(800);
        System.out.println("Registration fee : " + Vehicle.registrationFee);
    }
}