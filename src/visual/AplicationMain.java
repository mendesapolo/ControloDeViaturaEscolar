/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

/**
 *
 * @author António Apolo
 */
public class AplicationMain extends javax.swing.JFrame {

    /**
     * Creates new form AplicationMain
     */
    public AplicationMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        btnViaturaMn = new javax.swing.JButton();
        btnMotoristaMn = new javax.swing.JButton();
        btnFuncionarioMn = new javax.swing.JButton();
        btnManutencaoMn = new javax.swing.JButton();
        btnControloViaturaMn = new javax.swing.JButton();
        btnUsuarioMn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(224, 243, 230));

        jPanel2.setBackground(new java.awt.Color(18, 182, 88));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTROLO DE VIATURAS ESCOLAR");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jButton7.setBackground(new java.awt.Color(204, 255, 204));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setText("Sobre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnViaturaMn.setBackground(new java.awt.Color(190, 234, 214));
        btnViaturaMn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnViaturaMn.setText("VIATURA");
        btnViaturaMn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViaturaMnActionPerformed(evt);
            }
        });

        btnMotoristaMn.setBackground(new java.awt.Color(190, 234, 214));
        btnMotoristaMn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMotoristaMn.setText("MOTORISTA");
        btnMotoristaMn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotoristaMnActionPerformed(evt);
            }
        });

        btnFuncionarioMn.setBackground(new java.awt.Color(190, 234, 214));
        btnFuncionarioMn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnFuncionarioMn.setText("FUNCIONÁRIO");
        btnFuncionarioMn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioMnActionPerformed(evt);
            }
        });

        btnManutencaoMn.setBackground(new java.awt.Color(190, 234, 214));
        btnManutencaoMn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnManutencaoMn.setText("MANUTENÇÃO");
        btnManutencaoMn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManutencaoMnActionPerformed(evt);
            }
        });

        btnControloViaturaMn.setBackground(new java.awt.Color(190, 234, 214));
        btnControloViaturaMn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnControloViaturaMn.setText("CONTROLO");
        btnControloViaturaMn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControloViaturaMnActionPerformed(evt);
            }
        });

        btnUsuarioMn.setBackground(new java.awt.Color(190, 234, 214));
        btnUsuarioMn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnUsuarioMn.setText("USUÁRIO");
        btnUsuarioMn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioMnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManutencaoMn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFuncionarioMn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUsuarioMn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViaturaMn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnControloViaturaMn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMotoristaMn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnControloViaturaMn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUsuarioMn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMotoristaMn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnManutencaoMn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViaturaMn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFuncionarioMn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViaturaMnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViaturaMnActionPerformed
        ViaturaFrm vf = new ViaturaFrm(this, true);
        vf.setVisible(true);
    }//GEN-LAST:event_btnViaturaMnActionPerformed

    private void btnFuncionarioMnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioMnActionPerformed
        FuncionarioFrm ff = new FuncionarioFrm(this, true);
        ff.setVisible(true);
    }//GEN-LAST:event_btnFuncionarioMnActionPerformed

    private void btnMotoristaMnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotoristaMnActionPerformed
        MotoristaFrm mf = new MotoristaFrm(this, true);
        mf.setVisible(true);
    }//GEN-LAST:event_btnMotoristaMnActionPerformed

    private void btnManutencaoMnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManutencaoMnActionPerformed
        ManutencaoFrm mtf = new ManutencaoFrm(this, true);
        mtf.setVisible(true);
    }//GEN-LAST:event_btnManutencaoMnActionPerformed

    private void btnControloViaturaMnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControloViaturaMnActionPerformed
        ControloViaturaFrm cvf = new ControloViaturaFrm(this, true);
        cvf.setVisible(true);
    }//GEN-LAST:event_btnControloViaturaMnActionPerformed

    private void btnUsuarioMnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioMnActionPerformed
        UsuarioFrm usf = new UsuarioFrm(this, true);
        usf.setVisible(true);
    }//GEN-LAST:event_btnUsuarioMnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplicationMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicationMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicationMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicationMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplicationMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnControloViaturaMn;
    private javax.swing.JButton btnFuncionarioMn;
    private javax.swing.JButton btnManutencaoMn;
    private javax.swing.JButton btnMotoristaMn;
    private javax.swing.JButton btnUsuarioMn;
    private javax.swing.JButton btnViaturaMn;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
