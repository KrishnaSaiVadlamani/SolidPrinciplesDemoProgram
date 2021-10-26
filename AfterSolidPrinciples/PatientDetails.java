package AfterSolidPrinciples;

public class PatientDetails {
    //single responsibility principle
    public static void printpatientDetails(String diseaseName, int bill, String description){
        System.out.println(description);
        System.out.println("The patient with "+diseaseName+" will be charged "+bill+" considering all the extra charges.\n\n");
    }
}
