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
public class ProductContainerRecorder extends ProductContainer {
    private double initialVolume;
    private ContainerHistory history;
    public ProductContainerRecorder(String productName, double capacity, double initialVolume){
        super(productName, capacity);
        this.initialVolume = initialVolume;
        this.history = new ContainerHistory();
    }
    public String history(){
        
    }
}
