package beforesolidprinciples;

public class Description implements Patient {
    //violating open-close
    public static String getsDescription(Patient patient){
        if (patient instanceof CardiacPatient){
            return "Patient has a history of Cardiac disease";
        }else if(patient instanceof CoronaPatient){
            return "Patient tested positive for COVID-19";
        }else if(patient instanceof KidneyPatient) {
            return "Kidney Failure";
        }
        return "";
    }

    @Override
    public void extraCharges(String extras) {

    }

    @Override
    public int getBill() {
        return 0;
    }

    @Override
    public void setDiseaseName(String diseaseName) {

    }

    @Override
    public String getDiseaseName() {
        return "";
    }

    @Override
    public String getDescription() {
        return "";
    }
}
