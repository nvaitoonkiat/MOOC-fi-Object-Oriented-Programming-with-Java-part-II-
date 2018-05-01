/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg42.moving.figure;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vaitnx
 */
public class CompoundFigure extends Figure {
    private List<Figure> figures;

    public CompoundFigure() {
        super(0,0);
        this.figures = new ArrayList<>();
    }
    public void add(Figure f){
        this.figures.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for(Figure figure : figures){
            figure.draw(graphics);
        }
    }
    @Override
     public void move(int movingX, int movingY) {
        for(Figure figure : figures){
            figure.move(movingX, movingY);
        }
    }
    
}
