/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg33.dungeon;

import java.util.Scanner;

/**
 *
 * @author vaitnx
 */
public class Exercise33Dungeon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        Dungeon dungeon = new Dungeon(5,5,2,10,false);
        dungeon.run(reader);
    }
    
}
