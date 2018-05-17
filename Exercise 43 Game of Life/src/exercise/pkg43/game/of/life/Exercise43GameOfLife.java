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
public class Exercise43GameOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonalBoard board = new PersonalBoard(10, 10);
        board.initiateRandomCells(0.7);
        board.playTurn();
        //System.out.println(board.getNumberOfLivingNeighbours(1, 2));
        

    }
    
}
