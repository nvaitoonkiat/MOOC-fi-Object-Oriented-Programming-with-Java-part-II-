/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg40.calculator;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author vaitnx
 */
public class PersonalCalculator implements Calculator {
       private int count;
       private JTextArea input; private JTextArea output;
    

    public PersonalCalculator(JTextArea input, JTextArea output) {
        this.count = 0;
        this.input = input;
        this.output = output;
        
        
    }
       @Override
    public int increase(int i, int j){
        return this.count = i + j;
    }   

    public int giveValue() {
        return this.count;
    }

    @Override
    public int decrease(int i, int j) {
        return this.count = j-i;
    }

    @Override
    public void zero() {
        this.count = 0;
    }
    
}
