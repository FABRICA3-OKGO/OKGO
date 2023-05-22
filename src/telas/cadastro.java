package telas;

import com.formdev.flatlaf.FlatLightLaf;
import DAO.sql;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Alves
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Cadastro() {
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

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEmail = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtSenhaConfirmar = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTelefone = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtUser = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtNome = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtEmail.setAutoscrolls(false);
        jScrollPane1.setViewportView(txtEmail);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(390, 130, 350, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("CADASTRO");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 30, 200, 50);

        jLabel2.setText("Digite seu TELEFONE: (opcional)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 290, 350, 16);

        jLabel5.setText("Digite seu e-mail:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 110, 350, 16);

        jLabel6.setText("Digite sua senha:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 350, 350, 16);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(390, 370, 350, 20);

        jLabel7.setText("Confirme sua senha:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 410, 350, 16);
        getContentPane().add(txtSenhaConfirmar);
        txtSenhaConfirmar.setBounds(390, 430, 350, 20);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtTelefone.setAutoscrolls(false);
        jScrollPane2.setViewportView(txtTelefone);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(390, 310, 350, 20);

        jButton2.setBackground(new java.awt.Color(255, 255, 102));
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Continuar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(600, 470, 140, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/header1.png"))); // NOI18N
        jLabel8.setToolTipText("");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -10, 340, 600);

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(390, 470, 140, 40);

        jLabel3.setText("Digite seu USER:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 170, 350, 16);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setViewportView(txtUser);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(390, 190, 350, 20);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setViewportView(txtNome);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(390, 250, 350, 20);

        jLabel4.setText("Digite seu NOME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 230, 350, 16);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
        System.out.println("BVDS");
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Validar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        telas.Login telaLogin = new Login();
                            telaLogin.setVisible(true);
                            dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );

                FlatLightLaf.setup();
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }
 
    //metodos
    private void Validar() {

        if (txtEmail.getText().isEmpty() || txtUser.getText().isEmpty() || txtNome.getText().isEmpty() || txtSenha.getText().isEmpty() || txtSenhaConfirmar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos de cadastro corretamente!");

        } else if (!txtSenha.getText().equals(txtSenhaConfirmar.getText())) {
            JOptionPane.showMessageDialog(null, "As senhas devem ser iguais!");
            
        } else if (!txtTelefone.getText().isEmpty()) { // se telefone NAO estiver vazio
            System.out.println("Campos de Cadastro preenchidos");
            cadastrar(txtEmail.getText(), txtUser.getText(), txtNome.getText(), txtTelefone.getText(), txtSenha.getText());
            telas.Login telaLogin = new Login();
                            telaLogin.setVisible(true);
                            dispose();

        } else {
            System.out.println("Campos de Cadastro preenchidos");
            cadastrar(txtEmail.getText(), txtUser.getText(), txtNome.getText(), txtSenha.getText());
            telas.Login telaLogin = new Login();
                            telaLogin.setVisible(true);
                            dispose();
        }
    } 
    
    public void cadastrar(String email, String user, String nome, String senha){
        sql connect = new sql();
        connect.connect();
        String query ="insert into usuarios (username, nome, email, senha) values "
                +"( '" + user + "','" + nome + "','" + email + "','" + senha + "');";
        if (connect.insertSQL(query) == 0) {
            JOptionPane.showMessageDialog(null, "Email já cadastrado.","Erro ao criar cadastro.",2);
        }else{
            JOptionPane.showMessageDialog(null, "Cadastro criado!", "Sucesso!",1);}
        connect.disconnect();
        
        
    }
    
    public void cadastrar(String email, String user, String nome, String telefone, String senha){
         sql connect = new sql();
        connect.connect();
        String query = "insert into usuarios (username, nome, email, celular, senha) values "
                +"( '" + user + "','" + nome + "','" + email + "','" + telefone + "','" + senha + "');";
        if (connect.insertSQL(query) == 0) {
            JOptionPane.showMessageDialog(null, "Email já cadastrado.","Erro ao criar cadastro.",2);
        }else{
            JOptionPane.showMessageDialog(null, "Cadastro criado!", "Sucesso!",1);}
        connect.disconnect();
        
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane txtEmail;
    private javax.swing.JTextPane txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenhaConfirmar;
    private javax.swing.JTextPane txtTelefone;
    private javax.swing.JTextPane txtUser;
    // End of variables declaration//GEN-END:variables
}
