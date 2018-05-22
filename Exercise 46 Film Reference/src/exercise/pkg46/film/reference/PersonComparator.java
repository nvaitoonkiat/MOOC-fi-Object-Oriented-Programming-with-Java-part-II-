/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg46.film.reference;

import java.util.Comparator;
import java.util.Map;

/**
 *
 * @author vaitnx
 */
public class PersonComparator implements Comparator<Person>{
    private Map<Person,Integer> peopleIdentities;
    public PersonComparator(Map<Person, Integer> peopleIdentities){
        this.peopleIdentities = peopleIdentities;
    }
}
