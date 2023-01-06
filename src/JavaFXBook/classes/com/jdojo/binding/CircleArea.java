/*
Computing the Area of a Circle from its Radious using a Fluent Binding API
 
package com.jdojo.binding;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;


public class CircleArea {
    public static void main(String[] args) {
        DoubleProperty radious = new SimpleDoubleProperty(7.0);
        
        // Create a binding for computing area of the circle
        DoubleBinding area = 
                radious.multiply(radious).multiply(Math.PI);
        
        System.out.println("Radious = " + radious.get() + 
                ", Area = " + area.get());
        
        // Change the radious
        radious.set(14.0);
        System.out.println("Radious = " + radious.get() + 
                ", Area = " + area.get());
        
        // Create a DoubleProperty and bind it to an expression
        // that computes the area of the circle
        DoubleProperty area2 = new SimpleDoubleProperty();
        area2.bind(radious.multiply(radious).multiply(Math.PI));
        System.out.println("Radious = " + radious.get() + 
                ", Area2 = " + area2.get());
    }
}
*/