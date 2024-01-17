/* Noah Nininger (no partner :/) */
package cpsc2150.banking.controllers;

import cpsc2150.banking.views.*;
import cpsc2150.banking.models.*;

public class MortgageController implements IMortgageController {
    private IMortgageView view;

    // constructor for class initizalizes private member view
    public MortgageController(IMortgageView v) { view = v; }

    // removes the need for magic numbers
    int MAX_CREDIT_SCORE = 850;
    int ZERO = 0;


    // runs the program
    public void submitApplication() {
        // loop per person
        do {
            String name = view.getName();   // takes input

            double yearlyIncome = view.getYearlyIncome();   // takes input
            while (yearlyIncome <= ZERO) {    // input validation
                System.out.println("Income must be greater than 0.");
                yearlyIncome = view.getYearlyIncome();
            }

            double monthlyDebt = view.getMonthlyDebt();     // takes input
            while (monthlyDebt < ZERO) {      // input validation
                System.out.println("Debt must be greater than or equal to 0.");
                monthlyDebt = view.getMonthlyDebt();
            }

            int creditScore = view.getCreditScore();        // takes input
            while (creditScore <= ZERO || creditScore >= MAX_CREDIT_SCORE) {    // input validation
                System.out.println("Credit Score must be greater than 0 and less than 850");
                creditScore = view.getCreditScore();
            }

            // loop for another mortgage
            do {
                double houseCost = view.getHouseCost();     // takes input
                while (houseCost <= ZERO) {        // input validation
                    System.out.println("Cost must be greater than 0.");
                    houseCost = view.getHouseCost();
                }

                double downPayment = view.getDownPayment();     // takes input
                while (downPayment <= ZERO || downPayment >= houseCost) {      // input validation
                    System.out.println("Down Payment must be greater than 0 and less than the cost of the house.");
                    downPayment = view.getDownPayment();
                }

                int years = view.getYears();        // takes input
                while (years <= ZERO) {        // input validation
                    System.out.println("Years must be greater than 0.");
                    years = view.getYears();
                }

                // prints customer info
                ICustomer customer = new Customer(monthlyDebt, yearlyIncome, creditScore, name);
                System.out.print(customer.toString());

                // prints mortgage info
                IMortgage mortgage = new Mortgage(houseCost, downPayment, years, customer);
                System.out.println(mortgage.toString());
            } while (view.getAnotherMortgage());    // another mortgage
        } while (view.getAnotherCustomer());        // another customer
    }
}
