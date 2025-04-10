//3
/*Write a program to create a Book class with attributes title, author, and price. Add a method to display the book
details.
 */


public class Book {
    private String title;
    String author; 
    int price;
    
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails(){
        System.out.println("----BOOK DETAILS----");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args){
        Book b1 = new Book("No one","Kishan",100);
        b1.displayBookDetails();
    }
}
