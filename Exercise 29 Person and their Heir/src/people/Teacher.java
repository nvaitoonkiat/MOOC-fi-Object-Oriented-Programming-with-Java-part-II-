/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author vaitnx
 */
public class Teacher extends Person{
    private int sal; 
    public Teacher(String name, String address, int sal) {
        super(name, address);
        this.sal = sal;
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" + "sal=" + sal + '}';
    }
    
}
