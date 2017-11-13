import java.lang.*;
import java.io.*;
import java.util.*;


class Thing{
    private int weight;
    private String name;
    public Thing(){
        
    }
    public Thing(String name, int weight){
        this.name = name; 
        this.weight = weight; 
    }
    public String getName(){
        return this.name; 
    }
    public String toString(){
        return (this.name + " (" + this.weight + ") kg");
    }
    public int getWeight(){
        return this.weight;
    }
}

class Suitcase{
    ArrayList<Thing> things = new ArrayList<Thing>();
    public static int maxWeight;
    private int temp = 0;
    public Suitcase(){
        
    }
    public Suitcase(int maxWeight){
        Suitcase.maxWeight = maxWeight;
    }
    public void addThing(Thing thing){
        if(temp + thing.getWeight() <= Suitcase.maxWeight){
           this.things.add(thing);
           temp = temp + thing.getWeight();
        }
    }
    public String toString(){
        return (this.things.size() + " things (" + temp + " kg)"); 
    }
    public void printThings(){
        for (Thing thing : this.things) {
            System.out.println( thing.getName() + " (" + thing.getWeight() + " kg)" );
        }
    }
    public int totalWeight(){
        int totalWeight = 0; 
        for (Thing thing : this.things) {
            totalWeight += thing.getWeight(); 
        }
        return totalWeight;
    }
    public Thing heaviestThing(){
        Thing temp = new Thing("temp", -1);
        for (Thing thing : this.things) {
            if (thing.getWeight() > temp.getWeight()){
                temp = thing;
            } 
        }
        return temp;
    }
}
class Container{
    ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    public static int maxWeight;
    private int temp = 0; 
    public Container(){
        
    }
    public Container(int maxWeight){
        Container.maxWeight = maxWeight;
    }
    public void addSuitcase(Suitcase suitcase){
        if(temp + suitcase.totalWeight() <= Container.maxWeight){
            this.suitcases.add(suitcase);
            temp += suitcase.totalWeight();
        }
    }
    public String toString(){
        int temp = 0,weight = 0;
        for(Suitcase suitcase: this.suitcases){
            temp++;
            weight += suitcase.totalWeight();
        }
        return (temp + " Suitcases "  + "(" + weight + " kg)");
    }
}
public class Main {
    public static void main(String[] args) {
     Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println(container);
        
        
        Container containerq = new Container(100);
        addSuitcasesFullOfBricks(containerq);
        System.out.println(containerq);
    }
    
    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        Suitcase Case = new Suitcase(10);
        Thing brick = new Thing("Brick", 4);
        Case.addThing(brick);
        for(int i=0; i<100; i++){
            container.addSuitcase(Case);
        }
    }
}