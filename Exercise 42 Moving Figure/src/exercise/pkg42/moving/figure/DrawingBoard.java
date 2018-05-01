/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg42.moving.figure;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author vaitnx
 */
public class DrawingBoard extends JPanel{
    //private Avatar avatar;
    private Figure figure;
     public DrawingBoard(Figure figure) {
        super.setBackground(Color.WHITE);
        this.figure = figure;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        figure.draw(graphics);
    }
}
