/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import DAO.grupoDAO;

/**
 *
 * @author cassi
 */
public class GrupoDetalhes extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public GrupoDetalhes() {
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

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextDescricao = new javax.swing.JTextArea();
        jButtonParticipar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelCriador = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextTag = new javax.swing.JTextArea();
        txtNomeGrupo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();

        jLabel3.setText("TAG");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 540));
        getContentPane().setLayout(null);

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(110, 400, 110, 30);

        jTextDescricao.setEditable(false);
        jTextDescricao.setColumns(20);
        jTextDescricao.setRows(5);
        jScrollPane2.setViewportView(jTextDescricao);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(90, 240, 300, 110);

        jButtonParticipar.setText("Participar");
        jButtonParticipar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonParticiparMouseClicked(evt);
            }
        });
        jButtonParticipar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParticiparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonParticipar);
        jButtonParticipar.setBounds(250, 400, 110, 30);

        jLabel1.setText("DESCRIÇÃO DO GRUPO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 210, 300, 30);

        jLabelCriador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCriador.setText("nomeAqui");
        getContentPane().add(jLabelCriador);
        jLabelCriador.setBounds(300, 90, 140, 30);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextTag.setEditable(false);
        jTextTag.setColumns(20);
        jTextTag.setRows(5);
        jScrollPane5.setViewportView(jTextTag);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(90, 160, 300, 30);

        txtNomeGrupo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNomeGrupo.setText("PLACEHOLDER");
        txtNomeGrupo.setToolTipText("");
        getContentPane().add(txtNomeGrupo);
        txtNomeGrupo.setBounds(30, 20, 300, 80);

        jLabel5.setText("TAG");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 130, 300, 30);

        jLabel6.setText("Criado por:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 90, 70, 30);

        jLabel7.setText("Grupod ID:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 90, 70, 30);

        jLabelId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelId.setText("IDAqui");
        getContentPane().add(jLabelId);
        jLabelId.setBounds(150, 90, 140, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        telas.Inicio telaInicio = new Inicio();
                            telaInicio.setVisible(true);
                            dispose();                                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonParticiparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParticiparActionPerformed
        // TODO add your handling code here:
        entrarGrupo();
    }//GEN-LAST:event_jButtonParticiparActionPerformed

    private void jButtonParticiparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonParticiparMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonParticiparMouseClicked

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
            java.util.logging.Logger.getLogger(GrupoDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrupoDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrupoDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrupoDetalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GrupoDetalhes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonParticipar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabelCriador;
    public javax.swing.JLabel jLabelId;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea3;
    public javax.swing.JTextArea jTextDescricao;
    public javax.swing.JTextArea jTextTag;
    public javax.swing.JLabel txtNomeGrupo;
    // End of variables declaration//GEN-END:variables

    //metodos
    public void entrarGrupo(){
    String grupoId = jLabelId.getText();
    grupoDAO grupo = new grupoDAO();
    grupo.Participar(grupoId);
    telas.MeusGrupos telaGruposUsuario = new MeusGrupos();
                            telaGruposUsuario.setVisible(true);
                            dispose();
    }
    
}
