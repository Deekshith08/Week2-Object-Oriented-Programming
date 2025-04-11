//3


public class Employee {
    static String companyName = "Capgi";
    String name;
    final int id;
    String designation;
    static int noofEmployees = 0;

    Employee(String name, final int id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        noofEmployees++;
    }

    public static void displayTotalEmployees(){
        System.out.println("Total number of employees : " + noofEmployees);
    }


    public boolean checkInstance(Employee obj){
        return obj instanceof Employee;
    }

    public void displayDetails(Employee obj){
        if(checkInstance(obj)){
            System.out.println("---Employee Details---");
        System.out.println("Name : " + name);
        System.out.println("Employee id : " + id);
        System.out.println("designation : " + designation);
        System.out.println("----------------------");
        }
        else System.out.println("Not an instance");
    }
}

class emp{
    public static void main(String[] args) {
        Employee e1 = new Employee("Manoj", 1, "Manager");
        e1.displayDetails(e1);
        Employee e2 = new Employee("Akash", 2, "HR");
        e2.displayDetails(e2);
        Employee.displayTotalEmployees();
    }
}