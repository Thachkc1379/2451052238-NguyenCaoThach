/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class MyConectionSingleton {

    private static  MyConectionSingleton instance;
    private Connection conn;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConectionSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        

    private MyConectionSingleton() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(MyConectionSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static MyConectionSingleton getInstance(){
        if (instance == null)
            instance = new MyConectionSingleton();
        return instance;
    }
    
    public Connection connect(){
        return this.conn;
    }
    
    public void close(){
        if (this.conn != null)
            try {
                this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MyConectionSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}


