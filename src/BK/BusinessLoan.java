package BK;


public class BusinessLoan extends LoanManager {
    private String registrationNumber;

    public BusinessLoan(String id, double amt, double rate, int dur, String off, String br, String regNum) {
        super(id, "Business", amt, rate, dur, off, br);
        this.registrationNumber = regNum;
    }

    @Override
    public double calculateTotalRepayment() {
        return super.calculateTotalRepayment() + (getLoanAmount() * 0.01);
    }

    @Override
    public String generateLoanReport() {
        return super.generateLoanReport() + " | Business Reg: " + registrationNumber + " | Risk Level: Corporate";
    }

    @Override
    public boolean validateLoanDetails() {
        return super.validateLoanDetails() && registrationNumber != null && !registrationNumber.isEmpty();
    }

    @Override
    public String toString() {
        return super.toString() + "BusinessLoan [registrationNumber=" + registrationNumber + "]";
    }
}