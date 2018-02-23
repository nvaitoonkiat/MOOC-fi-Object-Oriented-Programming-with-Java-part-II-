/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg9.car.registration.center;

import java.util.HashMap;

/**
 *
 * @author vaitnx
 */
public class VehicleRegister {
    HashMap<RegistrationPlate, String> DMV = new HashMap<>();
    public boolean add(RegistrationPlate plate, String owner){
        if(this.DMV.get(plate)!=null){
            return false;
        }
        this.DMV.put(plate, owner);
        return true;
    }
    public String get(RegistrationPlate plate){
        return this.DMV.get(plate);
    }
    public boolean delete(RegistrationPlate plate){
        if(this.DMV.containsKey(plate)){
            this.DMV.remove(plate);
            return true;
        }
        return false;
    }
}
