package BK;


public class CarLoan extends LoanManager {
    private String vehicleModel;

    public CarLoan(String id, double amt, double rate, int dur, String off, String br, String model) {
        super(id, "Car", amt, rate, dur, off, br);
        this.vehicleModel = model;
    }

    @Override
    public void approveLoan() {
        setLoanStatus("Approved - Vehicle Lien on " + vehicleModel);
    }

    @Override
    public double calculateMonthlyInstallment() {
        return calculateTotalRepayment() / getDurationMonths();
    }

    @Override
    public boolean checkEligibility() {
        return getDurationMonths() <= 48 && getLoanAmount() > 1000000;
    }

    @Override
    public String toString() {
        return super.toString() + " | Vehicle Model: " + vehicleModel;
    }
}