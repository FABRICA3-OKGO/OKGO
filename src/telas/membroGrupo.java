package telas;

/**
 *
 * @author cassi
 */
public class MembroGrupo extends javax.swing.JFrame {

    /**
     * Creates new form participantegrupo
     */
    public MembroGrupo() {
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

        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextTag = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextDescricao = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextContato = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtNomeGrupo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelCriador = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 600));
        getContentPane().setLayout(null);

        jLabel3.setText("TAG");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 120, 300, 30);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextTag.setEditable(false);
        jTextTag.setColumns(20);
        jTextTag.setRows(5);
        jScrollPane4.setViewportView(jTextTag);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(60, 150, 300, 30);

        jTextDescricao.setEditable(false);
        jTextDescricao.setColumns(20);
        jTextDescricao.setRows(5);
        jScrollPane2.setViewportView(jTextDescricao);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 230, 300, 110);

        jLabel1.setText("DESCRIÇÃO DO GRUPO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 200, 300, 30);

        jLabel2.setText("CONTATO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 350, 300, 30);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextContato.setEditable(false);
        jTextContato.setColumns(20);
        jTextContato.setRows(5);
        jTextContato.setText("\n");
        jScrollPane3.setViewportView(jTextContato);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(60, 380, 300, 60);

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(60, 490, 70, 40);

        jButton5.setText("Avaliar Membro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(140, 490, 115, 40);

        jButton3.setText("Sair do Grupo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(260, 490, 110, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "INTEGRANTES", "NOTA DO USER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(400, 90, 180, 380);

        txtNomeGrupo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNomeGrupo.setText("PLACEHOLDER");
        txtNomeGrupo.setToolTipText("");
        getContentPane().add(txtNomeGrupo);
        txtNomeGrupo.setBounds(60, 20, 510, 80);

        jLabel6.setText("Criado por:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 60, 70, 30);

        jLabelCriador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCriador.setText("nomeAqui");
        getContentPane().add(jLabelCriador);
        jLabelCriador.setBounds(470, 60, 140, 30);

        jLabel7.setText("Grupod ID:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 80, 70, 30);

        jLabelId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelId.setText("IDAqui");
        getContentPane().add(jLabelId);
        jLabelId.setBounds(130, 80, 140, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        telas.Inicio telaInicio = new Inicio();
                            telaInicio.setVisible(true);
                            dispose(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MembroGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MembroGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MembroGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MembroGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembroGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabelCriador;
    public javax.swing.JLabel jLabelId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextArea jTextContato;
    public javax.swing.JTextArea jTextDescricao;
    public javax.swing.JTextArea jTextTag;
    public javax.swing.JLabel txtNomeGrupo;
    // End of variables declaration//GEN-END:variables
}
