/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3.Shape.Rectangle;

import BT3.Shape.Shape;

/**
 *
 * @author phatc
 */
public class Rectangle extends Shape{

    private static Rectangle instance;
    
    public static Rectangle createInstance()
    {
        if(instance==null)
            instance = new Rectangle();
        return instance;
    }
   
    protected Rectangle() {
    }

    
    @Override
    public String draw() {
        return "Vẽ hình vuông";
    }
    
}
