//5
/* Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone. 
The MobilePhone class uses attributes to store the phone's characteristics. The method is used to retrieve and display this information 
for each object.
*/

public class MobilePhone {
    String brand;
    String model;
    int price;

    MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("---Mobile Phone Details---");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Realme", "GT 6", 25000);
        phone.displayDetails();
    }
}
