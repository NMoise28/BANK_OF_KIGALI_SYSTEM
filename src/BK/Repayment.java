package BK;


public class Repayment {
private String paymentId;
    private Loan loan;
    private double amountPaid;
    private String paymentDate;
    private double remainingBalance;

    public Repayment(String paymentId, Loan loan, double amountPaid, String paymentDate) {
        this.paymentId = paymentId;
        this.loan = loan;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
        this.remainingBalance = updateRemainingBalance();
    }

    public double updateRemainingBalance() {
        return loan.calculateTotalRepayment() - amountPaid;
    }

    @Override
    public String toString() {
        return "Payment ID: " + paymentId + " | Remaining: " + remainingBalance;
    }
}

