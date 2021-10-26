package AfterSolidPrinciples;

import javax.print.Doc;

public class Test {

    public static void main(String[] args) {


        PatientDescription patientDescription=new PatientDescription();  // Dependancy principle
        patientDescription.create(new KidneyPatient());
        System.out.println(patientDescription.getDescription());
        patientDescription.create(new CoronaPatient());
        System.out.println(patientDescription.getDescription());


        Bike bike=new Bike();   //Liskov Substitution Principle
        bike.delivers_through_WithEngineVehicle();

        Bicycle bicycle=new Bicycle();
        bicycle.delivers_through_WithoutEngineVehicle();

        // We have divided the class transpotation into 2 classes one is with engine and another is without engine class
        // where bike extends with engine class and bicycle extends without engine class.

    }
}
