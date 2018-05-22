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
public class Exercise46FilmReference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    RatingRegister ratings = new RatingRegister();

    Film goneWithTheWind = new Film("Gone with the Wind");
    Film eraserhead = new Film("Eraserhead");
    Film eraserhead2 = new Film("Eraserh12121ead");
    Person matti = new Person("Matti");
    Person pekka = new Person("Pekka");

    ratings.addRating(matti, goneWithTheWind, Rating.BAD);
    ratings.addRating(matti, eraserhead, Rating.FINE);
    ratings.addRating(matti, eraserhead2, Rating.BAD);
    ratings.addRating(pekka, goneWithTheWind, Rating.GOOD);
    ratings.addRating(pekka, eraserhead, Rating.GOOD);

    System.out.println("Ratings for Eraserhead: " + ratings.getRatings(eraserhead));
    System.out.println("Matti's ratings: " + ratings.getPersonalRatings(matti));
    System.out.println("Reviewers: " + ratings.reviewers());
    }
    
}
