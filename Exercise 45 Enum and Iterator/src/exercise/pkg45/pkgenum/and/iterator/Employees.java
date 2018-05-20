/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg45.pkgenum.and.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Neil
 */
public class Employees {
    private List<Person> personList;

    public Employees() {
        this.personList = new ArrayList<>();
    }
    public void add(Person person){
        this.personList.add(person);
    }
    public void add(List<Person> persons){
        Iterator<Person> iterator = persons.iterator();
        while(iterator.hasNext()){
            this.personList.add(iterator.next());
        }
    }
    public void print(){
        Iterator<Person> iterator = this.personList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public void print(Education education){
        Iterator<Person> iterator = this.personList.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getEducation().equals(education)){
                System.out.println(iterator.next());
            }
        }
    }
    public void fire(Education education){
        Iterator<Person> iterator = this.personList.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getEducation().equals(education)){
               iterator.remove();
            }
        }
    }
}
