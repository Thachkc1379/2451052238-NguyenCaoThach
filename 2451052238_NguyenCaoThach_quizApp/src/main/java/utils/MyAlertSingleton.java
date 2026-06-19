/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.HashSet;
import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlertSingleton {
    private static MyAlertSingleton instance;
    private final Alert alert;
    
    private MyAlertSingleton(){
        this.alert  = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("QuizApp");
        alert.setHeaderText("QuizApp");
        alert.setContentText("Comming soon...");
    }
    
    public static MyAlertSingleton getInstance(){
       if (instance == null)
           instance = new MyAlertSingleton();
       
       return instance;
    }
    
    public void showMsg(String s){
        this.alert.setContentText(s);
        this.alert.show();
    }
}
