//4


public class Product {
    static int discount = 100;
    String productName;
    int price;
    final int productID;
    int quantity;

    Product(String productName, int price, int quantity, int productID){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(int newDiscount){
        discount = newDiscount;
    }

    public boolean checkInstance(Product obj){
        return obj instanceof Product;
    }

    public void displayDetails(Product obj){
        if(checkInstance(obj)){
            System.out.println("---Product Details---");
        System.out.println("Name : " + productName);
        System.out.println("Product id : " + productID);
        System.out.println("Quantity : " + quantity);
        System.out.println("cost : " + (quantity*price));
        System.out.println("Given Discount : " + discount);
        System.out.println("Total cost : " + ((quantity*price)-discount));
        System.out.println("----------------------");
        }
        else System.out.println("Not an instance");
    }
}

class productmain{
    public static void main(String[] args) {
        Product p1 = new Product("Mat", 500, 2, 1);
        p1.displayDetails(p1);
        Product.updateDiscount(5000);
        Product p2 = new Product("Iphone", 50000 , 2, 98);
        p2.displayDetails(p2);
    }
}