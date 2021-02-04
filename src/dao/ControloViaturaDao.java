/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.ControloViatura;
import classe.Viatura;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author António Apolo
 */
public class ControloViaturaDao{
    

    public static boolean cadastrar(ControloViatura controloViatura) {
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement stmt = con.prepareStatement("INSERT INTO controlo_viatura VALUE(NULL,?,?,?)");
            stmt.setTimestamp(1, new Timestamp(controloViatura.getEntrada().getTime()));
            stmt.setTimestamp(2, new Timestamp(controloViatura.getSaida().getTime()));
            stmt.setInt(3, controloViatura.getViatura().getId());
            stmt.addBatch();
            stmt.execute();
//            Conexao.closeStmt(con, stmt);

            return true;
        } catch (Exception ex) {
            System.err.println("Erro ao Listar Controlo Viatura: " + ex.getMessage());
        }
        return false;
    }

    public static List<ControloViatura> findAll() {
        try {
            List<ControloViatura> controloViaturas = new ArrayList<>();
            Connection con = Conexao.getConexao();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM controlo_viatura");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Timestamp tse = rs.getTimestamp(2);
                Date de = new Date(tse.getTime());
                
                Timestamp tss = rs.getTimestamp(3);
                Date ds = new Date(tss.getTime());
                
                Viatura v = ViaturaDao.getById(rs.getInt(4));
                ControloViatura cv = new ControloViatura(rs.getInt(1), de, ds, v);
                controloViaturas.add(cv);
            }
//            Conexao.closeRs(con, stmt, rs);
            return controloViaturas;
        } catch (Exception ex) {
            System.err.println("Erro ao Listar Controlo Viaturas: " + ex.getMessage());
        }
        return null;
    }

    public static ControloViatura getById(int id) {
        if (id > 0) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM controlo_viatura WHERE id = " + id);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                Timestamp tse = rs.getTimestamp(2);
                Date de = new Date(tse.getTime());
                
                Timestamp tss = rs.getTimestamp(3);
                Date ds = new Date(tss.getTime());
                
                Viatura v = ViaturaDao.getById(rs.getInt(4));
                ControloViatura u = new ControloViatura(rs.getInt(1), de, ds, v);
//                Conexao.closeRs(con, stmt, rs);
                return u;
            } catch (Exception ex) {
                System.err.println("Erro ao Listar Controlo Viatura: " + ex.getMessage());
            }
        }
        return null;
    }

    public static boolean updade(ControloViatura controloViatura) {
        if (controloViatura != null) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("UPDATE controlo_viatura SET data_entrada = ?, data_saida = ?, viatura_id = ? WHERE id = ? ");
                stmt.setTimestamp(1, new Timestamp(controloViatura.getEntrada().getTime()));
                stmt.setTimestamp(2, new Timestamp(controloViatura.getSaida().getTime()));
                stmt.setInt(3, controloViatura.getViatura().getId());
                stmt.setInt(4, controloViatura.getId());
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

    public static boolean delete(ControloViatura controloViatura) {
        if (controloViatura != null) {
            try {
                Connection con = Conexao.getConexao();
                PreparedStatement stmt = con.prepareStatement("DELETE FROM controlo_viatura WHERE id = ?");
                stmt.setInt(1, controloViatura.getId());
                stmt.addBatch();
                stmt.executeUpdate();
//            Conexao.closeStmt(con, stmt);

                return true;
            } catch (Exception ex) {
                System.err.println("Erro ao deletar os dados do Controlo Viatura: " + ex.getMessage());
            }
        }
        return false;
    }
    
}
