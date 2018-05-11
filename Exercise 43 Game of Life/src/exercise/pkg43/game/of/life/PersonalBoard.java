/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg43.game.of.life;

import java.util.Random;

/**
 *
 * @author vaitnx
 */
public class PersonalBoard extends GameOfLifeBoard{
    
    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void turnToLiving(int x, int y) {
        this.getBoard()[y][x] = true;
    }

    @Override
    public void turnToDead(int x, int y) {
        this.getBoard()[y][x] = false;
    }

    @Override
    public boolean isAlive(int x, int y) {
        return this.getBoard()[y][x];
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        Random rand = new Random();
        for (int i = 0; i<this.getBoard().length; i++){
            for (int j = 0; j<this.getBoard()[i].length; j++){
               double temp = rand.nextDouble();
               if((temp/2 + probabilityForEachCell) > 1){
                   this.turnToLiving(j, i);
               }
               else{
                  
               }
            } 
        }   
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
