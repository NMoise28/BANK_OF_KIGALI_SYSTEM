package BK;

public abstract class Loan {
    private String loanId;
    private String loanType;
    private double loanAmount;
    private double interestRate;
    private int durationMonths;
    private String loanStatus;
    public Loan() {
        this.loanStatus = "Pending";
    }

    public Loan(String loanId, String loanType, double loanAmount, double interestRate, int durationMonths) {
        this.loanId = loanId;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.durationMonths = durationMonths;
        this.loanStatus= "Pending";
    }
    public String getLoanId() {
        return loanId;
    }
    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }
    public String getLoanType() {
        return loanType;
    }
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public int getDurationMonths() {
        return durationMonths;
    }
    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }
    public String getLoanStatus() {
        return loanStatus;
    }
    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }
    @Override
    public String toString() {
        return "Loan [loanId=" + loanId + ", loanType=" + loanType + ", loanAmount=" + loanAmount + ", interestRate="
                + interestRate + ", durationMonths=" + durationMonths + ", loanStatus=" + loanStatus + "]";
    }
    // Abstract Methods
    public abstract double calculateInterest();
    public abstract double calculateMonthlyInstallment();
    public abstract boolean checkEligibility();
    public abstract void approveLoan();
    public abstract void rejectLoan();
    public abstract double calculateTotalRepayment();
    public abstract String generateLoanReport();
    public abstract boolean validateLoanDetails();

}
