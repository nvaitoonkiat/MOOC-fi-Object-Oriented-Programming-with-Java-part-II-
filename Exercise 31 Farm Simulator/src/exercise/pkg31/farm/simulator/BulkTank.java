/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg31.farm.simulator;

/**
 *
 * @author vaitnx
 */
public class BulkTank {
    private double capacity;
    private double volume=0;
    public BulkTank() {
        this.capacity = 2000;
    }
    public BulkTank(double capacity) {
        this.capacity = capacity;
    }
    public double getCapacity(){
        return this.capacity;
    }
    public double getVolume(){
        return this.volume;
    }
    public double howMuchFreeSpace(){
        return this.capacity - this.volume;
    }
    public void addToTank(double amount){
        this.volume += amount;
        if(this.volume > this.capacity){
            this.volume = this.capacity;
        }
    }
    public double getFromTank(double amount){
        if(this.volume<=0){
            return 0;
        }
        this.volume -= amount;
        return this.volume;
    }

    @Override
    public String toString() {
        return  volume + "/" + capacity;
    }
    
}
