package beforesolidprinciples;
public class CoronaPatient implements Patient {

    private String diseaseName;
    private int totalExpenses;
    private int bill;


    @Override
    public String getDescription() {
        return "Patient has Covid-19";
    }

    @Override
    public void setDiseaseName(String diseaseName) {
        this.diseaseName=diseaseName;
    }

    public void setTotalExpenses(int totalExpenses) {
        this.totalExpenses=totalExpenses;
    }

    @Override
    public int getBill() {
        bill=totalExpenses+1500;
        return bill;
    }

    @Override
    public void extraCharges(String extras) {
        System.out.println("Extra charges applied for "+extras);
    }

    public String getDiseaseName(){
        return diseaseName;
    }
}
