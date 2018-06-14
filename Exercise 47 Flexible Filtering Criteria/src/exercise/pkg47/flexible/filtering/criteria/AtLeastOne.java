/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg47.flexible.filtering.criteria;

/**
 *
 * @author vaitnx
 */
public class AtLeastOne implements Criterion{
    private Criterion a,b,c;

    public AtLeastOne(Criterion a, Criterion b, Criterion c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public boolean complies(String line) {
        if(a.complies(line) || c.complies(line) || b.complies(line)){
            return true;
        }
        else return false;
    }
}
