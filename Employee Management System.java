import java.util.ArrayList;
import java.util.List;

interface Department{
    void assignDepartment(String dep);
    void getDepartmentDetails();
}
abstract class Employee{
    private int employeeId;
    private String name;
    private double baseSalary;

    Employee(int id, String name, double base){
        this.employeeId = id;
        this.name = name;
        this.baseSalary = base;
    }

    abstract double calculateSalary();
    void displayDetails(){
        System.out.println("\n----Employee Details----");
        System.out.println("Employee id : " + employeeId);
        System.out.println("Name : " + name);
        System.out.println( " Base Salary : " + baseSalary);
        System.out.println("Total Salary : " + calculateSalary());
    }

    public int getEmployeeId() { return employeeId;}
    public String getEmployeeName() { return name;}
    public double getBaseSalary() { return baseSalary;}

    public void setEmployeeId(int id) { employeeId = id;}
    public void setEmployeeName(String name) { this.name = name;}
    public void setBaseSalary(double salary) { baseSalary = salary;}
}

class FullTimeEmployee extends Employee implements Department{

    private String dept;

    FullTimeEmployee(int id, String name, double base){
        super(id,name,base);
    }

    @Override
    double calculateSalary(){
        return getBaseSalary();
    }
    @Override
    public void assignDepartment(String dep){
        dept = dep;
    }
    @Override
    public void getDepartmentDetails(){
        System.out.println("Department : " + dept);
    }
}

class PartTimeEmployee extends Employee implements Department{

    int workingHours;
    String dept;

    PartTimeEmployee(int id, String name, double base, int hrs){
        super(id, name, base);
        this.workingHours = hrs;
    }
    @Override
    double calculateSalary(){
        return workingHours*getBaseSalary();
    }
    @Override
    public void assignDepartment(String dep){
        dept = dep;
    }
    @Override
    public void getDepartmentDetails(){
        System.out.println("Department : " + dept);
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee f1 = new FullTimeEmployee(1, "Mahi", 50000);
        f1.assignDepartment("HR");

        PartTimeEmployee p1 = new PartTimeEmployee(1, "Raj", 1000, 4);
        p1.assignDepartment("Intern");

        employees.add(f1);
        employees.add(p1);

        for(Employee emp:employees){
            emp.displayDetails();
            if(emp instanceof Department){
                ((Department) emp).getDepartmentDetails();
            }
        }
    }
}