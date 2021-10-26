package beforesolidprinciples;

//violating dependancy principle

public class PatientDescription {
    CardiacPatient patient1;

    public void create(CardiacPatient p){
         patient1=p;
    }
    public String getDescription(){
       return patient1.getDescription();
    }
}
