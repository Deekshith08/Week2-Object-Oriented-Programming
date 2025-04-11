//2
/*Design a Book class with:
ISBN (public).
title (protected).
author (private).
Write methods to:
Set and get the author name.
Create a subclass EBook to access ISBN and title and demonstrate access modifiers.
 */

public class Book {
    public int ISBN;
    protected String title;
    private String author;

    Book(int ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor(){
        return author;
    } 

    public void setAuthor(String author){
        this.author = author;
    }
}

class Ebook{
    public static void main(String[] args) {
        Book b1 = new Book(1,"No one","Yash");
        System.out.println(b1.getAuthor());
        b1.setAuthor("Raj");
        System.out.println(b1.getAuthor());
        System.out.println("ISBN : " + b1.ISBN);
        System.out.println("Title : " + b1.title);
    }
}
