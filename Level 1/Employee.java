//1
/* Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the
details.
*/

public class Employee{
    //Attributes
    String name;
    int id;
    int salary;

    //constructor
    Employee(String name, int id, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public void displayDetails(){
        System.out.println("Name of Employee : " + name);
        System.out.println("Employee Id: " + id);
        System.out.println("Salary : " + salary);
    }
    public static void main(String[] args){
        Employee emp1 = new Employee("Manoj",1,10000);
        emp1.displayDetails();
    }
}


