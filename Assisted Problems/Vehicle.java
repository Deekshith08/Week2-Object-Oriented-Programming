//3 - Vehicle and Transport System

public class Vehicle {
    
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayinfo(){
        System.out.println("Maximum Speed : " + maxSpeed);
        System.out.println("Fuel Type : " + fuelType);
    }
}

class Car extends Vehicle{

    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    void displayinfo(){
        System.out.println("\nCar Details : ");
        super.displayinfo();
        System.out.println("Seat Capacity : " + seatCapacity);
    }
}

class Truck extends Vehicle{

    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity){
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    void displayinfo(){
        System.out.println("\nTruck Details : ");
        super.displayinfo();
        System.out.println("Load Capacity : " + loadCapacity);
    }
}

class Motorcycle extends Vehicle{

    int weight;

    Motorcycle(int maxSpeed, String fuelType, int weight){
        super(maxSpeed, fuelType);
        this.weight = weight;
    }

    void displayinfo(){
        System.out.println("\nMotor Cycle Details : ");
        super.displayinfo();
        System.out.println("Weight : " + weight + " kgs");
    }
}

class BuyVehicle{
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(150,"Petrol",5);
        vehicles[1] = new Truck(140,"Diesel",2000);
        vehicles[2] = new Motorcycle(200, "petrol", 120);

        for(Vehicle vehicle:vehicles){
            vehicle.displayinfo();
        }
    }
}