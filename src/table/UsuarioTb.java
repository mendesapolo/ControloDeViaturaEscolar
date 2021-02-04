/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import classe.Usuario;
import classe.Viatura;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author António Apolo
 */
public class UsuarioTb extends AbstractTableModel{
    
    private List<Usuario> lista;
    private final String[] header = new String[]{"ID", "NOME DE USUÁRIO", "SENHA/PALAVRA-PASSE"};

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public String getColumnName(int column) {
        return this.header[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return this.lista.get(rowIndex).getId();
            case 1: return this.lista.get(rowIndex).getUserName();
            case 2: return this.lista.get(rowIndex).getSenha();
            default:return "--------";
        }
    }
    
    public Usuario getRow(int ps){
        return this.lista.get(ps);
    }
}
