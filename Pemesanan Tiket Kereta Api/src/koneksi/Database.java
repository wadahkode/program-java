package koneksi;

import java.sql.*;


/**
 * Database
 * 
 * @author wadahkode
 * @since version 0.0.1
 * @license other
 */
public class Database {
    private Connection koneksi;
    
    public Connection connect() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Koneksi gagal : " + e.getMessage());
        }
        
        String url = "jdbc:mysql://localhost:3306/pemesanan_tiket";
        String user = "root";
        String password = "admin";
        
        try {
            koneksi = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.err.println("Gagal koneksi database : " + e.getMessage());
        }
        
        return koneksi;
    }
}
