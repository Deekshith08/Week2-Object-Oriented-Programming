//Sample Problem 2: School System with Different Roles

public class Person {
    
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayRole(){
        System.out.println("Name : " + name);
        System.out.println("Age :" + age);
    } 
}

class Teacher extends Person{

    String subject;

    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;        
    }
    @Override
    void displayRole(){
        System.out.println("\nRole : Teacher");
        super.displayRole();
        System.out.println("Subject : " + subject);
    }
}

class Student extends Person{

    char grade;

    Student(String name, int age, char grade){
        super(name, age);
        this.grade = grade;
    }
    @Override
    void displayRole(){
        System.out.println("\nRole : Student");
        super.displayRole();
        System.out.println("Grade : " + grade);
    }
}

class Staff extends Person{

    int staffId;

    Staff(String name,int age, int id){
        super(name, age);
        this.staffId = id;
    }

    void displayRole(){
        System.out.println("\nRole : Staff");
        super.displayRole();
        System.out.println("Staff Id : " + staffId);
    }
}

class PersonDemo{
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Hari", 30, "English");
        t1.displayRole();

        Student s1 = new Student("Raj", 16,'A');
        s1.displayRole();

        Staff st1 = new Staff("Mariyamma",55,1);
        st1.displayRole();

    }
}
