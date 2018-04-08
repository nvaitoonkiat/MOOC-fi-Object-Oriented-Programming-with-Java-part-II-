/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg34.file.reading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Neil
 */
public class FileManager {
    public ArrayList<String> read(String file){
        ArrayList<String> input = new ArrayList<>();
        String fileName = file;
        String line = null;
        
          try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                input.add(line);
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
        return input;  
    }
    public void save(String file, String text) throws IOException{
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }
    public void save(String file, ArrayList<String> texts) throws IOException{
        FileWriter writer = new FileWriter(file,true);
        for(String str : texts){
            writer.write(str);
        }
        writer.close();
    }
}
