/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg40.calculator;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 *
 * @author vaitnx
 */
public class UserInterface implements Runnable{
    private JFrame frame;
    private Calculator calc;

    public UserInterface() {
        
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
        
        
        
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JTextArea jText = new JTextArea();
        JTextArea nameText = new JTextArea();
        
        //JButton copyButton = new JButton("Click");
        //ClickListener click = new ClickListener(nameText,this.calc);
        //copyButton.addActionListener(click);
        container.add(nameText);
        container.add(jText);
        container.add(createPanel(jText,nameText), BorderLayout.SOUTH);
        //container.add(copyButton);
        
    }

    public JFrame getFrame() {
        return frame;
    }
     private JPanel createPanel(JTextArea input, JTextArea output) {
        
        JPanel panel = new JPanel(new GridLayout(1, 3));
        JButton plus = new JButton("+");
        JButton minus = new JButton("Z");
        JButton z = new JButton("-");
        
        ClickListener click = new ClickListener(input,output,plus,minus,z);
        plus.addActionListener(click);
        minus.addActionListener(click);
        z.addActionListener(click);
        panel.add(plus);
        panel.add(minus);
        panel.add(z);
        return panel;
    }
}
