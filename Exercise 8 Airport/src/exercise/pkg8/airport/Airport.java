/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg8.airport;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author vaitnx
 */
public class Airport {
    private HashMap<String, Integer> planeList;
    
    public Airport(){
        this.planeList = new HashMap<String,Integer>(); 
    }
    
    public void addAirplane(String ID , int cap){
        if(this.planeList.containsKey(ID)){
            System.out.println("Already contains that ID");
        }
        else{
        this.planeList.put(ID,cap);
        }
   }
    public boolean doesIDExist(String ID){
        if(this.planeList.containsKey(ID)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getCap(String ID){
        return this.planeList.get(ID);
    }
    public int printPlane(String ID){
        if(this.planeList.containsKey(ID)){
            return (this.planeList.get(ID));
        }
        return 0;
    }
    public ArrayList<String> planeList(){
        ArrayList<String> list = new ArrayList<>();
        for(String key : this.planeList.keySet()){
            list.add(key + " (" + this.planeList.get(key) + ")");
        }
        return list;
    }
}
