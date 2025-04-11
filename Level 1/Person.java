//3
/* Create a Person class with a copy constructor that clones another person's attributes.
*/


public class Person {
    
    private String name;

    Person(String name){
        this.name = name;
        System.out.println("New Person");
    }

    Person(Person previousPerson){
        this.name = previousPerson.name;
        System.out.println("Person already called");
    }

    public void setName(String name){
        this.name = name;
    }

    
    void display(){
        System.out.println("Name : " + name);
    }
}

class calle{
    public static void main(String[] args){
        Person p1 = new Person("Yash");
        p1.display();
        Person p2 = new Person(p1);
        p2.display();
        p2.setName("Raju");
        p2.display();
    }
}
