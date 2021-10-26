package beforesolidprinciples;

public class Test {

    public static void main(String[] args) {

        KidneyPatient patient1 = new KidneyPatient();
        patient1.setDiseaseName("Kidney Patient");
        GeneralDetails.printPatientDetails(patient1.getDiseaseName(),
                patient1.getBill(), Description.getsDescription(patient1));//violating open-close
        GeneralDetails.printHospitalDetails();



        Bike bike=new Bike();
        bike.delivers_through_Vehicle();

        Bicycle bicycle=new Bicycle();
        bicycle.delivers_through_Vehicle();          //Liskov Substitution Principle Violation

        // As Transpotation is the parent class of bike and bicycle bike has engine so it Overrides the method
        // where as bicycle doesn't engine it throws us exception.

        PatientDescription patientDescription=new PatientDescription();        // Dependancy principle violation
        patientDescription.create(new CardiacPatient());
        System.out.println(patientDescription.getDescription());

    }
}
// new derived classes just extend without replacing the functionality of old classes.