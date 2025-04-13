//Problem 3: Company and Departments (Composition)

import java.util.List;
import java.util.ArrayList;
public class Company {
    String companyName;
    List <Department> deps;

    Company(String name){
        this.companyName = name;
        this.deps = new ArrayList<>();
    }

    String getCompanyName(){
        return companyName;
    }

    void addDepartment(Department dep){
        deps.add(dep);
    }

    void deleteCompany(){
        for(Department dep:deps){
            dep.emps.clear();
        }
        deps.clear();
        System.out.println("The " + companyName + " caompany has been deleted.");
    }


    void departmentsList(){
        System.out.println("The departments in " + companyName + " company are : ");
        for(Department department: deps){
            System.out.println("Department Name : " + department.getDepartmentName() + " , Department Id : " + department.getDepartmentid());
        }
    }
}

class Department{

    String departmentName;
    int departmentid;
    static int id = 0;
    List <Employee> emps;

    Department(String name){
        this.departmentName = name;
        this.departmentid = ++id;
        this.emps = new ArrayList<>();
    }

    String getDepartmentName(){
        return departmentName;
    }

    int getDepartmentid(){
        return departmentid;
    }

    void addEmployee(Employee emp){
        emps.add(emp);
    }

    void employeesList(){
        System.out.println("The employees in " + departmentName + " are : " );
        for(Employee e:emps){
            System.out.println("Employee Name : " + e.getEmployeeName() + " , Employee id : " + e.getEmployeeid());
        }
    }
}

class Employee{

    String employeeName;
    int employeeid;
    static int eid = 1;

    Employee(String name){
        this.employeeName = name;
        this.employeeid = eid++;
    }

    String getEmployeeName(){
        return employeeName;
    }

    int getEmployeeid(){
        return employeeid;
    }
}

class comp{
    public static void main(String[] args){
        Company aasha = new Company("Aasha");
        Department testing = new Department("Testing");
        Employee e1 = new Employee("Aakash");
        Employee e2 = new Employee("Anand");
        aasha.addDepartment(testing);
        testing.addEmployee(e1);
        testing.addEmployee(e2);
        aasha.departmentsList();
        testing.employeesList();
        aasha.deleteCompany();
        aasha.departmentsList();
    }
}