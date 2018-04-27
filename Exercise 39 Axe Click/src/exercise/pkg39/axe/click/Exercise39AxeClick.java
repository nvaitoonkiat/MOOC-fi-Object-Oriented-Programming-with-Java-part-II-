/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg39.axe.click;

import javax.swing.SwingUtilities;

/**
 *
 * @author vaitnx
 */
public class Exercise39AxeClick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator calc = new PersonalCalculator();
        System.out.println("Value: " + calc.giveValue());
        calc.increase();
        System.out.println("Value: " + calc.giveValue());
        calc.increase();
        System.out.println("Value: " + calc.giveValue());
        // TODO code application logic here
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);
    }
    
}
