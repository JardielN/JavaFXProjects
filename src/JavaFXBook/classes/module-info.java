/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

module JavaFXBook {
    requires javafx.graphics;
    requires javafx.controls;
    requires java.desktop;
    requires javafx.swing;
    requires javafx.media;
    requires javafx.web;
    requires javafx.fxml;
    requires jdk.jsobject;
    
    //opens com.jdojo.intro to javafx.graphics, javafx.base;
    //opens com.jdojo.binding to javafx.graphics, javafx.base;
    opens com.jdojo.collections to javafx.graphics, javafx.base;
}
