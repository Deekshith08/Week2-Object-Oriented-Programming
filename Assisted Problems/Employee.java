//2 - Employee Management System

public class Employee {
    String name;
    int id;
    int salary;

    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails(){
        //System.out.println("Employee Details : ");
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee{

    int teamSize;

    Manager(String name, int id, int salary, int teamSize){
        super(name,id,salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails(){
        System.out.println("\nManager Details : ");
        super.displayDetails();
        System.out.println("Team Size : "+ teamSize);
    }
}

class Developer extends Employee{

    String programmingLanguage;

    Developer(String name, int id, int salary, String language){
        super(name,id,salary);
        this.programmingLanguage = language;
    }

    @Override
    void displayDetails(){
        System.out.println("\nDeveloper Details : ");
        super.displayDetails();
        System.out.println("Programming Language : "+ programmingLanguage);
    }
}

class Intern extends Employee{

    int duration;

    Intern(String name, int id, int salary, int duration){
        super(name,id,salary);
        this.duration = duration;
    }

    @Override
    void displayDetails(){
        System.out.println("\nIntern Details : ");
        super.displayDetails();
        System.out.println("Duration of Internship : " + duration);
    }
}

class Office{
    public static void main(String[] args){
        Manager m1 = new Manager("Raj",001,100000,7);
        m1.displayDetails();
        Developer d1 = new Developer("Yash", 1, 30000, "java");
        d1.displayDetails();
    }
}