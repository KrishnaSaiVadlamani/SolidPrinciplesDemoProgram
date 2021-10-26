package AfterSolidPrinciples;

interface Patient extends ExtraCharges, GenerateBill, SetDiseaseName {
    //open-closed principle implementation
    public String getDescription();
}
