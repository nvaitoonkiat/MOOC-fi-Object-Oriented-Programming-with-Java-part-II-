/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg35.two.direction.dictionary;

import static java.awt.SystemColor.text;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author Neil
 */
public class MindfulDictionary {
    private HashMap<String, String> map1, map2; 
    public MindfulDictionary() {
        this.map1 = new HashMap<>();
        this.map2 = new HashMap<>();
    }
    public MindfulDictionary(String file){
        //Intialize the hash maps to place words and translation
        this.map1 = new HashMap<>();
        this.map2 = new HashMap<>();
        //read file
        String fileName = file, line = null;
         try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
               String[] parts = line.split(":");
                this.map1.put(parts[0], parts[1]);
                this.map2.put(parts[1], parts[0]);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
    public void add(String word, String translation){
        this.map1.put(word, translation);
        this.map2.put(translation, word);
    }
    public String translate(String word){
        if(this.map1.get(word) == null){
            if(this.map2.get(word)==null){
                return null;
            }
            else{
                return this.map2.get(word);
            }
        }
        else{
            return this.map1.get(word);
        }
    }
    public void remove(String word){
        String temp, temp2;
        temp = this.map1.get(word);
        temp2= this.map2.get(word);
        this.map1.remove(word);
        this.map1.remove(temp2);
        this.map2.remove(word);
        this.map2.remove(temp);
    }
    public boolean save() throws IOException{
        String fileName = "src/save.txt";
        FileWriter writer = new FileWriter(fileName, true);
        for (String name: map1.keySet()){
            writer.write(name +  " : " + this.map1.get(name));
            writer.write("/n");
        }
        writer.close();
        return true;
    }
}
