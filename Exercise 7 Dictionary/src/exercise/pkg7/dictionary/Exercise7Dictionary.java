/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg7.dictionary;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vaitnx
 */
public class Exercise7Dictionary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));
        
        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());
        
        ArrayList<String> translations = dictionary.translationList();
            for(String translation: translations) {
                System.out.println(translation);
            }        
            
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui;
        ui = new TextUserInterface(reader, dict);
        ui.start();
    }
    
}
