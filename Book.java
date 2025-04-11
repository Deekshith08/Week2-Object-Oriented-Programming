//2


public class Book {
    static String libraryName = "Sri Ramachandra Library";
    String title;
    final long isbn;
    String author;

    Book(String title, String author, final long isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName(){
        System.out.println("Library Name : " + libraryName);
    }

    public boolean checkInstance(Book obj){
        return obj instanceof Book;
    }

    public void displayDetails(Book obj){
        if(checkInstance(obj)){
            System.out.println("---Book Details---");
        System.out.println("Title of Account Holder : " + title);
        System.out.println("Author Name : " + author);
        System.out.println("ISBN : " + isbn);
        System.out.println("----------------------");
        }
        else System.out.println("Not an instance");
    }
}

class InnerBook {
    public static void main(String[] args) {
        Book b1 = new Book("No One", "Viraj", 1234567965);
        b1.displayDetails(b1);
        Book.displayLibraryName();
    }
}
