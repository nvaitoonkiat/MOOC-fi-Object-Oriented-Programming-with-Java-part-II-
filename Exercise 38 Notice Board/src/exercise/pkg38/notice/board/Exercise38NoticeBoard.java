/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg38.notice.board;

import javax.swing.SwingUtilities;

/**
 *
 * @author vaitnx
 */
public class Exercise38NoticeBoard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);
    }
    
}
