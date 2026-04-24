package BK;


public class StudentLoan extends LoanManager {
    private String universityName;

    public StudentLoan(String id, double amt, double rate, int dur, String off, String br, String university) {
        super(id, "Student", amt, rate, dur, off, br);
        this.universityName = university;
    }

    @Override
    public boolean checkEligibility() {
        return getLoanAmount() <= 5000000 && getDurationMonths() <= 60;
    }

    @Override
    public void approveLoan() {
        System.out.println("Student status verified with " + universityName);
        setLoanStatus("Approved - Education Fund");
    }

    @Override
    public double calculateInterest() {
        return (getLoanAmount() * (getInterestRate() / 100)) * 0.8;
    }

    @Override
    public String toString() {
        return super.toString() + " | University: " + universityName;
    }
}