//4

/*Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost 
for a given quantity.
 */

import java.util.Scanner;
public class Item{
    int itemCode;
    String itemName;
    int price;

    //constructor
    Item(int itemCode, String itemName, int price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public int totalCost(int quantity){
        return price*quantity;
    }

    public void displayDetails(int quantity){
        System.out.println("---Item Details---");
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Item Price per unit : " + price);
        System.out.println("Total cost : " + totalCost(quantity));
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        Item a = new Item(1,"rice",40);
        a.displayDetails(quantity);

        Item b = new Item(2,"sugar",30);
        b.displayDetails(quantity);
        
        input.close();
    }
}
