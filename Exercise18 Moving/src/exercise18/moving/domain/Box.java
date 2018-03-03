/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise18.moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neil
 */
public class Box implements Thing{
    private int maximumCapacity, currentCapacity;
    private List<Thing> things = new ArrayList<>();

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }
    public boolean addThing(Thing thing){
        this.things.add(thing);
    }

    @Override
    public int getVolume() {
        
    }
    
}
