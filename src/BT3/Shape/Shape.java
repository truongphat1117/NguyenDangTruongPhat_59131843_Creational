/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3.Shape;

/**
 *
 * @author phatc
 */
public abstract class Shape {
    String brush;
    String paper;
    String frame;
    int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public abstract String draw();
    
}
