/*
2.12. Use StringBinding and StringExpression
 
package com.jdojo.binding;

import java.util.Locale;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class StringExpressionTest {
    public static void main(String[] args) {
        DoubleProperty radious = new SimpleDoubleProperty(7.0);
        DoubleProperty area = new SimpleDoubleProperty(0);
        StringProperty iniStr = new SimpleStringProperty("Radius = ");
        
        // Bind area to an expression that computes the area of
        // the circle
        area.bind(radious.multiply(radious).multiply(Math.PI));
        
        // Create a String expression to describe the circle
        StringExpression desc = iniStr.concat(radious.asString())
                .concat(", Area = ")
                .concat(area.asString(Locale.US, "%.2f"));
        
        System.out.println(desc.getValue());
        
        // Change the radius
        radious.set(14.0);
        System.out.println(desc.getValue());
    }
}
*/