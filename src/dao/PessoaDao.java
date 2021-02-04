/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.Pessoa;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import conexao.Conexao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author António Apolo
 */
public class PessoaDao {

    public static boolean cadastrar(Pessoa pessoa) {
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement stmt = con.prepareStatement("INSERT INTO pessoa VALUE(NULL,?,?,?,?)");
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getBi());
            stmt.setString(3, pessoa.getTelefone());
            stmt.setString(4, pessoa.getTipo());
            stmt.addBatch();
            stmt.execute();
//            Conexao.closeStmt(con, stmt);

            return true;
        } catch (Exception ex) {
            System.err.println("Erro ao Listar Pessoas: " + ex.getMessage());
        }
        return false;
    }

    public static List<Pessoa> findAll() {
        try {
            List<Pessoa> pessoas = new ArrayList<>();
            Connection con = Conexao.getConexao();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM pessoa");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pessoa p = new Pessoa(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                pessoas.add(p);
            }
//            Conexao.closeRs(con, stmt, rs);
            return pessoas;
        } catch (Exception ex) {
            System.err.println("Erro ao Listar Pessoas: " + ex.getMessage());
        }
        return null;
    }

    public static Pessoa getById(int id) {
        if (id > 0) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM pessoa WHERE id = " + id);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                Pessoa p = new Pessoa(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
//                Conexao.closeRs(con, stmt, rs);
                return p;
            } catch (Exception ex) { ex.printStackTrace();
                System.err.println("Erro ao Listar Pessoas: " );
            }
        }
        return null;
    }

    public static boolean updade(Pessoa pessoa) {
        if (pessoa != null) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("UPDATE pessoa SET nome = ?, bi = ?, telefone = ?, tipo = ? WHERE id = ? ");
                stmt.setString(1, pessoa.getNome());
                stmt.setString(2, pessoa.getBi());
                stmt.setString(3, pessoa.getTelefone());
                stmt.setString(4, pessoa.getTipo());
                stmt.setInt(5, pessoa.getId());
                stmt.addBatch();
                stmt.executeUpdate();
//            Conexao.closeStmt(con, stmt);

                return true;
            } catch (Exception ex) {
                System.err.println("Erro ao Atualizar os dados da Pessoa: " + ex.getMessage());
            }
        }
        return false;
    }

    public static boolean delete(Pessoa pessoa) {
        if (pessoa != null) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("DELETE FROM pessoa WHERE id = ?");
                stmt.setInt(1, pessoa.getId());
                stmt.addBatch();
                stmt.executeUpdate();
//            Conexao.closeStmt(con, stmt);

                return true;
            } catch (Exception ex) {
                System.err.println("Erro ao deletar os dados da Pessoa: " + ex.getMessage());
            }
        }
        return false;
    }

}
