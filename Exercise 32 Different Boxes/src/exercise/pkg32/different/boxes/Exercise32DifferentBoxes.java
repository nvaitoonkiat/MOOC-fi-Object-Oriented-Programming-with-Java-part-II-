/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg32.different.boxes;

import java.io.IOException;

/**
 *
 * @author vaitnx
 */
public class Exercise32DifferentBoxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo", 5));
        coffeeBox.add(new Thing("Pirkka", 5));
        coffeeBox.add(new Thing("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInTheBox(new Thing("Saludo")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak")));
        System.out.println("");
          OneThingBox box = new OneThingBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));
        System.out.println("");
           BlackHoleBox box1 = new BlackHoleBox();
        box1.add(new Thing("Saludo", 5));
        box1.add(new Thing("Pirkka", 5));

        System.out.println(box1.isInTheBox(new Thing("Saludo")));
        System.out.println(box1.isInTheBox(new Thing("Pirkka")));
    }
    
}
