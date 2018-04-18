/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg31.farm.simulator;

import java.util.Collection;

/**
 *
 * @author Neil
 */
public class Barn {
    private BulkTank bulkTank;
    private MilkingRobot milkingRobot = null;

    public Barn(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }
    public BulkTank getBulkTank(){
        return this.bulkTank;
    }
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(this.bulkTank);
    }
    public void takeCareOf(Cow cow){
        try{
            this.milkingRobot.milk(cow);
        }catch (Exception e) {
            throw new IllegalStateException();
        }   
    }
    public void takeCareOf(Collection<Cow> cows){
        try{
            for(Cow cow: cows){
             this.milkingRobot.milk(cow);   
            }
        }catch (Exception e) {
            throw new IllegalStateException();
        }   
    }
    @Override
    public String toString() {
        return "Barn:" + this.bulkTank + ", milkingRobot=" + milkingRobot + '}';
    }
    
}
