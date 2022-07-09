/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_input;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class Koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi==null){
            try {
                String url;
                url = "jdbc:mysql://localhost:3306/pbouas";
                DriverManager.registerDriver(new con.mysql.jdbc.Driver());
            }
        }
    }
}
