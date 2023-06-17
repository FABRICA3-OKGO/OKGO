package telas;

import javax.swing.JOptionPane;
import DAO.usuarioDAO;

/**
 *
 * @author cassi
 */
public class PerfilMembros extends javax.swing.JFrame {

    /**
     * Creates new form Avaliacao
     */
    public PerfilMembros(String username, String nome,String email,String telefone, String id) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        txtUsername.setText(username);
        jTextNome.setText(nome);
        jTextEmail.setText(email);
        jTextTelefone.setText(telefone);
        jLabelId.setText(id);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextNome = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextEmail = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextTelefone = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButtonAvaliar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        txtUsername.setText("USERNAME");
        txtUsername.setToolTipText("");
        getContentPane().add(txtUsername);
        txtUsername.setBounds(80, 110, 430, 30);

        jLabel2.setText("<html> <i> Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 190, 178, 20);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextNome.setEditable(false);
        jTextNome.setColumns(20);
        jTextNome.setRows(5);
        jTextNome.setText("name name name name name name name");
        jTextNome.setPreferredSize(new java.awt.Dimension(240, 85));
        jScrollPane4.setViewportView(jTextNome);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(80, 210, 430, 30);

        jLabel3.setText("<html> <i> E-mail:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 250, 178, 20);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextEmail.setEditable(false);
        jTextEmail.setColumns(20);
        jTextEmail.setRows(5);
        jTextEmail.setText("email email email email email email email email");
        jTextEmail.setMinimumSize(new java.awt.Dimension(240, 80));
        jTextEmail.setPreferredSize(new java.awt.Dimension(240, 80));
        jScrollPane5.setViewportView(jTextEmail);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(80, 270, 430, 30);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextTelefone.setEditable(false);
        jTextTelefone.setColumns(20);
        jTextTelefone.setRows(5);
        jTextTelefone.setText("fone fone fone fone fone fone fone fone fone ");
        jTextTelefone.setMinimumSize(new java.awt.Dimension(240, 80));
        jTextTelefone.setPreferredSize(new java.awt.Dimension(240, 80));
        jScrollPane6.setViewportView(jTextTelefone);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(80, 330, 430, 30);

        jLabel4.setText("<html> <i> Telefone:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 310, 178, 20);

        jButtonAvaliar.setBackground(new java.awt.Color(255, 255, 102));
        jButtonAvaliar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonAvaliar.setText("Avaliar");
        jButtonAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvaliarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAvaliar);
        jButtonAvaliar.setBounds(370, 400, 140, 40);

        jLabel8.setText("User ID:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 140, 70, 30);

        jLabelId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelId.setText("IDAqui");
        getContentPane().add(jLabelId);
        jLabelId.setBounds(120, 140, 390, 30);

        jLabel1.setText("<html> <i> Informações do usuário:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 90, 178, 20);

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(80, 400, 140, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAvaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvaliarActionPerformed
        Object[] itens = { "1", "2", "3", "4", "5" };
        Object selectedValue = (JOptionPane.showInputDialog(null, "Com qual nota você deseja avaliar este usuário?", "Avaliação",
                JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]));
        String nota =selectedValue.toString();
            ChamarAvaliar(nota,jLabelId.getText());
    }//GEN-LAST:event_jButtonAvaliarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        telas.MeusGrupos telaMeus = new MeusGrupos();
        telaMeus.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(PerfilMembros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilMembros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilMembros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilMembros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAvaliar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabelId;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JTextArea jTextEmail;
    public javax.swing.JTextArea jTextNome;
    public javax.swing.JTextArea jTextTelefone;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables

    private void ChamarAvaliar(String nota,String usuarioId) {
        usuarioDAO usu = new usuarioDAO();
            usu.Avaliar(nota, usuarioId); //enviar nota
        MeusGrupos meusGrupos = new MeusGrupos();
        meusGrupos.setVisible(true);
        dispose();
        
    }     
}
