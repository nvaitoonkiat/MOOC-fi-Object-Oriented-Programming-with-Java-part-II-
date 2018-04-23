/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg32.different.boxes;

import java.io.IOException;
import java.util.Objects;

/**
 *
 * @author vaitnx
 */
class Thing {
    private int weight;
    private String name;

    public Thing(String name) {
        this.name = name;
        this.weight =0;
    }
    
    public Thing(String name, int weight) throws IOException {
        this.name = name; 
        if(weight < 0 ){
            throw new IOException("IOException Occurred");
        }
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Thing other = (Thing) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}
