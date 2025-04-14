//1- Animal Hierarchy

public class Animal {

    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void makesound(){
        System.out.println("Animal makes sounds");
    }
}

class Dog extends Animal {

    Dog(String name, int age){
        super(name,age);
    }
    @Override
    void makesound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{

    Cat(String name, int age){
        super(name,age);
    }
    @Override
    void makesound(){
        System.out.println("Cat Meows");
    }
}

class Bird extends Animal{

    Bird(String name, int age){
        super(name,age);
    }
    @Override
    void makesound(){
        System.out.println("Bird Chirps");
    }
}

class Zoo{
    public static void main(String[] args){
        Animal a = new Animal("Chin",9);
        a.makesound();
        Dog d = new Dog("Pano",4);
        d.makesound();
        Cat c = new Cat("Messi",2);
        c.makesound();
    }
}