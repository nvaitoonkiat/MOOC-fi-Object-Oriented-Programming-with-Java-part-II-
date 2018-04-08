/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg35.two.direction.dictionary;

import java.io.IOException;

/**
 *
 * @author Neil
 */
public class Exercise35TwoDirectionDictionary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        MindfulDictionary dict = new MindfulDictionary();
        dict.add("apina", "monkey");
        dict.add("banaani", "banana");
        dict.add("ohjelmointi", "programming");
        dict.remove("apina");
        dict.remove("banana");

        System.out.println( dict.translate("apina") );
        System.out.println( dict.translate("monkey") );
        System.out.println( dict.translate("banana") );
        System.out.println( dict.translate("banaani") );
        System.out.println( dict.translate("ohjelmointi") );
        
        MindfulDictionary dict1 = new MindfulDictionary("src/words.txt");

        System.out.println( dict1.translate("apina") );
        System.out.println( dict1.translate("ohjelmointi") );
        System.out.println( dict1.translate("alla oleva") );
        dict.save();
    }
    
}
