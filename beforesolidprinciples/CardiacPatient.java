package beforesolidprinciples;

public class CardiacPatient  implements Patient {

    private String diseaseName;
    private int totalExpenses;
    private int bill;

    @Override
    public void setDiseaseName(String diseaseName) {
        this.diseaseName=diseaseName;
    }

    @Override
    public String getDescription() {
        return "Patient has a history of Cardiac disease";
    }

    @Override
    public int getBill() {
        bill=totalExpenses+300;
        return bill;
    }

    public void setTotalExpenses(int totalExpenses) {
        this.totalExpenses=totalExpenses;
    }

    @Override
    public void extraCharges(String extras) {
        System.out.println("Extra charges applied for "+extras);
    }

    @Override
    public String getDiseaseName(){
        return diseaseName;
    }
}
