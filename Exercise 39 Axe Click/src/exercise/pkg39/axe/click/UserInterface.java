/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg39.axe.click;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author vaitnx
 */
public class UserInterface implements Runnable{
    private JFrame frame;
    private Calculator calc;

    public UserInterface() {
        this.calc = new PersonalCalculator();
    }
    
    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(200, 100));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    private void createComponents(Container container) {
        
        //BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);
        JLabel nameText = new JLabel(" " + this.calc.giveValue());
        JButton copyButton = new JButton("Click");
        ClickListener click = new ClickListener(nameText,this.calc);
        copyButton.addActionListener(click);
        container.add(nameText);
        container.add(copyButton);
    }

    public JFrame getFrame() {
        return frame;
    }
}
