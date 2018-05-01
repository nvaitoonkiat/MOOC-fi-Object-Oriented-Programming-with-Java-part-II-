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
public class Box extends Figure{
    private int width, height;

    public Box(int width, int height, int x, int y) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
     public void draw(Graphics graphics){
        graphics.fillRect(getX(), getY(), width, height);
    }
}
