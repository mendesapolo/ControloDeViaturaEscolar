/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import classe.Viatura;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author António Apolo
 */
public class ViaturaTb extends AbstractTableModel{
    
    private List<Viatura> lista;
    private final String[] header = new String[]{"ID", "MARCA", "MODELO","MATRÍCULA","TIPO"};

    public List<Viatura> getLista() {
        return lista;
    }

    public void setLista(List<Viatura> lista) {
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
            case 1: return this.lista.get(rowIndex).getMarca();
            case 2: return this.lista.get(rowIndex).getModelo();
            case 3: return this.lista.get(rowIndex).getMatricula();
            case 4: return this.lista.get(rowIndex).getTipo();
            default:return "--------";
        }
    }
    
    public Viatura getRow(int ps){
        return this.lista.get(ps);
    }
}
