/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg36.greet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author vaitnx
 */
public class MessageListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Message received!");
    }
}
