import java.lang.*;
import java.io.*;
import java.util.*;

class Dictionary{
    private HashMap<String, String> def;
    public Dictionary(){
        this.def = new HashMap<String,String>();
    }
    public String translate(String word){
        if(this.def.containsKey(word)){
            return this.def.get(word);
         }
         return null;
    }
    public int amountOfWords(){
        return this.def.size();
    }
    public void add(String word, String translate){
        this.def.put(word,translate);
    }
    public ArrayList<String> translationList(){
       return (this.new ArrayList<String>(this.def.values());
    }
}
class Main {
    public static void main(String[] args) {
    Dictionary dictionary = new Dictionary();
    dictionary.add("apina", "monkey");
    dictionary.add("banaani", "banana");
    dictionary.add("cembalo", "harpsichord");

    ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }
    }
}
  