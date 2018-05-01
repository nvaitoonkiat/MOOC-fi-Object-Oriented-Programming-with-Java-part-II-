/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg42.moving.figure;

import java.awt.Graphics;

/**
 *
 * @author vaitnx
 */
public class Circle extends Figure {

    private final int diameter;

    public Circle(int x, int y, int diameter) {
        super(x, y);
        this.diameter = diameter;
    }
    public void draw(Graphics graphics){
        graphics.fillOval(getX(),getY(), diameter, diameter);
    }
}
