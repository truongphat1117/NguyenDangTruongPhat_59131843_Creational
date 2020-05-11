/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3.Shape.Triangle;

import BT3.Shape.Shape;

/**
 *
 * @author phatc
 */
public class Triangle extends Shape{

   private static Triangle instance;
    
    public static Triangle createInstance()
    {
        if(instance==null)
            instance = new Triangle();
        return instance;
    }
   
    protected Triangle(){
    }
    
    @Override
    public String draw() {
        return "Vẽ hình tam giác";
    }
}
