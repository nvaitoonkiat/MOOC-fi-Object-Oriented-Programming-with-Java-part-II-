/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg46.film.reference;

/**
 *
 * @author vaitnx
 */
public enum Rating {
    BAD(-5), MEDIOCRE (-3), NOT_WATCHED(0), NEUTRAL(1), FINE(3), GOOD(5);
    
    private int rating;

    private Rating(int rating) {
        this.rating = rating;
    }
    
    private int getValue(){
        return this.rating;
    }
}