/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg25.duplicate.remover;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author vaitnx
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> uniqueStrings; 
    private int deletedDupes=0;
    public PersonalDuplicateRemover() {
        this.uniqueStrings = new HashSet<String>();
    }
    public void add(String characterString){
        if(this.uniqueStrings.isEmpty()){
            this.uniqueStrings.add(characterString);
        }
        else{
            if(this.uniqueStrings.contains(characterString)){
                this.deletedDupes++;
            }
            else{
                this.uniqueStrings.add(characterString);
            }
//            for(String str : this.uniqueStrings){
//                if(str.equals(characterString)){
//                    this.deletedDupes++;
//                    continue;
//                }
//                else{
//                    this.uniqueStrings.add(characterString);
//                }
//            }
        }
    }
    public int getNumberOfDetectedDuplicates(){
        return this.deletedDupes;
    }
    public Set<String> getUniqueCharacterStrings(){
        return this.uniqueStrings;
    }
    public void empty(){
        this.deletedDupes = 0;
        this.uniqueStrings.clear();
    }
}
