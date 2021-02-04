/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author António Apolo
 */
public class Conexao {
     private static Connection conn;
    private static final String HOST = "localhost";
    private static final String DB = "transporte_escolar";
    private static final String USER = "root";
    private static final String PASS = "aooplsrt";
    private static final String URL = "jdbc:mysql://" + HOST+ "/" + DB;
//    private static final String URL = "jdbc:mysql://" + HOST+ "/" + DB+"?useTimezone=true&serverTimezone=UTC";
    
    public static Connection getConexao() throws Exception {
        if ( conn == null){
            try {
//                String driverName = "java.sql.jdbc.Driver";
                String driverName = "com.mysql.jdbc.Driver";
                Class.forName(driverName);
                conn = DriverManager.getConnection(URL,USER, PASS);
                return conn;
            } catch(Exception e) {
                System.out.println(e);
                throw e;
            }
        }
        return conn;
    }
    
    public static void closeCon(Connection conn) {
        try {
            conn.close();
        } catch(SQLException e) {
            System.err.println("Erro ao fechar a conexao: "+e.getMessage());
        }
    }
    
    public static void closeStmt(Connection conn, PreparedStatement stmt) {
        try {
            stmt.close();
            conn.close();
        } catch(SQLException e) {
            System.err.println("Erro ao fechar o Statement: "+e.getMessage());
        }
    }
    
    public static void closeRs(Connection conn, PreparedStatement stmt, ResultSet rs) {
        try {
            rs.close();
            stmt.close();
            conn.close();
        } catch(SQLException e) {
            System.err.println("Erro ao fechar o ResultSet: "+e.getMessage());
        }
    }
    
}
