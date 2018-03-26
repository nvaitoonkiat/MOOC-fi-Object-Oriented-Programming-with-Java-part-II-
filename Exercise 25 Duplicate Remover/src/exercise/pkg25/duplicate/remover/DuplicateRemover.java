/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg25.duplicate.remover;


import java.util.Set;
/**
 *
 * @author vaitnx
 */
public interface DuplicateRemover {
    void add(String characterString);
    int getNumberOfDetectedDuplicates();
    Set<String> getUniqueCharacterStrings();
    void empty();
}
