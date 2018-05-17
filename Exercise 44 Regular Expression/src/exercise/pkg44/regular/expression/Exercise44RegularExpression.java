/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg44.regular.expressions;

/**
 *
 * @author vaitnx
 */
public class Exercise44RegularExpressions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
            // TODO code application logic here
             String string = "tue";
            System.out.println(isAWeekDay(string));
            String string1 = "aeiiiiiiiiiiiii";
            System.out.println(allVowels(string1));
            String string2 = "19:43:10";
            System.out.println(clockTime(string2));
        }
        public static boolean isAWeekDay(String string){
            if (string.matches("mon|tue|wed|thr|fri|sat|sun")) {
                return true;
            }
            else{return false;}
        }
        public static boolean allVowels(String string){
            boolean good = true;
            for(int i = 0; i<string.length();i++){
                char c = string.charAt(i);
                String s = Character.toString(c);
                if(s.matches("[a|e|i|o|u]")){
                }
                else{
                    good = false;
                }
            }
            return good;
        }
        public static boolean clockTime(String string){
            if(string.matches("[0-1]{1}[0-9]{1}:[0-6]{1}[0-9]{1}:[0-9]{2}")){
                return true;
            }
            return false;
        }
    
    
}
