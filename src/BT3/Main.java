/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import BT3.Shape.Shape;
import BT3.Shape.ShapeType;
import BT3.ShapeFactory.ShapeFactory;


public class Main {

    public static void main(String[] args) {
        ShapeFactory SF = new ShapeFactory();
        
        //Tạo hai đối tượng hình tròn
        Shape Sp1 = SF.createShape(ShapeType.circle);
        Shape Sp2 = SF.createShape(ShapeType.circle);
        
        //Tạo hai đối tượng hình chữ nhật
        Shape Sp3 = SF.createShape(ShapeType.rectangle);
        Shape Sp4 = SF.createShape(ShapeType.rectangle);
          
        //Tạo hai đối tượng hình tam giác
        Shape Sp5 = SF.createShape(ShapeType.triangle);
        Shape Sp6 = SF.createShape(ShapeType.triangle);
        
        Sp1.setCount(5);
        Sp2.setCount(10);
        Sp1.setCount(100);
        
        Sp3.setCount(15);
        Sp4.setCount(20);
        
        Sp5.setCount(25);
        Sp6.setCount(30);
        
        System.out.println("Hình tròn 1 có count = "+Sp1.getCount());
        System.out.println("Hình tròn 2 có count = "+Sp2.getCount());
        
       System.out.println("\nHình chữ nhật 1 có count = "+Sp3.getCount());
       System.out.println("Hình chữ nhật 2 có count = "+Sp4.getCount());
       
       System.out.println("\nHình tam giác 1 có count = "+Sp5.getCount());
       System.out.println("Hình tam giác 2 có count = "+Sp6.getCount());

    }
    
}
