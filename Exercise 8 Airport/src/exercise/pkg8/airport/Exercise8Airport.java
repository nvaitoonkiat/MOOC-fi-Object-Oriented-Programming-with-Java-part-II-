/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg8.airport;

import java.util.Scanner;

/**
 *
 * @author vaitnx
 */
public class Exercise8Airport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        Airport JFK = new Airport();
        
        TextUserInterface ui = new TextUserInterface(reader, JFK);
        ui.start();
    }
    
}
