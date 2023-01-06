/*
Add invalidation, Change, and List Change Listeners to a ListProperty
 
package com.jdojo.collections;

import javafx.beans.Observable;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;


public class ListPropertyTest {
    public static void main(String[] args) {
        // Create an observable list property
        ListProperty<String> lp = 
                new SimpleListProperty<>(FXCollections.observableArrayList());
        
        // Add invalidation, change, and list change listeners
        lp.addListener(ListPropertyTest::invalidated);
        lp.addListener(ListPropertyTest::changed);
        lp.addListener(ListPropertyTest::onChanged);
        
        System.out.println("Before addAll()");
        lp.addAll("one", "two", "three");
        System.out.println("After addAll()");
        
        System.out.println("\nBefore set()");
        
        // Replace the wrapped list with a new one
        lp.set(FXCollections.observableArrayList("two", "three"));
        System.out.println("After set()");
        
        System.out.println("\nBefore remove()");
        lp.remove("two");
        System.out.println("After remove()");
    }
    
    // Add invalidation listener
    public static void invalidated(Observable list){
        System.out.println("List property is invalid");
    }
    
    // Add change listener
    public static void changed(ObservableValue<? extends ObservableList<String>> observable,
            ObservableList<String> oldList, 
            ObservableList<String> newList){
        System.out.println("List Property has changed.");
        System.out.println(" Old List: " + oldList);
        System.out.println(", New List: " + newList);
    }
    
    // A list change listener
    public static void onChanged(ListChangeListener.Change<? extends String> change){
        while(change.next()){
            String action = change.wasPermutated() ?  "Permutated"
                    : change.wasUpdated() ? "Updated" 
                    : change.wasRemoved() && change.wasAdded() ? "Replaced"
                    : change.wasRemoved() ? "Removed" : "Added";
            
            System.out.println("Action taken on the list: " + action);
            System.out.println(". Removed: " + change.getRemoved());
            System.out.println(", Added: " + change.getAddedSubList());
        }
    }
}
*/