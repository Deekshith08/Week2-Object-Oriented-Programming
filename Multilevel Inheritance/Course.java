//Sample Problem 2: Educational Course Hierarchy



public class Course {
    
    String courseName;
    int duration;

    Course(String name, int duration){
        this.courseName = name;
        this.duration = duration;
    }

    void displayCourseinfo(){
        System.out.println("\nCourse Name : " + courseName);
        System.out.println("Duration : " + duration + " months");
    }
}

class OnlineCourse extends Course{

    String platform;
    boolean isRecorded;

    OnlineCourse(String name, int duration, String platform, boolean isRecorded){
        super(name,duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    @Override
    void displayCourseinfo(){
        super.displayCourseinfo();
        System.out.println("Platform : " + platform);
        System.out.println("Recorded : " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse{

    double fee;
    double discount;

    PaidOnlineCourse(String name, int duration, String platform, boolean isRecorded, double fee, double discount){
        super(name, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    @Override
    void displayCourseinfo(){
        super.displayCourseinfo();
        System.out.println("Fees : " + fee);
        System.out.println("Discount : " + discount);
    }
}

class CourseDemo{
    public static void main(String[] args) {
        Course c1 = new Course("Embedded Systems", 3);
        c1.displayCourseinfo();

        OnlineCourse o1 = new OnlineCourse("Java", 4, "Umedy", false);
        o1.displayCourseinfo();

        PaidOnlineCourse p1 = new PaidOnlineCourse("Full Stack", 6, "Era", true, 2000, 100);
        p1.displayCourseinfo();
    }
}