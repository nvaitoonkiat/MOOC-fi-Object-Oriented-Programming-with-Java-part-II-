/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg33.dungeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author vaitnx
 */
public class Dungeon {
    public static final int PLAYER = 1, VAMPIRE = 2; 
    public static final HashMap<Object,ArrayList<Integer>> hashmap = new HashMap<>();
    //public static final int[] w = {0,1}, a = {-1,0}, s = {0,-1}, d = {1,0};
    public static final String VALIDCHARS = "wasd";
    private int length,height, vampires, moves;
    private boolean vampiresMove;
    private int[][] dungeon;
    private List<Character> characters;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length; this.height = height;
        this.vampires = vampires; this.moves = moves;
        this.vampiresMove = vampiresMove; this.dungeon = new int[height][length];
        this.characters = new ArrayList<>();
        hashmap.put('w', new ArrayList<>(Arrays.asList(0, 1)));
        hashmap.put('a', new ArrayList<>(Arrays.asList(-1, 0)));
        hashmap.put('s', new ArrayList<>(Arrays.asList(0, -1)));
        hashmap.put('d', new ArrayList<>(Arrays.asList(1, 0)));
        
        
    }
    
    public void run(Scanner reader){
        initializeCharacters();
        printMap();
        while(this.moves > 0){
            String temp="";
            boolean failed = false;
            while(!failed){
                System.out.println("Enter move (series of wasd):");
                temp = reader.nextLine();
                for(int i = 0;!failed && i<temp.length(); i++){
                    failed = (temp.indexOf(VALIDCHARS.charAt(i))<0);
                }
                if(!failed){
                    failed = true; //String passed test
                }
                else{
                failed = false;
                System.out.println("Not vaild command");
                }
            }
            move(temp);
        }
        
     
    }
    public void printMap(){
       for (int[] x : this.dungeon)
        {
           for (int y : x)
           {
               if(y == 0){
                   System.out.print(y +" ");
               }
               else{
                System.out.print(y + " ");
               }
           }
           System.out.println();
        }
    }
    public void initializeCharacters(){
        int count=0;
        //Initialize characters
        this.characters.add(new Player());
        this.dungeon[this.characters.get(0).getX()][this.characters.get(0).getY()] = PLAYER;
        while(count < this.vampires){
           Vampire vamp = (new Vampire(this.height, this.length));
           if(this.dungeon[vamp.getX()][vamp.getY()] == 0){
               this.characters.add(vamp);
               this.dungeon[vamp.getX()][vamp.getY()] = VAMPIRE;
               count++;
           }
           else{
               continue;
           }
        }
    }
    public void move(String command){
        for(int i=0; i<command.length();i++){
            for(Character character: this.characters){
                if(character.getID()==1){//character move
                    actuallyMove(character, seeIfAnythingOnTile(character, command.charAt(i)), command.charAt(i));
                }
                else{//vampire move
                    char vampMove = getRandomChar();
                    actuallyMove(character, seeIfAnythingOnTile(character, vampMove),vampMove);
                }
            }
                //character.move(command.charAt(i));
        }
        this.moves--;
    }
    public char getRandomChar(){
        String wasd = "wasd";
        Random rand = new Random();
        return wasd.charAt(rand.nextInt(4));
    }

    public int seeIfAnythingOnTile(Character character, char i){
        int valueOfDungeonTile = this.dungeon[character.getX()+hashmap.get(i).get(0)][character.getY()+hashmap.get(i).get(1)];
        return valueOfDungeonTile;
    }
    
    public void actuallyMove(Character character,int valueOfDungeonTile, char i){
        switch(valueOfDungeonTile){
            case 0:{
                this.dungeon[character.getX()][character.getY()] = 0;
                this.dungeon[character.getX()+hashmap.get(i).get(0)][character.getY()+hashmap.get(i).get(1)] = character.getID();
                character.move(hashmap.get(i).get(0),hashmap.get(i).get(1));
            }
            case 1:{
                
            }
            case 2:{
                int x = character.getX()+hashmap.get(i).get(0), y=character.getY()+hashmap.get(i).get(1);
                if(character.getID() == 1){
                    this.dungeon[character.getX()][character.getY()] = 0; //move current position
                    this.dungeon[x][y] = character.getID(); //update new position
                    character.move(hashmap.get(i).get(0),hashmap.get(i).get(1));
                    //remove vampire since player ate
                    for(int j = 0; j< this.characters.size();j++){
                        if(this.characters.get(j).getX() == x && this.characters.get(j).getY() == y){
                            this.characters.remove(j);
                        }
                    }
                }
            }
        }
    }
}//end class dungeon
