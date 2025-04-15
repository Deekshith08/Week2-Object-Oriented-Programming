import java.util.List;
import java.util.ArrayList;
interface MedicalRecord{
    void addRecord(Patient p);
    void viewRecords();
}

abstract class Patient implements MedicalRecord{

    abstract void calculateBill();

    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<Patient> patients = new ArrayList<>();


    Patient(int id, String name, int age, String diagnosis){
        this.patientId = id;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDiagnosis() { return diagnosis; }

    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis;    }
    @Override
    public void addRecord(Patient p){
        patients.add(p);
    }
    @Override
    public void viewRecords(){
        for(Patient p:patients){
            System.out.println("Id: " + p.getPatientId() + ", Name : " + p.getName());
        }
    }
    void getPatientDetails(){
        System.out.println("\n----Patient Details----");
        System.out.println("Patient Name : " + name);
        System.out.println("Patient Id : " + patientId);
        System.out.println("Age : " + age);
        System.out.println("Diagnosis : " + diagnosis);
    }
}

class InPatient extends Patient{
    int days;
    int dailyRate;
    InPatient(int id, String name, int age,String diagnosis, int days, int dailyRate){
        super(id, name, age,diagnosis);
        this.days = days;
        this.dailyRate = dailyRate;
    }
    @Override
    void calculateBill(){
        System.out.println("Bill : " + days*dailyRate);
    }
}

class OutPatient extends Patient{
    int consultFee;
    OutPatient(int id, String name, int age,String diagnosis, int consultFee){
        super(id, name, age,diagnosis);
        this.consultFee = consultFee;
    }
    @Override
    void calculateBill(){
        System.out.println("Bill : " + consultFee);
    }
}

class Hospi{
    public static void main(String[] args) {
        InPatient in1 = new InPatient(1, "Raj", 25, "Cancer", 8, 500);
        OutPatient out1 = new OutPatient(1, "Dany", 77, "Diabetes", 700);

        in1.addRecord(in1);
        in1.getPatientDetails();
        in1.calculateBill();

        out1.addRecord(out1);
        out1.getPatientDetails();
        out1.calculateBill();

        in1.viewRecords();
    }
}