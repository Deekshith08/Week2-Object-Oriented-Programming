//1
/*Create a Student class with:
rollNumber (public).
name (protected).
CGPA (private).
Write methods to:
Access and modify CGPA using public methods.
Create a subclass PostgraduateStudent to demonstrate the use of protected members.
 */

public class Student {
    int rollNumber;
    protected String name;
    private float CGPA;

    Student(int rollNumber, String name, float CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public float getcgpa(){
        return CGPA;
    }
    public void setcgpa(float cgpa){
        CGPA = cgpa;
    }
}

class PostgraduateStudent{
    public static void main(String[] args) {
        Student s1 = new Student(1,"YAsh",9.0f);
        System.out.println(s1.getcgpa());     
        s1.setcgpa(9.9f);
        System.out.println(s1.getcgpa());    
        System.out.println(s1.name);
        s1.name = "Raj";
        System.out.println(s1.name);
    }
    
}