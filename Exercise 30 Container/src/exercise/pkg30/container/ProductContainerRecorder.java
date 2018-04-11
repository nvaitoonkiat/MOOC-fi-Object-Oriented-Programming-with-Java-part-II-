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
        super.addToTheContainer(this.initialVolume);
        this.history = new ContainerHistory();
        this.history.add(this.initialVolume);
    }
    public String history(){
       return this.history.toString();
       
    }
    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.history.add(this.getVolume());
    }
      @Override
    public double takeFromTheContainer(double amount) {
        double firstVol = this.getVolume();
        super.takeFromTheContainer(amount);
        this.history.add(this.getVolume());
        return firstVol - this.getVolume();
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName() + "\n"
                + "History: " + this.history() + "\n"
                + "Greatest product amount: " + history.maxValue() + "\n"
                + "Smallest product amount: " + history.minValue() + "\n"
                + "Average: " + history.average() + "\n"
                + "Greatest change: " + history.greatestFluctuation() + "\n"
                );
    }

    @Override
    public String toString() {
        return super.toString() + " ProductContainerRecorder{" + "initialVolume=" + initialVolume + ", history=" + history + '}';
    }
    
}
