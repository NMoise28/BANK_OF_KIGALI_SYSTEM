package BK;


public class PersonalLoan extends LoanManager {
    private String purpose;

    public PersonalLoan(String id, double amt, double rate, int dur, String off, String br, String purpose) {
        super(id, "Personal", amt, rate, dur, off, br);
        this.purpose = purpose;
    }

    @Override
    public boolean checkEligibility() {
        // Standard Personal Loan limit 
        return getLoanAmount() < 10000000 && super.checkEligibility();
    }

    @Override
    public String toString() {
        return super.toString() + " | Purpose: " + purpose;
    }
}