/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg39.axe.click;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
/**
 *
 * @author vaitnx
 */
public class ClickListener  implements ActionListener{
    private JLabel origin;
    private Calculator calc;

    public ClickListener(JLabel origin, Calculator calc) {
       
        this.origin = origin;
        this.calc = calc;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calc.increase();
        this.origin.setText(" " + this.calc.giveValue());
    }
    
}
