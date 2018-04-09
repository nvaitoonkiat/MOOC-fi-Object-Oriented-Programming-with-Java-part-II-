/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg30.container;

/**
 *
 * @author vaitnx
 */
public class ProductContainer extends Container{
    private String name;
    
    public ProductContainer(String productName, double capacity){
        super(capacity);
        this.name = productName;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return  name + ": " + super.toString();
    }
    
}
