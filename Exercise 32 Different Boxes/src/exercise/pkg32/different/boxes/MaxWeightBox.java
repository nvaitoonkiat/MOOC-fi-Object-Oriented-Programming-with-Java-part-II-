/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg32.different.boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vaitnx
 */
public class MaxWeightBox extends Box{
    private int maxWeight,currentWeight;
    private List<Thing> things;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.things = new ArrayList<>();
    }
    

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.things.contains(thing)){
            return true;
        }
        else{return false;}
        
    }

    @Override
    public void add(Thing thing) {
        if((this.currentWeight + thing.getWeight()) > this.maxWeight){
            System.out.println("Full");
        }
        else{
            this.things.add(thing);
            this.currentWeight += thing.getWeight();
        }
    }
    
    
}
