/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg25.duplicate.remover;

/**
 *
 * @author vaitnx
 */
public class Exercise25DuplicateRemover {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DuplicateRemover remover = new PersonalDuplicateRemover();
        remover.add("first");
        remover.add("second");
        remover.add("first");

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        remover.add("last");
        remover.add("last");
        remover.add("new");

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
            remover.getUniqueCharacterStrings());
//        System.out.println("test");
//        for(String str: remover.getUniqueCharacterStrings()){
//            System.out.println("1 " + str);
//        }

        remover.empty();

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
            remover.getUniqueCharacterStrings());
    }
    
}
