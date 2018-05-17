/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg43.game.of.life;

import java.util.Scanner;

/**
 *
 * @author vaitnx
 */
public abstract class GameOfLifeBoard {
    private int width, height;
    private boolean gameBoard[][], gameBoard2[][];
    public GameOfLifeBoard(int width, int height) {
        this.width = width;
        this.height = height;
        this.gameBoard = new boolean[height][width];
        this.gameBoard2 = new boolean[height][width];
    }
    public boolean[][] getBoard() {
        return this.gameBoard;
    }
    public void setBoard(boolean[][] board){
        this.gameBoard = board;
    }
    public void setBoard2(boolean[][] board){
        this.gameBoard2 = board;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void printBoard(){
           System.out.println("Board 1");
        for (boolean[] x : this.gameBoard)
        {
           for (boolean y : x)
           {
               if(y == true){
                   System.out.print("X " );
               }
               else{
                   System.out.print("_ ");
               }
           }
            System.out.println("");
        }
//        System.out.println("Board 2");
//        for (boolean[] x : this.gameBoard2)
//        {
//           for (boolean y : x)
//           {
//               if(y == true){
//                   System.out.print("X ");
//               }
//               else{
//                   System.out.print("  ");
//               }
//           }
//            System.out.println("");
//        }
    }
    public void findLivingAndDead(){
        for(int x = 0; x<getWidth(); x++){
             for(int y =0; y<getHeight(); y++){
                 if(getNumberOfLivingNeighbours(x, y)<2 || getNumberOfLivingNeighbours(x, y)>3){
                     this.gameBoard2[x][y] = false;
                 }
                 else if(isAlive(x, y) && getNumberOfLivingNeighbours(x, y) == 2){
                     this.gameBoard2[x][y] = true;
                 }
                 else if(getNumberOfLivingNeighbours(x, y) == 3){
                     this.gameBoard2[x][y] = true;
                 }
             }
         }
        this.gameBoard = this.gameBoard2;
    }
    public void playTurn(){
         Scanner input = new Scanner(System.in);
         while(!(input.nextLine().equals("quit"))){
             printBoard();
             findLivingAndDead();
         }
    }
    public abstract void turnToLiving(int x, int y);
    public abstract void turnToDead(int x, int y);
    public abstract boolean isAlive(int x, int y);
    public abstract void initiateRandomCells(double probabilityForEachCell);
    public abstract int getNumberOfLivingNeighbours(int x, int y);
}
