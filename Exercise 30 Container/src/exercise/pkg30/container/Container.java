/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg30.container;

/**
 *
 * @author vaitnx
 */
public class Container {
    private double capacity,volume;
    
    public Container(double capacity){
        this.capacity = capacity;
    }
    public double getVolume(){
        return this.volume;
    }
    public double getOriginalCapacity(){
        return this.capacity;
    }
    public double getCurrentCapacity(){
        return (this.capacity - this.volume);
    }
    public void addToTheContainer(double amount){
        this.volume += amount;
    }
    public double takeFromTheContainer(double amount){
        this.volume -= amount;
        return this.volume;
    }
    @Override
    public String toString(){
        return "volume = " + this.volume + " , free space = " + (this.capacity - this.volume);
    }
}
