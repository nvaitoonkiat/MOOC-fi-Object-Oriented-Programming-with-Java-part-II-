/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg9.car.registration.center;

import java.util.Objects;

/**
 *
 * @author vaitnx
 */
public class RegistrationPlate {
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
       this.regCode = regCode;
       this.country = country;
    }
    
    public String getCode(){
        return this.regCode;
    }
    public String getCountry(){
        return this.country;
    }

    @Override
    public String toString(){
        return country+ " "+regCode;
    }

    @Override
    public int hashCode() {
        if(this.regCode == null || this.country == null){
            return 7;
        }
        return this.regCode.hashCode() + this.country.hashCode();
    }
    
    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }
        if(getClass() != object.getClass()){
            return false;
        }
        
        RegistrationPlate plate = (RegistrationPlate) object;
        
        if(this.country != plate.getCountry()){
            return false;
        }
        
        if(this.regCode != plate.getCode()){
            return false;
        }
        return true;
    }
}

