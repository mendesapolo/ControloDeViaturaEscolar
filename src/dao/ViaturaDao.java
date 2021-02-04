/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.Viatura;
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
public class ViaturaDao {

    public static boolean cadastrar(Viatura viatura) {
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement stmt = con.prepareStatement("INSERT INTO viatura VALUE(NULL,?,?,?,?)");
            stmt.setString(1, viatura.getMarca());
            stmt.setString(2, viatura.getModelo());
            stmt.setString(3, viatura.getMatricula());
            stmt.setString(4, viatura.getTipo());
            stmt.addBatch();
            stmt.execute();
//            Conexao.closeStmt(con, stmt);

            return true;
        } catch (Exception ex) {
            System.err.println("Erro ao Listar Viatura: " + ex.getMessage());
        }
        return false;
    }

    public static List<Viatura> findAll() {
        try {
            List<Viatura> viaturas = new ArrayList<>();
            Connection con = Conexao.getConexao();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM viatura");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Viatura v = new Viatura(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                viaturas.add(v);
            }
//          Conexao.closeRs(con, stmt, rs);
            return viaturas;
        } catch (Exception ex) {
            System.err.println("Erro ao Listar Viatura: " + ex.getMessage());
        }
        return null;
    }

    public static Viatura getById(int id) {
        if (id > 0) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM viatura WHERE id = " + id);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                Viatura v = new Viatura(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
//                Conexao.closeRs(con, stmt, rs);
                return v;
            } catch (Exception ex) {
                System.err.println("Erro ao Listar Viatura: " + ex.getMessage());
            }
        }
        return null;
    }

    public static boolean updade(Viatura viatura) {
        if (viatura != null) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("UPDATE viatura SET marca = ?, modelo = ?, matricula = ?, tipo = ? WHERE id = ? ");
                stmt.setString(1, viatura.getMarca());
                stmt.setString(2, viatura.getModelo());
                stmt.setString(3, viatura.getMatricula());
                stmt.setString(4, viatura.getTipo());
                stmt.setInt(5, viatura.getId());
                stmt.addBatch();
                stmt.executeUpdate();
//            Conexao.closeStmt(con, stmt);

                return true;
            } catch (Exception ex) {
                System.err.println("Erro ao Atualizar os dados da Viatura: " + ex.getMessage());
            }
        }
        return false;
    }

    public static boolean delete(Viatura viatura) {
        if (viatura != null) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("DELETE FROM viatura WHERE id = ?");
                stmt.setInt(1, viatura.getId());
                stmt.addBatch();
                stmt.executeUpdate();
//            Conexao.closeStmt(con, stmt);

                return true;
            } catch (Exception ex) {
                System.err.println("Erro ao deletar os dados da viatura: " + ex.getMessage());
            }
        }
        return false;
    }

    
}
