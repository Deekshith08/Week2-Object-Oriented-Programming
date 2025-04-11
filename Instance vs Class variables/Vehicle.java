//3
/*Create a Vehicle class to manage the details of vehicles:
Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).
Methods:
An instance method displayVehicleDetails() to display owner and vehicle details.
A class method updateRegistrationFee() to change the registration fee. */


public class Vehicle {
    String ownerName;
    String vehicleType;
    static int registrationFee;

    Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        registrationFee = 400;
    }

    void displayVehicleDetails(){
        System.out.println("---Vehicle details---");
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Vehicle Type : " + vehicleType);
    }

    static void updateRegistrationFee(int fee){
        registrationFee = fee;
    }
}
class register{
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Manoj", "2 wheeler");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(500);
        v1.displayVehicleDetails();
    }
}