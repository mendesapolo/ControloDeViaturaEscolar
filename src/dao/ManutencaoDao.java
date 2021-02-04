/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.Manutencao;
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
public class ManutencaoDao{

    public static boolean cadastrar(Manutencao manutencao) {
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement stmt = con.prepareStatement("INSERT INTO manutencao VALUE(NULL,?,?,?)");
            stmt.setString(1, manutencao.getDescricao());
            stmt.setDate(2, manutencao.getData());
            stmt.setInt(3, manutencao.getViatura().getId());
            stmt.addBatch();
            stmt.execute();
//            Conexao.closeStmt(con, stmt);

            return true;
        } catch (Exception ex) {
            System.err.println("Erro ao Listar as Manutencao: " + ex.getMessage());
        }
        return false;
    }

    public static List<Manutencao> findAll() {
        try {
            List<Manutencao> manutencaos = new ArrayList<>();
            Connection con = Conexao.getConexao();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM manutencao");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Viatura v = ViaturaDao.getById(rs.getInt(4));
                Manutencao m = new Manutencao(rs.getInt(1), rs.getString(2), v, rs.getDate(3));
                manutencaos.add(m);
            }
//          Conexao.closeRs(con, stmt, rs);
            return manutencaos;
        } catch (Exception ex) {
            System.err.println("Erro ao Listar Manutencao: " + ex.getMessage());
        }
        return null;
    }

    public static Manutencao getById(int id) {
        if (id > 0) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM manutencao WHERE id = " + id);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                Viatura v = ViaturaDao.getById(rs.getInt(4));
                Manutencao m = new Manutencao(rs.getInt(1), rs.getString(2), v, rs.getDate(3));
//                Conexao.closeRs(con, stmt, rs);
                return m;
            } catch (Exception ex) {
                System.err.println("Erro ao Listar Viatura: " + ex.getMessage());
            }
        }
        return null;
    }

    public static boolean updade(Manutencao manutencao) {
        if (manutencao != null) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("UPDATE manutencao SET descricao = ?, viatura_id = ?, data = ? WHERE id = ? ");
                stmt.setString(1, manutencao.getDescricao());
                stmt.setInt(2, manutencao.getViatura().getId());
                stmt.setDate(3, manutencao.getData());
                stmt.setInt(4, manutencao.getId());
                stmt.addBatch();
                stmt.executeUpdate();
//            Conexao.closeStmt(con, stmt);

                return true;
            } catch (Exception ex) {
                System.err.println("Erro ao Atualizar os dados da Manutencao: " + ex.getMessage());
            }
        }
        return false;
    }

    public static boolean delete(Manutencao manutencao) {
        if (manutencao != null) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("DELETE FROM manutencao WHERE id = ?");
                stmt.setInt(1, manutencao.getId());
                stmt.addBatch();
                stmt.executeUpdate();
//            Conexao.closeStmt(con, stmt);

                return true;
            } catch (Exception ex) {
                System.err.println("Erro ao deletar os dados da Manutencao: " + ex.getMessage());
            }
        }
        return false;
    }
    
}
