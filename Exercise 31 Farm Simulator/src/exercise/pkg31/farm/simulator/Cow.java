/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg31.farm.simulator;

import java.util.Random;

/**
 *
 * @author vaitnx
 */
public class Cow implements Milkable, Alive{
    private double udderCap,milkCap=0;
    private String name; 
    private double hours=0;
     private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    public Cow(){
        this.udderCap = 15 + new Random().nextInt(26);
        this.name = NAMES[new Random().nextInt(30)];
        
    }
    public Cow(String name){
        this.udderCap = 15 + new Random().nextInt(26);
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    double getCapacity() {
        return this.udderCap;
    }
    double getAmount(){
        return this.milkCap;
    }
    @Override
    public String toString() {
        return this.name +  " " + this.milkCap + "/" + this.udderCap;
    }

    @Override
    public double milk() {
        double temp;
        temp = this.milkCap;
        this.milkCap = 0;
        return temp;
    }

    @Override
    public void liveHour() {
        this.hours++;
        this.milkCap += .7 + new Random().nextInt(2);
    }
    
}
