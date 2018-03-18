/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg21.printer;

import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Neil
 */
public class Exercise21Printer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        FileReader file = new FileReader("filename12123.txt");
        Printer printer = new Printer("C:\\Users\\Neil\\Documents\\NetBeansProjects\\Mooc FI Java 2\\Exercise 21 Printer\\textfile.txt.txt");

    printer.printLinesWhichContain("ANJSAKNSAJKD");
    System.out.println("-----");
    printer.printLinesWhichContain("Frank Zappa");
    System.out.println("-----");
    printer.printLinesWhichContain("");
    System.out.println("-----");
    }
    
}
