/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg31.farm.simulator;

/**
 *
 * @author Neil
 */
public class MilkingRobot {
    private BulkTank bulkTank;
    
    public MilkingRobot(){
        this.bulkTank = new BulkTank();
    }
    BulkTank getBulkTank(){
        return this.bulkTank;
    }
    void setBulkTank(BulkTank tank){
        this.bulkTank = tank;
    }
    void milk(Milkable milkable) {
     try {
            this.bulkTank.addToTank(milkable.milk());
        } catch (Exception e) {
            throw new IllegalStateException();
        }   
    }
}
