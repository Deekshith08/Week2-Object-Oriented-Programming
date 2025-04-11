//5


public class Student {
    static String universityName = "Golcondas";
    String name;
    final int rollNumber;
    char grade;
    static int students = 0;

    Student(String name, int rollNumber, char grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        students++;
    }

    static void displayTotalStudents(){
        System.out.println("No. of Students : " + students);
    }

    public boolean checkInstance(Student obj){
        return obj instanceof Student;
    }

    public void displayDetails(Student obj){
        if(checkInstance(obj)){
            System.out.println("---Student Details---");
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Grade : " + grade);
        System.out.println("----------------------");
        }
        else System.out.println("Not an instance");
    }
}

class mainStudent{
    public static void main(String[] args) {
        Student s1 = new Student("Yash", 1, 'O');
        s1.displayDetails(s1);
        Student s2 = new Student("Neel", 2, 'A');
        s2.displayDetails(s2);
        System.out.println("University : " + Student.universityName);
        Student.displayTotalStudents();

    }
}