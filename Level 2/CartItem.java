//5
/*Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
 */

public class CartItem {
    private String itemName;
    int price;
    int quantity;

    CartItem(String itemName, int price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItem(){
        return itemName;
    }

    public void setter(String newname){
        itemName = newname;
    }

    public void addItem(int newquantity){
        quantity = quantity + newquantity;
        System.out.println("New quantity " + newquantity + " is added to the cart");
    }

    public void removeItem(int newquantity){
        if(quantity-newquantity > 0) quantity-=newquantity;
        else System.out.println("not enough quantity");
    }

    public void totalCost(){
        int cost = quantity*price;
        System.out.println("Total Cost : " + cost);
    }

    public static void main(String[] args) {
        CartItem c = new CartItem("Box", 90, 5);
        c.totalCost();
        c.addItem(1);
        c.addItem(2);
        c.totalCost();
        c.removeItem(5);
        c.totalCost();
        System.out.println(c.itemName);
    }
}

