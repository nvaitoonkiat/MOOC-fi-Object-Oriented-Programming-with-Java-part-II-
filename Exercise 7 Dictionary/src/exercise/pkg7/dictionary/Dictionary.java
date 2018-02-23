/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg7.dictionary;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author vaitnx
 */
public class Dictionary {
    private String word;
    private String translation;
    private final HashMap<String,String> entry;
    
    public Dictionary(){
        this.entry = new HashMap<>();
    }
    String translate(String word){
        if(this.entry.containsKey(word)){
            return this.entry.get(word);
        }
        return null;
    }
    void add(String word, String translation){
        this.entry.put(word, translation);
    }
    public int amountOfWords(){
        return this.entry.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<>();
        for(String key : this.entry.keySet()){
            list.add(key + " = " + this.entry.get(key));
        }
        return list;
    }
    
}
