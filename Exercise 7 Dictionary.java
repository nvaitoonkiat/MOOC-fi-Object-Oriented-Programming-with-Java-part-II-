import java.lang.*;
import java.io.*;
import java.util.*;

class TextUserInterface {

    private final Dictionary dict;
    private final Scanner read;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.dict = dictionary;
        this.read = reader;
    }

    public void start() {

        startStatements();

        while (true) {

            System.out.println("Statement:");

            String input = read.nextLine().trim();

            if (input.equalsIgnoreCase("add")) {
                add();
            } else if (input.equalsIgnoreCase("translate")) {
                translate();
            } else if (input.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void startStatements() {
        System.out.println("Statements:");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the text user interface");
        System.out.println("");
    }

    public void add() {
        System.out.print("In Finnish: ");
        String finnishWord = read.nextLine();
        System.out.println(finnishWord);
        System.out.print("Translation: ");
        String englishWord = read.nextLine();
        System.out.println(englishWord);
        this.dict.add(finnishWord, englishWord);
    }

    public void translate() {
        System.out.print("Give a word: ");
        String finnishWord = read.nextLine().trim();
        System.out.println(finnishWord);
        String key = dict.translate(finnishWord);
        System.out.println("Translation: " + key);
    }
}

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
        ArrayList<String> translationList = new ArrayList<String>();
        for (String key : this.def.keySet()) {
            String value = this.def.get(key);
            String temp = key + " = " + value;
            translationList.add(temp);
        }
        return translationList;
    }
   
}
class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
    }
}