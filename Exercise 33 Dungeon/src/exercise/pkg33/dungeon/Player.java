/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg33.dungeon;

/**
 *
 * @author vaitnx
 */
public class Player extends Character{

    public Player() {
        this.x = 0;
        this.y = 0;
        ID = 1;
    }
    
    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
    
}
