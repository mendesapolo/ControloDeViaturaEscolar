/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import classe.Motorista;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author António Apolo
 */
public class MotoristaTb extends AbstractTableModel{
    
    private List<Motorista> lista;
    private final String[] header = new String[]{"ID", "NOME", "BI","MODELO","MATRÍCULA"};

    public List<Motorista> getLista() {
        return lista;
    }

    public void setLista(List<Motorista> lista) {
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
            case 1: return this.lista.get(rowIndex).getPessoa().getNome();
            case 2: return this.lista.get(rowIndex).getPessoa().getBi();
            case 3: return this.lista.get(rowIndex).getViatura().getModelo();
            case 4: return this.lista.get(rowIndex).getViatura().getMatricula();
            default:return "--------";
        }
    }
    
    public Motorista getRow(int ps){
        return this.lista.get(ps);
    }
    
}
