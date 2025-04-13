//Problem 1: School and Students with Courses (Association and Aggregation)


import java.util.List;
import java.util.ArrayList;
public class School {
    
    String schoolName;
    List <Student> students;

    School(String name){
        this.schoolName = name;
        this.students = new ArrayList<>();
    }

    void addStudent(Student st){
        students.add(st);
    }

    String getSchoolName(){
        return schoolName;
    }

    void showStudents(){
        System.out.println("Students in " + schoolName + " school ara : ");
        for(Student stds:students){
            System.out.println("Student Name : " + stds.getStudentName() + " , Roll No : " + stds.getRollNo());
        }
    }
}

class Student{

    String studentName;
    int rollNo;
    List <Course> stcourses;

    Student(String name, int roll){
        this.studentName = name;
        this.rollNo = roll;
        this.stcourses = new ArrayList<>();
    }

    String getStudentName(){
        return studentName;
    }

    int getRollNo(){
        return rollNo;
    }

    void enrollCourse(Course cr){
        stcourses.add(cr);
        System.out.println("Student " + studentName + " have enrolled for the course " + cr.getcourseName());
    }

    void enrolledCourses(){
        System.out.println("Courses enrolled by " + studentName + " are : ");
        for(Course cr : stcourses){
            System.out.println("Course : " + cr.getcourseName() + " , id : " + cr.getCourseid());
        }
    }
}

class Course{

    String courseName;
    int courseid;
    List <Student> studs;

    Course(String name, int id){
        this.courseName = name;
        this.courseid = id;
        this.studs = new ArrayList<>();
    }

    String getcourseName(){
        return courseName;
    }

    int getCourseid(){
        return courseid;
    }

    void addStudent(Student s){
        studs.add(s);
        System.out.println("Student " + s.getStudentName() + " has added in the course " + courseName);
    }

    void enrolledStudents(){
        System.out.println("The students enrolled for " + courseName + " course is : ");
        for(Student std:studs){
            System.out.println("Student name : " + std.getStudentName() + ", Roll No : " + std.getRollNo());
        }
    }
}

class schoolStudents{
    public static void main(String[] args) {
        School GHS = new School("Golconda High School");
        Student s1 = new Student("Raj",1);
        Student s2 = new Student("Yash", 2);
        GHS.addStudent(s1);
        GHS.addStudent(s2);
        GHS.showStudents();

        Course cse = new Course("Computer Science",1);
        Course ece = new Course("Electronic and Communication",2);
        cse.addStudent(s1);
        s1.enrollCourse(cse);

        ece.addStudent(s2);
        s2.enrollCourse(ece);

        s1.enrolledCourses();
        s2.enrolledCourses();

        cse.enrolledStudents();
        ece.enrolledStudents();
    }
}