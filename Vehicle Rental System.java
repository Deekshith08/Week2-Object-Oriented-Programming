
import java.util.List;
import java.util.ArrayList;

interface Insurable{
    double calculateInsurance();
    void getInsuranceDetails();
}

abstract class Vehicle{
    private int vehicleNumber;
    private String type;
    private double rentalRate;
    private int policyNumber;

    Vehicle(int number, String type, double rate, int policyNumber){
        this.vehicleNumber = number;
        this.type = type;
        this.rentalRate = rate;
        this.policyNumber = policyNumber;        
    }

    abstract double calculateRentalCost(int days);

    public int getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public int getPolicyNumber() { return policyNumber; }

    public void setVehicleNumber(int vehicleNumber) { this.vehicleNumber = vehicleNumber; }
    public void setType(String type) { this.type = type; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }

}

class Car extends Vehicle implements Insurable {
    int policyNumber;
    Car(int number, String type, double rate, int policyNumber){
        super(number,type,rate,policyNumber);
        this.policyNumber = policyNumber;
    }
    @Override
    double calculateRentalCost(int days){
        return getRentalRate()*days;
    }
    @Override
    public double calculateInsurance(){
        return getRentalRate()*0.25;
    }
    @Override
    public void getInsuranceDetails(){
        System.out.println("Insurance Policy Number : " + getPolicyNumber());
        System.out.println("Insurance Amount : " + calculateInsurance());
    }
}

class Bike extends Vehicle implements Insurable {
    Bike(int number, String type, double rate, int policyNumber){
        super(number,type,rate,policyNumber);
    }
    @Override
    double calculateRentalCost(int days){
        return getRentalRate()*days;
    }
    @Override
    public double calculateInsurance(){
        return getRentalRate()*0.5;
    }
    @Override
    public void getInsuranceDetails(){
        System.out.println("Insurance Policy Number : " + getPolicyNumber());
        System.out.println("Insurance Amount : " + calculateInsurance());
    }
}

class Truck extends Vehicle implements Insurable {
    Truck(int number, String type, double rate, int policyNumber){
        super(number,type,rate,policyNumber);
    }
    @Override
    double calculateRentalCost(int days){
        return getRentalRate()*days;
    }
    @Override
    public double calculateInsurance(){
        return getRentalRate()*0.55;
    }
    @Override
    public void getInsuranceDetails(){
        System.out.println("Insurance Policy Number : " + getPolicyNumber());
        System.out.println("Insurance Amount : " + calculateInsurance());
    }
}

class VehicleDemo{
    public static void main(String[] args){

        List<Vehicle> vehicles = new ArrayList<>();
        Car c1 = new Car(8988,"Swift", 1000, 12345678);
        Bike b1 = new Bike(8506, "ns200", 500, 78945612);
        Truck t1 = new Truck(1098, "Eicher", 7000, 75315985);

        vehicles.add(c1);
        vehicles.add(b1);
        vehicles.add(t1);

        for(Vehicle vehicle:vehicles){
            System.out.println("\nRental cost for " + vehicle.getType() + " is : " + vehicle.calculateRentalCost(1));;
            ((Insurable)vehicle).getInsuranceDetails();
        }
    }
}