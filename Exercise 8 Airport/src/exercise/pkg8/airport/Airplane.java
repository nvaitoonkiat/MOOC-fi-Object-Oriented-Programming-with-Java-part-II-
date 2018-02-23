/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg8.airport;

import java.util.HashMap;

/**
 *
 * @author vaitnx
 */
public class Airplane {
    private String ID, depCode, destCode;
    private int capacity; 
    public Airplane(String ID, int cap, String dep, String dest){
        this.ID = ID;
        this.capacity = cap;
        this.depCode = dep; 
        this.destCode = dest;
    }
    //Getters and setters for Airplane 
    public void setID(String ID){this.ID = ID;}
    public void setDep(String dep){this.depCode = dep;}
    public void setDest(String dest){this.destCode = dest;}
    public void setCap(int cap){this.capacity = cap;}
    public String getID(){return this.ID;}
    public String getDep(){return this.depCode;}
    public String getDest(){return this.destCode;}
    public int getCap(){return this.capacity;}
    
    
}
