//4
/* Develop an Employee class with:
employeeID (public).
department (protected).
salary (private).
Write methods to:
Modify salary using a public method.
Create a subclass Manager to access employeeID and department.
*/

public class Employee {
    public int employeeID;
    protected String department;
    private int salary;

    Employee(int employeeID, String department, int salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}

class Manager{
    public static void main(String[] args){
        Employee e1 = new Employee(1,"Financial",10000);
        System.out.println(e1.getSalary());
        e1.setSalary(14000);
        System.out.println(e1.getSalary());
        System.out.println("Employee ID : " + e1.employeeID);
        System.out.println("Department : " + e1.department);
    }
}
