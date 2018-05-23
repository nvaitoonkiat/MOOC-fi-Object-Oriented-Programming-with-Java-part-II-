/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg46.film.reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vaitnx
 */
public class Reference {
    private RatingRegister ratings;

    public Reference(RatingRegister ratings) {
        this.ratings = ratings;
    }
    public Film recommendFilm(Person person){
         Map<Film, List<Rating>> filmRatings = this.ratings.filmRatings();
         List<Film> films = new ArrayList<>(this.ratings.filmRatings().keySet());
         Collections.sort(films, new FilmComparator(filmRatings));
         return films.get(0);
    }
}

