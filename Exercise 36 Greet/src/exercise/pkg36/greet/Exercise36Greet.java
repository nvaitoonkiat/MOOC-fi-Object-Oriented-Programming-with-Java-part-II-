/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg36.greet;

import javax.swing.SwingUtilities;

/**
 *
 * @author vaitnx
 */
public class Exercise36Greet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);
    }
    
}
