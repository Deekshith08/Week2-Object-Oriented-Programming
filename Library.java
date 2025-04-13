//Problem 1: Library and Books (Aggregation)

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> Books;
    String name;

    Library(String name){
        this.name = name;
        this.Books = new ArrayList<>();
    }

    void addbook(Book book){
        Books.add(book);
        System.out.println("'" + book.getTitle() + "'" + " added to the library");
    }

    void showBooks(){
        System.out.println("The " + name + " Library have the following books : ");
        for(Book book:Books){
            System.out.println("Title : " + book.getTitle() + " , Author : " + book.getAuthor());
        }
    }
}

class Book {
    private String title;
    private String author;
    
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    String getTitle(){
        return title;
    }

    String getAuthor(){
        return author;
    }

    void showBookDetails(){
        System.out.println("---Book Details---");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("------------------");
    }
}

class Main{
    public static void main(String[] args) {
        Book b1 = new Book("No one","Neel");
        b1.showBookDetails();
        Library L1 = new Library("Sri Rama Chandra");
        L1.addbook(b1);
        //L1.showBooks();
        Book b2 = new Book("Always", "Sreee");
        b2.showBookDetails();
        L1.addbook(b2);
        L1.showBooks();

    }
}