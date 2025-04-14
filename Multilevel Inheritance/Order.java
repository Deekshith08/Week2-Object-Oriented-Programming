//Sample Problem 1: Online Retail Order Management

public class Order {

    int orderid;
    String orderDate;

    Order(int id, String date){
        this.orderid = id;
        this.orderDate = date;
    }

    void getOrderStatus(){
        System.out.println("\nOrder Status : Placed");
    }

    void getOrderDetails(){
        System.out.println("\n----Order Details----");
        System.out.println("Order Id : " + orderid);
        System.out.println("Order Date : " + orderDate);
    }
}

class ShippedOrder extends Order{
    
    int trackingNumber;

    ShippedOrder(int id, String date, int number){
        super(id,date);
        this.trackingNumber = number;
    }

    @Override
    void getOrderStatus(){
        System.out.println("\nOrder Status : Shipped");
        System.out.println("Tracking Number : " + trackingNumber);
    }
    
}

class DeliveredOrder extends ShippedOrder{

    String deliveryDate;

    DeliveredOrder(int id, String date, int number, String deliveryDate){
        super(id, date, number);
        this.deliveryDate = deliveryDate;
    }

    @Override
    void getOrderStatus(){
        System.out.println("\nOrder Status : Delivered");
        System.out.println("Tracking Number : " + trackingNumber);
        System.out.println("Delivery Date : " + deliveryDate);
    }
}

class Flipkart{
    public static void main(String[] args) {
        Order o1 = new Order(1,"01-04-2025");
        o1.getOrderDetails();
        o1.getOrderStatus();

        ShippedOrder s1 = new ShippedOrder(1,"01-04-2025",321456);
        s1.getOrderDetails();
        s1.getOrderStatus();

        DeliveredOrder d1 = new DeliveredOrder(1,"01-04-2025", 5555, "08-04-2025");
        d1.getOrderDetails();
        d1.getOrderStatus();
    }
}