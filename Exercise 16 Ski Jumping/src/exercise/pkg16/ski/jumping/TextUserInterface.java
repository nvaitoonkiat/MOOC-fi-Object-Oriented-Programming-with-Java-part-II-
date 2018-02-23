/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg16.ski.jumping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vaitnx
 */
public class TextUserInterface {
    private Scanner reader;
    private final List<Skiier> skiier = new ArrayList<>();  
    public TextUserInterface() {
    }
    
    public void start(){
        
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants:");
        while(true){
            System.out.print("Participant name:");
            String input=reader.nextLine();System.out.println();
            if(input.equals("")){
                break;
            }
            else{
                skiier.add(new Skiier(input));
            }
        }
    }
}
