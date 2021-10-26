package beforesolidprinciples;

class GeneralPhysician extends Doctor {


    public void performOperations(){
        //GeneralPhysician cannot perform operations
        throw new UnsupportedOperationException();
    }

    public void analyzePatients(){
        System.out.println("Checking Patients");
    }

}
