package BK;


import java.util.Scanner;

public class InputValidator {
   public static double getValidDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Error: Input cannot be empty.");
                continue;
            }
            try {
                double val = Double.parseDouble(input);
                if (val <= 0) throw new NumberFormatException();
                return val;
            } catch (NumberFormatException e) {
                System.out.println("Error: Enter a positive numeric value.");
            }
        }
    }
    public static String getValidName(Scanner sc, String prompt) {
    while (true) {
        System.out.print(prompt);
        String input = sc.nextLine().trim();
        if (input.matches("^[a-zA-Z\\s]{2,50}$")) {
            return input;
        }
        System.out.println("Error: Name must contain only letters (min 2 characters).");
    }
}

    public static String getValidPhone(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            if (input.matches("^07[23789][0-9]{7}$")) return input;
            System.out.println("Error: Invalid Phone format,phone number must be 10 digits (e.g., 07XXXXXXXX).");
        }
    }

    public static String getValidID(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            if (input.matches("^[0-9]{16}$")) return input;
            System.out.println("Error: National ID must be exactly 16 digits.");
        }
    }
    public static String getValidLid(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            if (!input.isEmpty() && input.length() >= 3) return input;
            System.out.println("Error: LoanID must be more than 3 characters.");
        }
    }
}