package beforesolidprinciples;

interface Patient {
    public String getDescription();
    public int getBill();
    public void extraCharges(String extras);  //Violating Interface Segregation
    public void setDiseaseName(String diseaseName);
    public String getDiseaseName();
}
