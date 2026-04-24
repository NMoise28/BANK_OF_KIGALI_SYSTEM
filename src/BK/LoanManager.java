package BK;


public class LoanManager extends Loan implements Payable {
    private String officerName;
    private String branchLocation;
    protected double paidAmount = 0;

    public LoanManager(String loanId, String loanType, double loanAmount, double interestRate, 
                       int durationMonths, String officerName, String branchLocation) {
        super(loanId, loanType, loanAmount, interestRate, durationMonths);
        this.officerName = officerName;
        this.branchLocation = branchLocation;
    }

    @Override
    public void approveLoan() {
        setLoanStatus("Approved");
    }

    @Override
    public double calculateInterest() {
        return getLoanAmount() * (getInterestRate()/100);
    }

    @Override
    public double calculateMonthlyInstallment() {
        return calculateTotalRepayment() / getDurationMonths();
    }

    @Override
    public double calculateTotalRepayment() {
        return getLoanAmount() + calculateInterest();
    }

    @Override
    public boolean checkEligibility() {
        return getLoanAmount() <= 50000000;
    }

    @Override
    public String generateLoanReport() {
        return "BK Report - Branch: " + branchLocation + " | Officer: " + officerName;
    }

    @Override
    public void rejectLoan() {
        setLoanStatus("Rejected");
    }

    @Override
    public boolean validateLoanDetails() {
        return getLoanAmount() > 0 && getDurationMonths() > 0;

    }

    @Override
    public double calculateRemainingBalance() {
        return calculateTotalRepayment() - paidAmount;
    }

    @Override
    public void generatePaymentReceipt(double amount) {
        System.out.println("--- BK PAYMENT RECEIPT ---");
        System.out.println("Amount Paid: " + amount);
        System.out.println("Balance: " + calculateRemainingBalance());
    }

    @Override
    public void processPayment(double amount) {
        this.paidAmount += amount;
    }


}
