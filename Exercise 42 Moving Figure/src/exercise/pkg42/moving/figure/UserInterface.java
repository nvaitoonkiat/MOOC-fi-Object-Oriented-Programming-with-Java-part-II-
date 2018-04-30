/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg42.moving.figure;

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
    private Avatar avatar;
    public UserInterface(Avatar avatar) {
        this.avatar = avatar;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(500, 500));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    private void createComponents(Container container) {
        DrawingBoard drawingBoard = new DrawingBoard(avatar);
        container.add(drawingBoard);
        frame.addKeyListener(new KeyboardListener(avatar, drawingBoard));
        //BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS); 
//        GridLayout layout = new GridLayout(3, 1);
//        container.setLayout(layout);
//        JTextArea jText = new JTextArea();
//        JTextArea nameText = new JTextArea();
//        
//        //JButton copyButton = new JButton("Click");
//        //ClickListener click = new ClickListener(nameText,this.calc);
//        //copyButton.addActionListener(click);
//        container.add(nameText);
//        container.add(jText);
//        container.add(createPanel(jText,nameText), BorderLayout.SOUTH);
        //container.add(copyButton);
        
    }

    public JFrame getFrame() {
        return frame;
    }
     
}
