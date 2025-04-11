//1
/*Create a Product class with:
Instance Variables: productName, price.
Class Variable: totalProducts (shared among all products).
Methods:
An instance method displayProductDetails() to display the details of a product.
A class method displayTotalProducts() to show the total number of products created.
 */

class Product{
    String productName;
    int price;
    static int totalProducts = 3;

    Product(String productName, int price){
        this.productName = productName;
        this.price = price;
    }

    void displayProductDetails(){
        System.out.println("----Product Details----");
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
    }

    static void displayTotalProducts(){
        System.out.println("Total Products : " + totalProducts);
    }
}

class Test{
    public static void main(String[] args) {
        Product p1 = new Product("Box",200);
        p1.displayProductDetails();
        Product.displayTotalProducts();
    }
}