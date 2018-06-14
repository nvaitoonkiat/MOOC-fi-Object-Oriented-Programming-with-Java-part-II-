/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilder;

/**
 *
 * @author vaitnx
 */
public class StringBuild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }
    public static String build(int[] t) {
         StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        for (int i = 0; i < t.length; i++) {
            if (i % 4 == 0) {
                stringBuilder.append("\n ");
            }
            
            stringBuilder.append(t[i]);          
            
            if (i != t.length - 1) {
                stringBuilder.append(", ");
            }
        }

        return stringBuilder.append("\n}").toString();
    }
    
}
