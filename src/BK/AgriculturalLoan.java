package BK;


public class AgriculturalLoan extends LoanManager {
    private double farmSizeInHectares;

    public AgriculturalLoan(String id, double amt, double rate, int dur, String off, String br, String size) {
    super(id, "Agricultural", amt, rate, dur, off, br);
    try {
        
        this.farmSizeInHectares = Double.parseDouble(size);
    } catch (NumberFormatException e) {
        
        this.farmSizeInHectares = 0.0; 
    }
}

    @Override
    public double calculateInterest() {
        return getLoanAmount() * 0.05; 
    }

    @Override
    public boolean checkEligibility() {
        return farmSizeInHectares >= 0.5;
    }

    @Override
    public void rejectLoan() {
        System.out.println("Reason: Seasonal harvest risk or insufficient land size (" + farmSizeInHectares + "ha)");
        setLoanStatus("Rejected");
    }

    @Override
    public String toString() {
        return super.toString() + " | Farm Size: " + farmSizeInHectares + " Hectares";
    }
}