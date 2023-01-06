/*
Using the size and empty Properties of a ListProperty Object.
 
package com.jdojo.collections;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;


public class ListBindingTest {
    public static void main(String[] args) {
        ListProperty<String> lp =
                new SimpleListProperty<>(FXCollections.observableArrayList());
        
        // Bind the size and empty properties of the ListProperty
        // to create a description of the list
        StringProperty iniStr = new SimpleStringProperty("Size: ");
        StringProperty desc = new SimpleStringProperty();
        desc.bind(iniStr.concat(lp.sizeProperty())
        .concat(", Empty: ")
        .concat(lp.emptyProperty())
        .concat(", List: ")
        .concat(lp.asString()));
        
        System.out.println("Before addAll(): " + desc.get());
        lp.addAll("Jardiel", "Ruiz");
        System.out.println("After addAll(): " + desc.get());
    }
}
*/