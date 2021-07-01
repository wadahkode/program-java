/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

/**
 *
 * @author jarvis
 */
public class Koneksi {
    
    public static void main(String args[]) {
        try {
            Class.forName("org.postgresql.Driver");
            
        } catch(ClassNotFoundException e) {
            System.err.println("Koneksi gagal : " + e.getMessage());
        }
    }
}
