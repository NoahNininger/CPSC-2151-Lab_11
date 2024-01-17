/* Noah Nininger (no partner :/) */
package cpsc2150.banking;

import cpsc2150.banking.controllers.*;
import cpsc2150.banking.views.*;
import cpsc2150.banking.models.*;


public class MortgageApp {
    public static void main(String [] args) {
        IMortgageView view = new MortgageView();
        IMortgageController controller = new MortgageController(view);
        view.setController(controller);
        controller.submitApplication();
    }
}