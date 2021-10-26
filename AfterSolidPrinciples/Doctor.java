package AfterSolidPrinciples;

public class Doctor implements PerformOperations,AnalyzePatients{

    public void performOperations()
    {
        System.out.println("Performing Operations");

    }

    public void analyzePatients()
    {
        System.out.println("Checking Patients");
    }
}
