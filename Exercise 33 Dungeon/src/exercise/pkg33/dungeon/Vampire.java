/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg33.dungeon;

import java.util.Random;

/**
 *
 * @author vaitnx
 */
public class Vampire extends Character{
    
    public Vampire(int length, int height) {
        Random rand = new Random();
        this.x = rand.nextInt(length);
        this.y = rand.nextInt(height);
        ID = 2;
    }
    
    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
    
}
