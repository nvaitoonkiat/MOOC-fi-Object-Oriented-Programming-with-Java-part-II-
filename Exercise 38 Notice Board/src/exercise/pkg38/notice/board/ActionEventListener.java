/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg38.notice.board;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

/**
 *
 * @author vaitnx
 */
public class ActionEventListener implements ActionListener{
     private JTextArea origin;
    private JTextArea destination;

    public ActionEventListener(JTextArea origin, JTextArea destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public void actionPerformed(ActionEvent ae) {
        this.destination.setText(this.origin.getText());
        this.origin.setText("");
    }
}
