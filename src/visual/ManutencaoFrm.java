/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import classe.Manutencao;
import classe.Viatura;
import dao.ManutencaoDao;
import dao.ViaturaDao;
import javax.swing.JOptionPane;
import table.ManutencaoTb;

/**
 *
 * @author António Apolo
 */
public class ManutencaoFrm extends javax.swing.JDialog {

    private final ManutencaoTb modelo;

    /**
     * Creates new form FuncionarioFrm
     *
     * @param parent
     * @param modal
     */
    public ManutencaoFrm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.modelo = new ManutencaoTb();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        cbViaturas = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Viatura Painel");

        tableData.setBackground(new java.awt.Color(181, 244, 181));
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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
        jLabel2.setText("Descrição da Manutenção");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("ID:");

        txtId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(204, 0, 0));
        txtId.setText("Novo");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Selecione a Viatura");

        cbViaturas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbViaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(192, 192, 192))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbViaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Manutenção de Viaturas");

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (!"Novo".equalsIgnoreCase(txtId.getText())) {
            if (!txtDescricao.getText().equals("")) {
                if (cbViaturas.getSelectedIndex() >= 0) {
//                    java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
                    Manutencao mt = ManutencaoDao.getById(Integer.parseInt(txtId.getText()));
                    mt.setDescricao(txtDescricao.getText());
                    mt.setViatura((Viatura) cbViaturas.getSelectedItem());
                    if (ManutencaoDao.updade(mt)) {
                        JOptionPane.showMessageDialog(this, "Atualizado com Sucesso", "Sucesso", 1);
                        refreshTb();
                        novo();
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao Atualizar", "ERRO", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi selecionado a viatura", "VIATURA", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos", "Campos Vazios", 2);
                txtDescricao.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não foi selecionado nenhum registro", "Sem Registro", 2);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        novo();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
        if (!txtDescricao.getText().equals("")) {
            if (cbViaturas.getSelectedIndex() >= 0) {
                java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
                Manutencao mt = new Manutencao(txtDescricao.getText(), (Viatura) cbViaturas.getSelectedItem(), data);
                if (ManutencaoDao.cadastrar(mt)) {
                    JOptionPane.showMessageDialog(this, "Registado com Sucesso", "Sucesso", 1);
                    refreshTb();
                    novo();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao registrar", "ERRO", 0);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Não foi selecionado a viatura", "VIATURA", 2);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos", "Campos Vazios", 2);
            txtDescricao.requestFocus();
        }
    }//GEN-LAST:event_btnRegistarActionPerformed

    private void tableDataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseReleased
        if (tableData.getSelectedRow() >= 0) {
            Manutencao mt = modelo.getRow(tableData.getSelectedRow());
            btnRegistar.setEnabled(false);
            btnAtualizar.setEnabled(true);
            txtId.setText(mt.getId() + "");
            txtDescricao.setText(mt.getDescricao());
            
            int idx = ViaturaDao.findAll().indexOf(mt.getViatura());
            cbViaturas.setSelectedIndex(idx);
        }
    }//GEN-LAST:event_tableDataMouseReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tableData.getSelectedRow() >= 0 && !txtId.getText().equalsIgnoreCase("Novo")) {
            String msg ="Tem certeza que pretende eliminar este registro?"
            + "\nSe eliminar estara a eliminar outros"
            + "\ndados que estão relacionádo."
            + "\n\nAinda assim pretendes eliminar este registro?";
            if (JOptionPane.showConfirmDialog(this, msg, "ELIMINAR", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                Manutencao mt = modelo.getRow(tableData.getSelectedRow());
                if (ManutencaoDao.delete(mt)) {
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
        this.modelo.setLista(ManutencaoDao.findAll());
    }

    private void novo() {
        btnRegistar.setEnabled(true);
        btnAtualizar.setEnabled(false);
        txtId.setText("Novo");
        txtDescricao.setText("");
        cbViaturas.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRegistar;
    private javax.swing.JComboBox<Viatura> cbViaturas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableData;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JLabel txtId;
    // End of variables declaration//GEN-END:variables
}
