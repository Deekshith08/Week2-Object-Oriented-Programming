//Sample Problem 2: Vehicle Management System with Hybrid Inheritance

interface Refueable {
    void refuel();
    void charge();    
}
public class Vehicle {

    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void getVehicleInfo(){
        System.out.println("Maximum Speed : " + maxSpeed);
        System.out.println("Model : " + model);
    }
}

class ElectricVehicle extends Vehicle implements Refueable{
    int chargingTime ;

    ElectricVehicle(int maxSpeed, String model,int chargingTime){
        super(maxSpeed,model);
        this.chargingTime = chargingTime;
    }
    
    @Override
    void getVehicleInfo(){
        System.out.println("\nType : Electric");
        super.getVehicleInfo();
        System.out.println("Charging time : " + chargingTime + " hours");
    }

    @Override
    public void refuel(){
        System.out.println("\nElectric Vehicle cannot use fuel");
    }

    @Override
    public void charge(){
        System.out.println("\nThe Electric Vehicle started getting charged");
    }
}

class PetrolVehicle extends Vehicle implements Refueable{

    int tankCapacity;

    PetrolVehicle(int maxSpeed, String model, int tankCapacity){
        super(maxSpeed,model);
        this.tankCapacity = tankCapacity;
    }

    @Override
    void getVehicleInfo(){
        System.out.println("\nType : Fuel");
        super.getVehicleInfo();
        System.out.println("Tank Capacity : " + tankCapacity);
    }

    @Override
    public void refuel(){
        System.out.println("\nThe fuel tank is filled");
    }

    @Override
    public void charge(){
        System.out.println("\nThe Fuel Vehicle cannot be charged");
    }
}

class VehicleDemo{
    public static void main(String[] args) {
        ElectricVehicle e1 = new ElectricVehicle(100, "Ola", 5);
        e1.getVehicleInfo();
        e1.refuel();
        e1.charge();

        PetrolVehicle p1 = new PetrolVehicle(200, "ns200", 12);
        p1.getVehicleInfo();
        p1.refuel();
        p1.charge();
    }
}