package beforesolidprinciples;
//Violating Single Responsibility
public class GeneralDetails {
    public static void printPatientDetails(String diseaseName, int bill, String description){
        System.out.println(description);
        System.out.println("The patient with "+diseaseName+" will be charged "+bill+" considering all the extra charges.\n\n");
    }

    public static void printHospitalDetails(){
        System.out.println("Admitted in Rainbow Hospital");
    }

}