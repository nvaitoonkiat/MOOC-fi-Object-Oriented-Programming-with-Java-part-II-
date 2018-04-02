/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg28.groups;

import movable.Group;
import movable.Organism;

/**
 *
 * @author vaitnx
 */
public class Exercise28Groups {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
            Organism organism = new Organism(20, 30);
            System.out.println(organism);
            organism.move(-10, 5);
            System.out.println(organism);
            organism.move(50, 20);
            System.out.println(organism);
            
            System.out.println("");
            Group group = new Group();
            group.addToGroup(new Organism(73, 56));
            group.addToGroup(new Organism(57, 66));
            group.addToGroup(new Organism(46, 52));
            group.addToGroup(new Organism(19, 107));
            group.move(1, 1);
            System.out.println(group);
            
    }
    
}
