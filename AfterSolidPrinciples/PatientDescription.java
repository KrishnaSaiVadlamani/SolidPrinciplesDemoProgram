package AfterSolidPrinciples;

public class PatientDescription {
    Patient patient1;

    public void create(Patient p){
         patient1=p;
    }
    public String getDescription(){
       return patient1.getDescription();
    }
}
