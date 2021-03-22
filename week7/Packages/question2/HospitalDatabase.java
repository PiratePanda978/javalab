package mainPack;

import pack4.doctor;
import pack5.nurse;
import pack3.patient;

public class HospitalDatabase{
    public static void main(String[] args) {
        System.out.println("\nPatient : ");
        patient patient1 = new patient("Arun","Male",24,"Cancer",20000);
        patient1.display();
        System.out.println("\nDoctor : ");
        doctor doctor1 = new doctor("Vijay","Male",45,"02-02-00",50000,"MD","Gastro Intenstinal");
        doctor1.display();
        System.out.println("\nNurse : ");
        nurse nurse1 = new nurse("Meera","Female",30,"03-03-02",35000,"Wet Nurse",8);
        nurse1.display();
    }
}