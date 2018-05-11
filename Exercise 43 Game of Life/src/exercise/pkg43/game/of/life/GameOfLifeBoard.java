/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg43.game.of.life;

/**
 *
 * @author vaitnx
 */
public abstract class GameOfLifeBoard {
    private int width, height;
    private boolean gameBoard[][];
    public GameOfLifeBoard(int width, int height) {
        this.width = width;
        this.height = height;
        this.gameBoard = new boolean[height][width];
    }
    public boolean[][] getBoard() {
        return this.gameBoard;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void playTurn(){
         for (boolean[] x : this.gameBoard)
        {
           for (boolean y : x)
           {
               if(y == true){
                   System.out.print("X ");
               }
               else{
                   System.out.print("  ");
               }
           }
            System.out.println("");
        }
    }
    public abstract void turnToLiving(int x, int y);
    public abstract void turnToDead(int x, int y);
    public abstract boolean isAlive(int x, int y);
    public abstract void initiateRandomCells(double probabilityForEachCell);
    public abstract int getNumberOfLivingNeighbours(int x, int y);
}
