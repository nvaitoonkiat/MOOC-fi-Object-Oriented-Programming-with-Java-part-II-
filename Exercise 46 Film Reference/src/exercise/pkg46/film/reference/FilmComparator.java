/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg46.film.reference;

import java.util.Comparator;
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

    @Override
    public int compare(Film o1, Film o2) {
        int rating1=0, rating2=0;
        List<Rating> ratingList2 = this.ratings.get(o2);
        List<Rating> ratingList1 = this.ratings.get(o1);
        for(Rating rating : ratingList1){
            rating1 += rating.getValue();
        }
        for(Rating rating : ratingList2){
            rating2 += rating.getValue();
        }
        if(rating1 > rating2){
            return -1;
        }
        else if(rating1 < rating2){
            return 1;
        }
        else{
            return 0;
        }
    }
}
