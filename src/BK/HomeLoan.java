package BK;


public class HomeLoan extends LoanManager {
    private String propertyAddress;

    public HomeLoan(String id, double amt, double rate, int dur, String off, String br, String address) {
        super(id, "Home", amt, rate, dur, off, br);
        this.propertyAddress = address;
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest() * 0.9;
    }

    @Override
    public String toString() {
        return super.toString() + " | Property Address: " + propertyAddress;
    }
}