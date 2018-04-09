/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg30.container;

import java.util.ArrayList;

/**
 *
 * @author vaitnx
 */
public class ContainerHistory {
    private ArrayList<Double> history;
    private double maxFlux = 0; 

    public ContainerHistory() {
        this.history = new ArrayList<>();
    }
    public void add(double situation){
        this.history.add(situation);
        
    }
    public void reset(){
        this.history.clear();
    }
    public double maxValue(){
        double temp = this.history.get(0);
        for(Double doub : this.history){
            if(doub > temp){
                temp = doub;
            }
        }
        return temp;
    }
    public double minValue(){
        double temp = this.history.get(0);
        for(Double doub : this.history){
            if(doub < temp){
                temp = doub;
            }
        }
        return temp;
    }
    public double average(){
        double sum=0, num = this.history.size(); 
        for(Double doub : this.history){
            sum += doub;
        }
        return sum/num;
    }
    public double greatestFluctuation(){
        double temp = this.history.get(0), temp2 = 0;
        for(int i = 1; i < this.history.size(); i++){
            double s = Math.abs(this.history.get(i)- this.history.get(i-1));
            if(s > temp2){
                temp2 = s;
            }
            else{
                continue;
            }
        }
        return temp2;
    }
}
