//Sample Problem 1: Library Management with Books and Authors

public class Book {

    String title;
    int publicationYear;

    Book(String title, int year){
        this.title = title;
        this.publicationYear = year;
    }

    void displayInfo(){
        System.out.println("----Book Details----");
        System.out.println("Title : " + title);
        System.out.println("Publication Year : " + publicationYear);
    }
}

class Author extends Book{

    String name;
    String bio;

    Author(String title, int year, String name, String bio){
        super(title,year);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author : " + name);
        System.out.println("Bio : " + bio);
        System.out.println("-----------------");
    }
}

class NewBook{
    public static void main(String[] args) {
        Book b1 = new Book("No One", 2002);
        b1.displayInfo();
        Author a1 = new Author("No One",2002,"Sree","author");
        a1.displayInfo();
    }
}