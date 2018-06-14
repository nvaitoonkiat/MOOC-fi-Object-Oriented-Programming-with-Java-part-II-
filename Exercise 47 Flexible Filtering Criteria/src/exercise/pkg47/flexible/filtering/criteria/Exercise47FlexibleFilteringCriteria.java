/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg47.flexible.filtering.criteria;

import java.io.IOException;

/**
 *
 * @author vaitnx
 */
public class Exercise47FlexibleFilteringCriteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalArgumentException, IOException {
        // TODO code application logic here
    String address = "http://web.textfiles.com/computers/386.txt";
    GutenbergReader book = new GutenbergReader(address);

     Criterion criterion = new AtLeastOne(
                    new ContainsWord("beer"),
                    new ContainsWord("milk"),
                    new ContainsWord("oil")
                );

    for (String line : book.linesWhichComplyWith(criterion)) {
        System.out.println(line);
    }
    
   }
}
