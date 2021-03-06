/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import classe.ControloViatura;
import classe.Viatura;
import dao.ControloViaturaDao;
import dao.ViaturaDao;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import table.ControloViaturaTb;

/**
 *
 * @author António Apolo
 */
public class ControloViaturaFrm extends javax.swing.JDialog {

    private final ControloViaturaTb modelo;

    /**
     * Creates new form FuncionarioFrm
     *
     * @param parent
     * @param modal
     */
    public ControloViaturaFrm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.modelo = new ControloViaturaTb();
        refreshTb();
        this.tableData.setModel(modelo);

        if (ViaturaDao.findAll().size() > 0) {
            cbViaturas.removeAllItems();
            cbViaturas.removeAll();
            for (Viatura v : ViaturaDao.findAll()) {
                cbViaturas.addItem(v);
            }
        } else {
            cbViaturas.setEditable(false);
        }

        novo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRegistar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbViaturas = new javax.swing.JComboBox<>();
        txtEntrada = new javax.swing.JFormattedTextField();
        txtSaida = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Viatura Painel");

        jScrollPane1.setOpaque(false);

        tableData.setBackground(new java.awt.Color(181, 244, 181));
        tableData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableDataMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableData);

        jPanel1.setBackground(new java.awt.Color(224, 243, 230));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnRegistar.setBackground(new java.awt.Color(0, 204, 51));
        btnRegistar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistar.setText("Registar");
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(0, 204, 51));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnNovo.setBackground(new java.awt.Color(0, 204, 51));
        btnNovo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Data de Entrada");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("ID:");

        txtId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(204, 0, 0));
        txtId.setText("Novo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Selecione a Viatura");

        cbViaturas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txtEntrada.setToolTipText("");
        txtEntrada.setNextFocusableComponent(txtSaida);

        txtSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txtSaida.setNextFocusableComponent(cbViaturas);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Data de Saida");

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbViaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizar))
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbViaturas, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(txtEntrada)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSaida)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtualizar)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Controlo de Viaturas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (!txtEntrada.getText().equals("") && !txtId.getText().equalsIgnoreCase("Novo")) {
            if (cbViaturas.getSelectedIndex() >= 0) {
                try{
                    int id = Integer.parseInt(txtId.getText());
                    Date ds = (Date) txtSaida.getValue();
                    
                    Calendar c1 = Calendar.getInstance(Locale.getDefault());
                    c1.setTime(new Date());
                    
                    Calendar c = Calendar.getInstance(Locale.getDefault());
                    c.setTime(ds);
                    
                    c.set(Calendar.DAY_OF_MONTH, c1.get(Calendar.DAY_OF_MONTH));
                    c.set(Calendar.YEAR, c1.get(Calendar.YEAR));
                    c.set(Calendar.MONTH, c1.get(Calendar.MONTH));
                    ds = c.getTime();
                    
                    ControloViatura cv = ControloViaturaDao.getById(id);
                    cv.setSaida(ds);
                    
                    if (ControloViaturaDao.updade(cv)) {
                        JOptionPane.showMessageDialog(this, "Atualizado com Sucesso", "Sucesso", 1);
                        refreshTb();
                        novo();
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao registrar", "ERRO", 0);
                    }
                    
                } catch(NullPointerException ex) {
                    JOptionPane.showMessageDialog(this, "Insira a hora de entrada", "ERRO", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Não foi selecionada a viatura", "VIATURA", 2);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos", "Campos Vazios", 2);
            txtEntrada.requestFocus();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        novo();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
        if (!txtEntrada.getText().equals("")) {
            if (cbViaturas.getSelectedIndex() >= 0) {
                try{
                    Date de = (Date) txtEntrada.getValue();
                    Date ds = new Date();
                    
                    Calendar c1 = Calendar.getInstance(Locale.getDefault());
                    c1.setTime(new Date());
                    
                    Calendar c = Calendar.getInstance(Locale.getDefault());
                    c.setTime(de);
                    
                    c.set(Calendar.DAY_OF_MONTH, c1.get(Calendar.DAY_OF_MONTH));
                    c.set(Calendar.YEAR, c1.get(Calendar.YEAR));
                    c.set(Calendar.MONTH, c1.get(Calendar.MONTH));
                    de = c.getTime();
                    
                    ControloViatura cv = new ControloViatura(de, ds, (Viatura) cbViaturas.getSelectedItem());
                    if (ControloViaturaDao.cadastrar(cv)) {
                        JOptionPane.showMessageDialog(this, "Registado com Sucesso", "Sucesso", 1);
                        refreshTb();
                        novo();
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao registrar", "ERRO", 0);
                    }
                    
                } catch(NullPointerException ex) {
                    JOptionPane.showMessageDialog(this, "Insira a hora de entrada", "ERRO", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Não foi selecionada a viatura", "VIATURA", 2);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos", "Campos Vazios", 2);
            txtEntrada.requestFocus();
        }
    }//GEN-LAST:event_btnRegistarActionPerformed

    private void tableDataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseReleased
        if (tableData.getSelectedRow() >= 0) {
            ControloViatura cv = modelo.getRow(tableData.getSelectedRow());
            
            btnRegistar.setEnabled(false);
            btnAtualizar.setEnabled(true);
            
            txtId.setText(cv.getId() + "");
            
            txtEntrada.setText(new SimpleDateFormat("HH:mm").format(cv.getEntrada()));
            txtEntrada.setEditable(false);
            
            txtSaida.setText(new SimpleDateFormat("HH:mm").format(cv.getSaida()));
            txtSaida.setEditable(true);
            
            int idx = -1;
            int i = -1;
            for(Viatura v : ViaturaDao.findAll()){
                i++;
                if(v.getId() == cv.getViatura().getId()){
                    idx=i;
                    break;
                }
            }
            System.out.println("IDX: "+idx);
            cbViaturas.setSelectedItem(cbViaturas.getItemAt(idx));
            cbViaturas.setEditable(false);
            cbViaturas.setNextFocusableComponent(btnAtualizar);
        }
    }//GEN-LAST:event_tableDataMouseReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tableData.getSelectedRow() >= 0 && !txtId.getText().equalsIgnoreCase("Novo")) {
            String msg ="Tem certeza que pretende eliminar este registro?"
            + "\nSe eliminar estara a eliminar outros"
            + "\ndados que estão relacionádo."
            + "\n\nAinda assim pretendes eliminar este registro?";
            if (JOptionPane.showConfirmDialog(this, msg, "ELIMINAR", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                ControloViatura cv = modelo.getRow(tableData.getSelectedRow());
                if (ControloViaturaDao.delete(cv)) {
                    JOptionPane.showMessageDialog(this, "Registro eliminado", "ELIMINAR", 1);
                    refreshTb();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao eliminar o registro", "ELIMINAR", 0);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um registro", "ELIMINAR", 2);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void refreshTb() {
        this.modelo.setLista(ControloViaturaDao.findAll());
    }

    private void novo() {
        btnRegistar.setEnabled(true);
        btnAtualizar.setEnabled(false);
        
        txtId.setText("Novo");
        
        txtEntrada.setText(new SimpleDateFormat("HH:mm").format(new Date()));
        txtEntrada.setEditable(true);
        
        txtSaida.setText(new SimpleDateFormat("HH:mm").format(new Date()));
        txtSaida.setEditable(false);
        
        cbViaturas.setSelectedIndex(0);
        cbViaturas.setEditable(true);
        cbViaturas.setNextFocusableComponent(btnRegistar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRegistar;
    private javax.swing.JComboBox<Viatura> cbViaturas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableData;
    private javax.swing.JFormattedTextField txtEntrada;
    private javax.swing.JLabel txtId;
    private javax.swing.JFormattedTextField txtSaida;
    // End of variables declaration//GEN-END:variables
}
