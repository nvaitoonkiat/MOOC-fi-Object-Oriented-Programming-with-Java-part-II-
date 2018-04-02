/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vaitnx
 */
public class Group implements Movable {
    private final List<Movable> group;
    public Group() {
        this.group = new ArrayList<>();
    }
    public void addToGroup(Movable movable){
        this.group.add(movable);
    }
    @Override
    public void move(int x, int y){
        for(Movable mov : this.group){
            mov.move(x, y);
        }
    }

    @Override
    public String toString() {
        for(Movable mov : this.group){
            System.out.println(mov.toString());
        }
        return "";
    }
    
}
