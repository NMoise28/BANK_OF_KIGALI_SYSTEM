package Main;

import java.util.Scanner;

import BK.Customer;
import BK.InputValidator;
import BK.LoanFactory;
import BK.LoanManager;

public class LoanSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- WELCOME TO BANK OF KIGALI LOAN SYSTEM ---");

        // 1. Collect Customer Details with improved validation 
        String name = InputValidator.getValidName(sc, "Enter Customer Name: ");
        String natId = InputValidator.getValidID(sc, "Enter National ID: ");
        String phone = InputValidator.getValidPhone(sc, "Enter Phone Number: ");
        Customer customer = new Customer("C-100", name, natId, phone);

        // 2. Loan Details 
        System.out.println("\nSelect Loan Type: 1.Personal | 2.Home | 3.Car | 4.Business | 5.Student | 6.Agricultural");
        int typeChoice = Integer.parseInt(sc.nextLine());

        String lId = InputValidator.getValidLid(sc, "Enter Loan ID: ");
        double amt = InputValidator.getValidDouble(sc, "Enter Loan Amount: ");
        int dur = (int) InputValidator.getValidDouble(sc, "Enter Duration (Months): ");
        System.out.print("Enter Specific Detail (e.g., University, Property Address, Vehicle Model): ");
        String extra = sc.nextLine();

        // 3. Create Loan from LoanFactory
LoanManager myLoan = LoanFactory.createLoan(typeChoice, lId, amt, dur, "BK_OFFICER", "KIGALI_BR", extra);

if (myLoan != null) {
    myLoan.approveLoan();


    System.out.println("\n" + "========================================");
    System.out.println("       BANK OF KIGALI - FINAL REPORT");
    System.out.println("========================================");

    // Group 1: Customer Section 
    System.out.println("\n[ CUSTOMER INFORMATION ]");
    System.out.println("Name:      " + customer.getCustomerName());
    System.out.println("Details:   " + customer.toString());

    // Group 2: Loan Section 
    System.out.println("\n[ LOAN DETAILS ]");
    System.out.println("Loan ID:   " + myLoan.getLoanId());
    System.out.println("Status:    " + myLoan.getLoanStatus());
    System.out.println("Summary:   " + myLoan.toString());

    // Group 3: Financial Summary 
    System.out.println("\n[ FINANCIAL SUMMARY ]");
    System.out.printf("Principal Amount:    %,.2f RWF\n", myLoan.getLoanAmount());
    System.out.printf("Interest Rate:       %.2f%%\n", myLoan.getInterestRate());
    System.out.printf("Total Repayment Due: %,.2f RWF\n", myLoan.calculateTotalRepayment());
    System.out.printf("Monthly Installment: %,.2f RWF\n", myLoan.calculateMonthlyInstallment());
    System.out.println("----------------------------------------");

    // 4. Repayment 
    double payAmt = InputValidator.getValidDouble(sc, "\nEnter amount to pay: ");
    myLoan.processPayment(payAmt);
    myLoan.generatePaymentReceipt(payAmt);
}
}
}