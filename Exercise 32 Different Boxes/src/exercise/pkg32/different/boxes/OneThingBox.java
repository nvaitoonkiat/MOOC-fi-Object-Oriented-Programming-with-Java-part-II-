/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg32.different.boxes;

/**
 *
 * @author vaitnx
 */
public class OneThingBox extends Box{
    private Thing thing;

    public OneThingBox() {
        this.thing = null;
    }
    
    @Override
    public void add(Thing thing) {
        if(this.thing == null){
            this.thing = thing;
        }
        else{
            
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.thing.equals(thing)){
            return true;
        }
        else{
            return false;
        }
    }
    
}
