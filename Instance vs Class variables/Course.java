//2
/*Design a Course class with:
Instance Variables: courseName, duration, fee.
Class Variable: instituteName (common for all courses).
Methods:
An instance method displayCourseDetails() to display the course details.
A class method updateInstituteName() to modify the institute name for all courses.
 */
public class Course {
    String courseName;
    int duration;
    int fee;
    static String instituteName = "SRMIST";

    Course(String courseName, int duration, int fee){
        this.courseName = courseName;
        this.duration =duration;
        this.fee = fee;
    }

    public void displayCourseDetails(){
        System.out.println("---Course Details---");
        System.out.println("Course name : " + courseName);
        System.out.println("Duration : " + duration + " years");
        System.out.println("Fee : " + fee);
    }

    public static void updateInstituteName(String newname){
        instituteName = newname;
    }
}
class select{
    public static void main(String[] args){
        Course c1 = new Course("CSE", 4, 400000);
        c1.displayCourseDetails();
        System.out.println(Course.instituteName);
        Course.updateInstituteName("Harvard");
        System.out.println(Course.instituteName);
    }
}
