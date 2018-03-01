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
public class Skiier {
    private String name;
    private int length,points,vote,total=0;
    private List<Integer> votes = new ArrayList<>();

    public Skiier() {
    }
    
    public Skiier(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return (this.name + " (" + this.total +" points)");
    }
    
    
}
