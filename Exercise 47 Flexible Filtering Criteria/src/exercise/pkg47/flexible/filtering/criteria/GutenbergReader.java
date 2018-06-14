/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg47.flexible.filtering.criteria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vaitnx
 */
public class GutenbergReader {
     private List<String> lines;

    public GutenbergReader(String address) throws IllegalArgumentException, FileNotFoundException, IOException {
        // the code which retrieves the book from the Internet
        this.lines = new ArrayList<>();
        File file = new File("C:\\Users\\vaitnx\\Documents\\NetBeansProjects\\Exercise 47 Flexible Filtering Criteria\\test.txt");
 
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null){
          //System.out.println(st);
          this.lines.add(st);
        }
    }

    public List<String> linesWhichComplyWith(Criterion c){
        List<String> complyingLines = new ArrayList<String>();

        for (String line : lines) {
            if (c.complies(line)) {
                complyingLines.add(line);
            }
        }

        return complyingLines;
    }
}
