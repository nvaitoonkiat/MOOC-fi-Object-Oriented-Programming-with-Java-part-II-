/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg16.ski.jumping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vaitnx
 */
public class TextUserInterface {
    private Scanner reader;
    private final List<Skiier> skiier = new ArrayList<>();  
    public TextUserInterface(Scanner reader) {
        this.reader = reader;
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
        System.out.println("The tournament begins");
        System.out.println();
        System.out.println("Write 'jump' or else quit");
        
        int i = 0;
        while(true){
            Jumps jump = new Jumps();
            String input=reader.nextLine();System.out.println();
            if(input.equals("jump")){
                jump.startJump(i);
                jump.printSkiiers(skiier);
                Random rand = new Random();
                int jumps = rand.nextInt(100) + 60;
                int votes = rand.nextInt(20) + 10;
                
                
            }
            else{
                break;
            }
        }
    }
}
