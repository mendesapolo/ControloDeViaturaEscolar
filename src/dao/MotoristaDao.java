/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.Motorista;
import classe.Pessoa;
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
public class MotoristaDao{

    public static boolean cadastrar(Motorista motorista) {
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement stmt = con.prepareStatement("INSERT INTO motorista VALUE(NULL,?,?)");
            stmt.setInt(1, motorista.getPessoa().getId());
            stmt.setInt(2, motorista.getViatura().getId());
            stmt.addBatch();
            stmt.execute();
//            Conexao.closeStmt(con, stmt);

            return true;
        } catch (Exception ex) {
            System.err.println("Erro ao Registar o Motorista: " + ex.getMessage());
        }
        return false;
    }

    public static List<Motorista> findAll() {
        try {
            List<Motorista> motoristas = new ArrayList<>();
            Connection con = Conexao.getConexao();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM motorista");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pessoa p = PessoaDao.getById(rs.getInt(2));
                Viatura v = ViaturaDao.getById(rs.getInt(3));
                
                Motorista m = new Motorista(rs.getInt(1) ,p ,v);
                motoristas.add(m);
            }
//          Conexao.closeRs(con, stmt, rs);
            return motoristas;
        } catch (Exception ex) {
            System.err.println("Erro ao Listar Motorista: " + ex.getMessage());
        }
        return null;
    }

    public static Motorista getById(int id) {
        if (id > 0) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM viatura WHERE id = " + id);
                ResultSet rs = stmt.executeQuery();

                Pessoa p = PessoaDao.getById(rs.getInt(2));
                Viatura v = ViaturaDao.getById(rs.getInt(3));
                Motorista m = new Motorista(rs.getInt(1) ,p ,v);
//                Conexao.closeRs(con, stmt, rs);
                return m;
            } catch (Exception ex) {
                System.err.println("Erro ao Listar Viatura: " + ex.getMessage());
            }
        }
        return null;
    }

    public static boolean updade(Motorista motorista) {
        if (motorista != null) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("UPDATE motorista SET pessoa_id = ?, viatura_id = ? WHERE id = ?");
                stmt.setInt(1, motorista.getPessoa().getId());
                stmt.setInt(2, motorista.getViatura().getId());
                stmt.setInt(3, motorista.getId());
                stmt.addBatch();
                stmt.executeUpdate();
//            Conexao.closeStmt(con, stmt);

                return true;
            } catch (Exception ex) {
                System.err.println("Erro ao Atualizar os dados da Motorista: " + ex.getMessage());
            }
        }
        return false;
    }

    public static boolean delete(Motorista motorista) {
        if (motorista != null) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("DELETE FROM motorista WHERE id = ?");
                stmt.setInt(1, motorista.getId());
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
