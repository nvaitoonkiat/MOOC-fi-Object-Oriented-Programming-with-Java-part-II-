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
public class Square extends Figure{
    private int sideLength;

    public Square(int sideLength, int x, int y) {
        super(x, y);
        this.sideLength = sideLength;
    }
    public void draw(Graphics graphics){
        graphics.fillRect(getX(), getY(), sideLength, sideLength);
    }
}
