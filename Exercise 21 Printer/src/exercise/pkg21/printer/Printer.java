/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg21.printer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Neil
 */
public class Printer {
    private final FileReader file;
    private Scanner r;
    private final BufferedReader bufferedReader;
    ArrayList<String> ans= new ArrayList<String>();
    //private final InputStreamReader input;

    public Printer(String fileName) throws Exception {
        this.file = new FileReader(fileName);
        this.bufferedReader =  new BufferedReader(this.file);
         String line = null;
         try {
            while((line = this.bufferedReader.readLine()) != null) {
                //System.out.println(line);
                ans.add(line);
            }   

            // Always close files.
            //bufferedReader.close();         
        }
        catch(IOException e) {
          
        }
    }

    public void printLinesWhichContain(String word) throws Exception {
       for(String str : this.ans){
           if(str.contains(word)){
               System.out.println(str);
           }
       }
    }
}
