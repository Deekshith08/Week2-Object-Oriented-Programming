
interface Discountable{
    double applyDiscount();
    void getDiscountDetails();
}

abstract class FoodItem{

    private String itemName;
    private double price;
    private double quantity;

    abstract double calculateTotalPrice();

    FoodItem(String name,double price, double quantity){
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public double getQuantity() { return quantity; }

    void getItemDetails(){
        System.out.println("\n----Item Details----");
        System.out.println("Item Name : " + itemName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable{

    double discountPercent = 15;

    VegItem(String name,double price, double quantity){
        super(name, price, quantity);
    }

    @Override
    double calculateTotalPrice(){
        return getPrice()*getQuantity();
    }
    @Override
    public double applyDiscount(){
        return calculateTotalPrice()*(discountPercent/100.0);
    }
    @Override
    public void getDiscountDetails(){
        System.out.println("Discount amount : " + applyDiscount());
        System.out.println("Total bill : " + (calculateTotalPrice()-applyDiscount()));
    }
}

class NonVegItem extends FoodItem implements Discountable{

    double discountPercent = 10;

    NonVegItem(String name,double price, double quantity){
        super(name, price, quantity);
    }

    @Override
    double calculateTotalPrice(){
        return getPrice()*getQuantity();
    }
    @Override
    public double applyDiscount(){
        return calculateTotalPrice()*(discountPercent/100.0);
    }
    @Override
    public void getDiscountDetails(){
        System.out.println("Discount amount : " + applyDiscount());
        System.out.println("Total bill : " + (calculateTotalPrice()-applyDiscount()));
    }
}

class Items{
    public static void main(String[] arghs){
        FoodItem v1 = new VegItem("Spring rolls", 150, 2);
        FoodItem n1 = new NonVegItem("Prawns Biriyani", 300, 3);

        v1.getItemDetails();
        ((VegItem)v1).getDiscountDetails();

        n1.getItemDetails();
        ((NonVegItem)n1).getDiscountDetails();
    }
}
