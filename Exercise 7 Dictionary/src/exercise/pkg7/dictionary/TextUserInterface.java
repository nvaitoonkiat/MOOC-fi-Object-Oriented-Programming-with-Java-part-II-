/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg7.dictionary;

import java.util.Scanner;

/**
 *
 * @author vaitnx
 */
public class TextUserInterface {
    private final Scanner read;
    private final Dictionary dict;
     public TextUserInterface(Scanner reader, Dictionary dictionary){
         this.read = reader;
         this.dict = dictionary;
     }
     public void start(){
         startStatements();

        while (true) {

            System.out.println("Statement:");

            String input = read.nextLine().trim();

            if (input.equalsIgnoreCase("add")) {
                add();
            } else if (input.equalsIgnoreCase("translate")) {
                translate();
            } else if (input.equalsIgnoreCase("quit")) {
                System.out.println("Cheers!");
                break;
            } else {
                System.out.println("Unknown statement");
            }
        }
     }

    private void startStatements() {
        System.out.println("Statements:");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the text user interface");
        System.out.println("");
    }
    
    public void add() {
        System.out.println("In Finnish: ");
        String finnishWord = read.nextLine();
        System.out.println("Translation: ");
        String englishWord = read.nextLine();
        this.dict.add(finnishWord, englishWord);
    }

    public void translate() {
        System.out.println("Give a word: ");
        String finnishWord = read.nextLine();
        String key = dict.translate(finnishWord);
        System.out.println("Translation: " + key);
    }
}
