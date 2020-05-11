package BT3.ShapeFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import BT3.Shape.Circle.Circle;
import BT3.Shape.Rectangle.Rectangle;
import BT3.Shape.Shape;
import BT3.Shape.ShapeType;
import BT3.Shape.Triangle.Triangle;

/**
 *
 * @author phatc
 */
public class ShapeFactory {

    public ShapeFactory() {
    }
    
    
    public Shape createShape(ShapeType type)
    {
        switch(type)
        {
            case rectangle: return Rectangle.createInstance();
            case triangle: return Triangle.createInstance();
            case circle: return Circle.createInstance();
        }  
        return null;
    }
}
    
    
