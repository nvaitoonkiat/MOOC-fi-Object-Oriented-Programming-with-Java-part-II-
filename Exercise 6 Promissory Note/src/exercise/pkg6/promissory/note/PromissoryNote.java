/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg6.promissory.note;

import java.util.HashMap;

/**
 *
 * @author vaitnx
 */
public class PromissoryNote {
    private HashMap<String, Double> noted;
    private String name;
    private double value;
    public PromissoryNote(){
        this.noted = new HashMap<String,Double>();
    }
    public void setLoan(String toWhom, double value){
        this.noted.put(toWhom, value);
    }
    public double howMuchIsTheDebt(String whose){
        if(this.noted.containsKey(whose)){
            return this.noted.get(whose);
        }
        return 0;
    }
}
