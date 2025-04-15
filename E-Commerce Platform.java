import java.util.ArrayList;
import java.util.List;

interface Taxable{
    double calculateTax();
    void getTaxDetails();
}

abstract class Product{
    private int productId;
    private String name;
    private double price;

    Product(int id, String name, double price){
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {  return productId; }
    public String getName() {  return name; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setProductId(int productId) { this.productId = productId; }

    abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable{

    int discountPercent = 10;
    int taxPercent = 6;

    Electronics(int id, String name, double price){
        super(id,name,price);
    }
    @Override
    double calculateDiscount(){
        return (discountPercent/100.0)*getPrice();
    }
    @Override
    public double calculateTax(){
        return (taxPercent/100.0)*getPrice();
    }
    @Override
    public void getTaxDetails(){
        System.out.println("Tax : "+ calculateTax());
    }
}

class Clothing extends Product implements Taxable{

    int discountPercent = 5;
    int taxPercent = 4;

    Clothing(int id, String name, double price){
        super(id,name,price);
    }
    @Override
    double calculateDiscount(){
        return (discountPercent/100.0)*getPrice();
    }
    @Override
    public double calculateTax(){
        return (taxPercent/100.0)*getPrice();
    }
    @Override
    public void getTaxDetails(){
        System.out.println("Tax : "+ calculateTax());
    }
}

class Groceries extends Product implements Taxable{

    int discountPercent = 15;
    int taxPercent = 3;

    Groceries(int id, String name, double price){
        super(id,name,price);
    }
    @Override
    double calculateDiscount(){
        return (discountPercent/100.0)*getPrice();
    }
    @Override
    public double calculateTax(){
        return (taxPercent/100.0)*getPrice();
    }
    @Override
    public void getTaxDetails(){
        System.out.println("Tax : "+ calculateTax());
    }
}

class Store{
    public static void main(String[] args){

        List<Product> products = new ArrayList<>();
        Electronics e1 = new Electronics(1, "laptop", 100000);
        Clothing c1 = new Clothing(1,"Jacket",2000);
        Groceries g1 = new Groceries(1, "Oil", 900);

        products.add(e1);
        products.add(c1);
        products.add(g1);

        for(Product pr:products){
            System.out.print("\nThe final perice of " + pr.getName() + " is : ");
            double price = pr.getPrice();
            double tax = ((Taxable)pr).calculateTax();
            double discount = pr.calculateDiscount();
            System.out.println(price+tax-discount);
        }
    }
}


