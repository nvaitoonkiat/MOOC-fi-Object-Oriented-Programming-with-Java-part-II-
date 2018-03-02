/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg16.ski.jumping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author vaitnx
 */
public class Jumps {
    private final List<Skiier> skiier = new ArrayList<>();
    public static int rounds = 1;
    public void startJump(int round){
        System.out.println("Round " + round);
        System.out.println();
        System.out.println("Jumping order:");
    }
    public void printSkiiers(List<Skiier> skiiers){
        for(Skiier skiier : skiiers){
                    System.out.println(skiier);
                }
    }
    public void jump(List<Skiier> skiiers){
        for(Skiier skiier : skiiers){
            skiier.jump();
        }
    }
    public void endRound(List<Skiier> skiiers, int round){
        System.out.println("Results of round " + round);
        for(Skiier skiier : skiiers){
            skiier.printScore(round);
        }
    }
    public void printFinal(List<Skiier> skiiers){
        int count = 1;
        System.out.println("Position           Name");
        for(Skiier skiier : skiiers){
            System.out.print(count + "           " + skiier.getName() + " (" + skiier.total +" points)"); 
            count++;
            System.out.println();
            System.out.print("            jump lengths: " + skiier.getLength());
            System.out.println();
                }
    }
}
