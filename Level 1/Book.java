//1
/*Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors. */

public class Book{
    private String title;
    private String author;
    private int price;

    Book(){
        title = "No One";
        author = "Raj";
        price = 500;
    }
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int newPrice){
        price = newPrice;
    }

    void displayDetails(){
        System.out.println("---Book Details---");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }

}

class Test{
    public static void main(String[] args) {
        Book b1 = new Book("Then One","Yash",600);
        b1.displayDetails();
        System.out.println(b1.getPrice());
        b1.setPrice(1000);
        System.out.println(b1.getPrice());
        b1.displayDetails();
    }
}