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
public abstract class Character {
    int x;
    int y;
    int ID;
    public Character() {

    }
    public abstract void move(int x, int y);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getID() {
        return ID;
    }
    
    
    
}
