/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg46.film.reference;

import java.util.List;
import java.util.Map;

/**
 *
 * @author vaitnx
 */
public class FilmComparator implements Comparator<Film>{
    private Map<Film, List<Rating>> ratings;
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }
}
