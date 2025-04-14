//Sample Problem 1: Restaurant Management System with Hybrid Inheritance

interface Worker {

    void performDuties();
}

public class Person {

    String name;
    int id;

    Person(String name, int id){
        this.name = name;
        this.id = id;
    }
    void displayInfo(){
        System.out.println("\nName : " + name);
        System.out.println("Id : " + id);
    }
}

class Chef extends Person implements Worker{
    String chefType;
    Chef(String name, int id, String type){
        super(name, id);
        this.chefType = type;
    }
    @Override
    public void performDuties(){
        System.out.println("He is " + chefType + " chef");
    }
}

class Waiter extends Person implements Worker{
    int tableNo;
    Waiter(String name, int id, int tableNo){
        super(name, id);
        this.tableNo = tableNo;
    }
    @Override
    public void performDuties(){
        System.out.println("Currently Waiter " + name + " is working at table number " + tableNo);
    }
}

class Hotel{
    public static void main(String[] args) {
        Chef c1 = new Chef("Duno",1,"Master");
        c1.displayInfo();
        c1.performDuties();

        Waiter w1 = new Waiter("Manoj", 2, 5);
        w1.displayInfo();
        w1.performDuties();
    }
}