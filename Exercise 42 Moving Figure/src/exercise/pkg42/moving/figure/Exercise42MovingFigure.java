/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg42.moving.figure;

import javax.swing.SwingUtilities;

/**
 *
 * @author vaitnx
 */
public class Exercise42MovingFigure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserInterface ui = new UserInterface(new Avatar(30, 30));
        SwingUtilities.invokeLater(ui);
    }
    
}