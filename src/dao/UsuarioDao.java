/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.Usuario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author António Apolo
 */
public class UsuarioDao{
        
    public static boolean cadastrar(Usuario usuario) {
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement stmt = con.prepareStatement("INSERT INTO usuario VALUE(NULL,?,?)");
            stmt.setString(1, usuario.getUserName());
            stmt.setString(2, usuario.getSenha());
            stmt.addBatch();
            stmt.execute();
//            Conexao.closeStmt(con, stmt);

            return true;
        } catch (Exception ex) {
            System.err.println("Erro ao Listar Usuarios: " + ex.getMessage());
        }
        return false;
    }

    public static List<Usuario> findAll() {
        try {
            List<Usuario> usuarios = new ArrayList<>();
            Connection con = Conexao.getConexao();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuario");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario u = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3));
                usuarios.add(u);
            }
//            Conexao.closeRs(con, stmt, rs);
            return usuarios;
        } catch (Exception ex) {
            System.err.println("Erro ao Listar Usuarios: " + ex.getMessage());
        }
        return null;
    }

    public static Usuario getById(int id) {
        if (id > 0) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuario WHERE id = " + id);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                Usuario u = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3));
//                Conexao.closeRs(con, stmt, rs);
                return u;
            } catch (Exception ex) {
                System.err.println("Erro ao Listar Usuario: " + ex.getMessage());
            }
        }
        return null;
    }

    public static boolean updade(Usuario usuario) {
        if (usuario != null) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("UPDATE usuario SET username = ?, senha = ? WHERE id = ? ");
                stmt.setString(1, usuario.getUserName());
                stmt.setString(2, usuario.getSenha());
                stmt.setInt(3, usuario.getId());
                stmt.addBatch();
                stmt.executeUpdate();
//            Conexao.closeStmt(con, stmt);

                return true;
            } catch (Exception ex) {
                System.err.println("Erro ao Atualizar os dados do Usuario: " + ex.getMessage());
            }
        }
        return false;
    }

    public static boolean delete(Usuario usuario) {
        if (usuario != null) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("DELETE FROM usuario WHERE id = ?");
                stmt.setInt(1, usuario.getId());
                stmt.addBatch();
                stmt.executeUpdate();
//            Conexao.closeStmt(con, stmt);

                return true;
            } catch (Exception ex) {
                System.err.println("Erro ao deletar os dados do Usuario: " + ex.getMessage());
            }
        }
        return false;
    }
    
}
