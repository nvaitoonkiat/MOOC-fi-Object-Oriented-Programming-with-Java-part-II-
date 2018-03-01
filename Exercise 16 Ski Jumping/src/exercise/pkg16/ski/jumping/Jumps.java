/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg16.ski.jumping;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vaitnx
 */
public class Jumps {
    private final List<Skiier> skiier = new ArrayList<>();
    public static int rounds = 1;
    public void startJump(int round){
        System.out.println("Round " + round+1);
        System.out.println();
        System.out.println("Jumping order:");
    }
    public void printSkiiers(List<Skiier> skiiers){
        for(Skiier skiier : this.skiier){
                    System.out.println(skiier);
                }
    }
    
}
