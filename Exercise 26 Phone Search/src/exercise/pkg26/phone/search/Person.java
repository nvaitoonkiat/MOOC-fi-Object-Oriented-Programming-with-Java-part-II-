/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg26.phone.search;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author vaitnx
 */
public class Person {
    private Set<String> phoneNum;
    private String name, street, city;
    
    public Person(String name) {
        this.name = name;
        this.phoneNum = new HashSet<String>();
        this.street = null;
        this.city = null;
    }  
    public Person(String name, String street, String city){
        this.name = name;
        this.phoneNum = new HashSet<String>();
        this.city = city;
        this.street= street;
    }
    public void editAddress(String street, String city){
        this.city = city; 
        this.street = street;
    }
    public void addNumber(String number){
        this.phoneNum.add(number);
    }
    public String getName(){
        return this.name;
    }
    public Set<String> getNumber(){
        if(this.phoneNum.isEmpty()){
            return null; 
        }
        return this.phoneNum;
    }

    public String getStreet() {
        return this.street;
    }
    public String getCity(){
        return this.city;
    }
}
