/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg13.rich.first.poor.last;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author vaitnx
 */
public class Exercise13RichFirstPoorLast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Matti"));
        persons.add(new Person("Maija"));
        persons.add(new Person("Maijo"));
        int temp = 30000;

        Account salaryAccount = new Account("NORD-LOL");
        Account salaryAccount1 = new Account("NORD1-LOL");
        Account householdAccount = new Account("SAM-LOL");
        salaryAccount.deposit(4400);
        salaryAccount1.deposit(2000);
        householdAccount.deposit(1561);
        persons.get(0).addAccount(salaryAccount);
        persons.get(1).addAccount(salaryAccount1);
        persons.get(2).addAccount(householdAccount);
        
        System.out.println(persons);
        Collections.sort(persons);
        System.out.println(persons);
    }
    
}
