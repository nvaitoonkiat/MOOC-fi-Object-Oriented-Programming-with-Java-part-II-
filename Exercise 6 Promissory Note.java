import java.lang.*;
import java.io.*;
import java.util.*;

class PromissoryNote{
    private HashMap<String, Double> note;
    public PromissoryNote(){
        this.note = new HashMap<String, Double>();
    }
    public void setLoan(String toWhom, double value){
        this.note.put(toWhom,value);
    }
     public double howMuchIsTheDebt(String whose){
         if(this.note.containsKey(whose)){
            return this.note.get(whose);
         }
         return 0;
     }
}

class Main {
    public static void main(String[] args) {
         PromissoryNote mattisNote = new PromissoryNote();
  mattisNote.setLoan("Arto", 51.5);
  mattisNote.setLoan("Arto", 10.5);
  mattisNote.setLoan("Mikael", 30);

  System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
  System.out.println(mattisNote.howMuchIsTheDebt("Joel"));

    /////////
    }
   
}
  