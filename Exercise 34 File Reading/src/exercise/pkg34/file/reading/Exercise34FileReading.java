/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg34.file.reading;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Neil
 */
public class Exercise34FileReading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ArrayList<String> text = new ArrayList<>();
         FileManager f = new FileManager();
         text.add("najsdkdsa");
         text.add("anenmkwmerl");
         f.save("src/testinput2.txt", text);
        for (String line : f.read("src/testinput1.txt")) {
            System.out.println(line);
        }
    }
    
}
