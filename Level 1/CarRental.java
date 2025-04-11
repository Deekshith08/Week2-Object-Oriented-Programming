//6
/* Create a CarRental class with attributes customerName, carModel, and rentalDays. Add
constructors to initialize the rental details and calculate total cost.*/

public class CarRental {
    private String customerName;
    String carModel;
    int rentalDays;
    int price;

    CarRental(){
        customerName = "Pass";
        carModel = "Nano";
        rentalDays = 1;
        price = 300;
    }

    CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    int rentalCost(){
        int cost = switch(carModel){
            case "Nano" -> 300;
            case "XUV" -> 500;
            case "Swift" -> 600;
            default -> 300;
        };
        return cost;
    }
    
    int totalCost(){
        return rentalDays*rentalCost();
    }

    void displayDetails(){
        System.out.println("----Car Booking Details----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model : " + carModel);
        System.out.println("Rental Days : " + rentalDays);
        System.out.println("Total Cost : " + totalCost());
    }
}

class rentCar{
    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        c1.displayDetails();
        CarRental c2 = new CarRental("Yash","Swift",4);
        c2.displayDetails();
    }
}
