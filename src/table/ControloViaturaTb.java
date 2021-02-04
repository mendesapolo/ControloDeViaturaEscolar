/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import classe.ControloViatura;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author António Apolo
 */
public class ControloViaturaTb extends AbstractTableModel{
    
    private List<ControloViatura> lista;
    private final String[] header = new String[]{"ID","MODELO","MATRÍCULA", "ENTRADA", "SAIDA"};

    public List<ControloViatura> getLista() {
        return lista;
    }

    public void setLista(List<ControloViatura> lista) {
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
            case 1: return this.lista.get(rowIndex).getViatura().getModelo();
            case 2: return this.lista.get(rowIndex).getViatura().getMatricula();
            case 3: return new SimpleDateFormat("dd/MM/yyyy h:mm:ss").format(this.lista.get(rowIndex).getEntrada());
            case 4: return new SimpleDateFormat("dd/MM/yyyy").format(this.lista.get(rowIndex).getSaida());
            default:return "--------";
        }
    }
    
    public ControloViatura getRow(int ps){
        return this.lista.get(ps);
    }
    
}
