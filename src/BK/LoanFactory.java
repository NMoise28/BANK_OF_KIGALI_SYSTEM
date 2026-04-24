package BK;


public class LoanFactory {
    public static LoanManager createLoan(
            int type, String id, double amount, int months, 
            String officer, String branch, String specificAttribute) {
            
        switch (type) {
            case 1:
                // Personal Loan: 18% rate
                return new PersonalLoan(id, amount, 18.0, months, officer, branch, specificAttribute);
            case 2:
                // Home Loan: 12% rate
                return new HomeLoan(id, amount, 12.0, months, officer, branch, specificAttribute);
            case 3:
                // Car Loan: 15% rate
                return new CarLoan(id, amount, 15.0, months, officer, branch, specificAttribute);
            case 4:
                // Business Loan: 14% rate
                return new BusinessLoan(id, amount, 14.0, months, officer, branch, specificAttribute);
            case 5:
                // Student Loan: 8% rate
                return new StudentLoan(id, amount, 8.0, months, officer, branch, specificAttribute);
            case 6:
                // Agricultural Loan: 5% rate
                return new AgriculturalLoan(id, amount, 5.0, months, officer, branch, specificAttribute);
            default:
                return null;
        }
    }
}