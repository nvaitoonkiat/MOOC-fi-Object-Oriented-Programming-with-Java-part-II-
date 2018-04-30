/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg40.calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
/**
 *
 * @author vaitnx
 */
public class ClickListener  implements ActionListener{
    private JTextArea output;
    private JTextArea input;
    private Calculator calc;private JButton z, plus , minus;

    public ClickListener(JTextArea input, JTextArea output, JButton plus,JButton minus, JButton z) {
        this.input = input;
        this.output = output;
        this.calc = new PersonalCalculator(input,output);
        this.z = z;
        this.minus = minus;
        this.plus = plus;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
//         int inputNum1 = Integer.parseInt(this.input.getText());
//         this.output.setText(Integer.toString(inputNum1));
        if(e.getActionCommand().equals("+")){
            int inputNum1 = Integer.parseInt(this.input.getText());
            int inputNum2 = Integer.parseInt(this.output.getText());
            
            this.output.setText(Integer.toString(calc.increase(inputNum1, inputNum2)));
        }
        if(e.getActionCommand().equals("-")){
            int inputNum1 = Integer.parseInt(this.input.getText());
            int inputNum2 = Integer.parseInt(this.output.getText());
            
            this.output.setText(Integer.toString(calc.decrease(inputNum1, inputNum2)));
        }
        if(e.getActionCommand().equals("Z")){
            this.output.setText("0");
        }
        //this.calc.increase();
        //this.origin.setText(" " + this.calc.giveValue());
    }
    
}
