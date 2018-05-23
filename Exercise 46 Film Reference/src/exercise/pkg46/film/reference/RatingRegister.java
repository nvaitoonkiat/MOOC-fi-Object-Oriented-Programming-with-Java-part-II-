/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg46.film.reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vaitnx
 */
public class RatingRegister {
    private HashMap<Film,List<Rating>> map;
    private HashMap<Person,Map<Film,Rating>> personMap;
    private List<Rating> ratings;
    public RatingRegister() {
        this.map = new HashMap<>();
        this.personMap = new HashMap<>();
    }
    
    public void addRating(Film film, Rating rating){
        this.ratings = new ArrayList<>();
        if(this.map.get(film) == null){ //check if this is first rating
        }
       else{
            this.ratings = this.map.get(film); //if not add to list
        }

        this.ratings.add(rating);
        this.map.put(film, ratings);
    }
    public void addRating(Person person, Film film, Rating rating){
       addRating(film,rating);
       Map<Film, Rating> temp = new HashMap<>();
       if(this.personMap.get(person) == null){
           temp.put(film, rating);
           this.personMap.put(person, temp);
       }
       else{
           temp = this.personMap.get(person);
           temp.put(film, rating);
           this.personMap.put(person, temp);
       }
    }
    public Rating getRating(Person person, Film film){
        if(this.personMap.get(person).get(film).equals("")){
            return Rating.NOT_WATCHED;
        }
        else return this.personMap.get(person).get(film);
    }
    public List<Rating> getRatings(Film film){
        return this.map.get(film);
    }
    public Map<Film, Rating> getPersonalRatings(Person person) {
        return this.personMap.get(person);
    }
    public Map<Film, List<Rating>> filmRatings(){
        return this.map;
    }
    public List<Person> reviewers(){
         List<Person> list = new ArrayList<>();
         list.addAll(this.personMap.keySet());
         return list;
    }
    
}
