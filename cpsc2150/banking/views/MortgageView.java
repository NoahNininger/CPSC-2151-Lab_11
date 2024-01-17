/* Noah Nininger (no partner :/) */
package cpsc2150.banking.views;

import java.util.Scanner;
import cpsc2150.banking.controllers.*;

public class MortgageView implements IMortgageView {
    private IMortgageController controller;
    private Scanner in;

    public MortgageView() { in = new Scanner(System.in); }

    public void setController(IMortgageController c) { controller = c; }

    public double getHouseCost() {
        // user call & response
        System.out.println("How much does the house cost?");
        return in.nextDouble();
    }

    public double getDownPayment() {
        // user call & response
        System.out.println("How much is the down payment?");
        return in.nextDouble();
    }

    public int getYears() {
        // user call & response
        System.out.println("How many years?");
        return in.nextInt();
    }

    public double getMonthlyDebt() {
        // user call & response
        System.out.println("How much are your monthly debt payments?");
        return in.nextDouble();
    }

    public double getYearlyIncome() {
        // user call & response
        System.out.println("How much is your yearly income?");
        return in.nextDouble();
    }

    public int getCreditScore() {
        // user call & response
        System.out.println("What is your credit score?");
        return in.nextInt();
    }

    public String getName() {
        in = new Scanner(System.in);    // removes newline character

        // user call & response
        System.out.println("What's your name?");
        return in.nextLine();
    }

    public void printToUser(String s) {}

    public void displayPayment(double p) {}

    public void displayRate(double r) {}

    public void displayApproved(boolean a) {}

    public boolean getAnotherMortgage() {
        // user call & response
        System.out.println("Would you like to apply for another mortgage? Y/N");
        char input = in.next().charAt(0);

        // input validation
        while (input != 'Y' && input != 'y' && input != 'N' && input != 'n') {
            System.out.println("Response Options restricted to either Y or N (case-insensitive):");
            input = in.next().charAt(0);
        }

        // yes or no
        if (input == 'Y' || input == 'y') { return true; }
        else { return false; }
    }

    public boolean getAnotherCustomer() {
        // user call & response
        System.out.println("Would you like to consider another customer? Y/N");
        char input = in.next().charAt(0);

        // input validation
        while (input != 'Y' && input != 'y' && input != 'N' && input != 'n') {
            System.out.println("Response Options restricted to either Y or N (case-insensitive):");
            input = in.next().charAt(0);
        }

        // yes or no
        if (input == 'Y' || input == 'y') { return true; }
        else { return false; }
    }
}