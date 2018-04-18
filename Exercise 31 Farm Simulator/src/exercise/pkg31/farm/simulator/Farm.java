/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg31.farm.simulator;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Neil
 */
public class Farm implements Alive{
    private Barn barn;
    private String owner;
    private Collection<Cow> cows;
    
    public Farm(){
        
    }
    public Farm(String owner, Barn barn){
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<>();
    }
    public void liveHour(){
        for(Cow cow: this.cows){
            cow.liveHour();
        }
    }
    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }
    public void manageCows(){
        this.barn.takeCareOf(this.cows);
    }
    public void addCow(Cow cow){
        this.cows.add(cow);
    }
    public String getOwner(){
        return this.owner;
    }
    @Override
    public String toString() {
        String title = "Farm owner: " + this.owner + "\n"
                + "Barn bulk tank: " + this.barn.toString() + "\n"
                + "Animals:" + "\n";
        for (Cow c : cows) {
            title += "        " + c.toString() + "\n";
        }
        return title;
    }
}
