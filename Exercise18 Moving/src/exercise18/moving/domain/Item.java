/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise18.moving.domain;

/**
 *
 * @author Neil
 */
public class Item implements Comparable<Item>{
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return this.getName() + " (" + this.volume + " dm^3)";
    }

    @Override
    public int compareTo(Item t) {
        if(this.volume == t.volume){
            return 0;
        }
        else if(this.volume < t.volume){
            return -1;
        }
        else{return 1;}
    }
    
}
