//2
/* Create a Student class with attributes name, rollNumber, and marks. Add two methods:
To calculate the grade based on the marks.
To display the student's details and grade.
*/

public class Student{
    String name;
    int rollNumber;
    int marks;

    Student(String name, int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public char grade(){
        if(marks>=91) return 'O';
        else if(marks>=81) return 'A';
        else if(marks>=71) return 'B';
        else if(marks>=61) return 'C';
        else if(marks>=51) return 'D';
        else return 'F';
    }
    public void displayDetails(){
        System.out.println("----Student Report----");
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + grade());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Raj", 1, 88);
        s1.displayDetails();
    }
}