/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg39.axe.click;

/**
 *
 * @author vaitnx
 */
public class PersonalCalculator implements Calculator {
       private int count;

    public PersonalCalculator() {
        this.count = 0;
    }
       @Override
    public void increase(){
        this.count++;
    }   

    public int giveValue() {
        return this.count;
    }
    
}
