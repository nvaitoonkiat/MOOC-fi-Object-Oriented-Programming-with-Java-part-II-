/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg41.drawing.board;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author vaitnx
 */
public class DrawingBoard extends JPanel{
     public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        graphics.fillRect(100, 50, 50, 50);
        graphics.fillRect(300, 50, 50, 50);
        graphics.fillRect(50, 200, 50, 50);
        graphics.fillRect(350, 200, 50, 50);
        graphics.fillRect(100, 225, 250, 50);
        
    }
}
