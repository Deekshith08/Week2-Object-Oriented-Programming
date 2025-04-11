//7



public class Patient {
    static String hospitalName = "Global hospitals";
    String name;
    int age;
    String ailment;
    final int patientID;
    static int patients = 0;

    Patient(String name, int age, String ailment){
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = ++patients;
    }

    static void getTotalPatients(){
        System.out.println("No of Patients : " + patients);
    }

    public boolean checkInstance(Patient obj){
        return obj instanceof Patient;
    }

    public void displayDetails(Patient obj){
        if(checkInstance(obj)){
            System.out.println("---Patient Details---");
        System.out.println("Patient Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Patient ID : " + patientID);
        System.out.println("----------------------");
        }
        else System.out.println("Not an instance");
    }
}

class addPatient{
    public static void main(String[] args) {
        Patient p1 = new Patient("Yash", 33, "Leg Injury");
        p1.displayDetails(p1);
        Patient p2 = new Patient("Manoj", 21, "Brain is not Braining");
        p2.displayDetails(p2);
        Patient.getTotalPatients();
    }
}
