//5
/*Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book. */


public class Library{
    String title;
    String author;
    int price;
    boolean availability;

    Library(String title, String author, int price, boolean availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public void isAvailable(){
        if(availability) System.out.println("Book is available");
        else System.out.println("Book is not available");
    }

    void billDetails(){
        if(availability){
            System.out.println("---Book Details---");
            System.out.println("Title : " + title);
            System.out.println("Author : " + author);
            System.out.println("Price : " + price);
        }
        else System.out.println("No bill, Since book is not available");        
    }

}

class BookinLibrary{
    public static void main(String[] args) {
        Library b1 = new Library("Then One","Yash",600,true);
        b1.isAvailable();
        b1.billDetails();
    }
}


