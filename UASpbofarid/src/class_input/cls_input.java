/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_input;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author LENOVO
 */
public class cls_input {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String nopol;
    
    
    public void Cetak () throws SQLException {
        conn koneksi.getKoneksi();
        sql = "*INSERT INTO pbouas(nopol)VALUE(?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, nopol);
        
    }
}
