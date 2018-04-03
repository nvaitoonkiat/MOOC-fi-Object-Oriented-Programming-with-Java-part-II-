/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg29.person.and.their.heir;

import people.Person;
import people.Student;
import people.Teacher;

/**
 *
 * @author vaitnx
 */
public class Exercise29PersonAndTheirHeir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);
        System.out.println("");
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());
        System.out.println("");
        Teacher pekka1 = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esk2o = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( pekka1 );
        System.out.println( esk2o );
    }
    
}
