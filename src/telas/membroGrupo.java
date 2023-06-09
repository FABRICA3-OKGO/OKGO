package telas;

import DAO.grupoDAO;
import DAO.usuarioDAO;
import DTO.UsuarioDTO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author cassi
 */
public class MembroGrupo extends javax.swing.JFrame {

    /**
     * Creates new form participantegrupo
     */
    public MembroGrupo(int idGrupo) {
        initComponents();
        setResizable(false);
        DefaultTableModel modelo = (DefaultTableModel) jTableMembros.getModel();
        jTableMembros.getTableHeader().setEnabled(false);
        
        readJTableMembros(idGrupo);
    }
    
    private void readJTableMembros(int idGrupo){
        DefaultTableModel modelo = (DefaultTableModel) jTableMembros.getModel();
        modelo.setNumRows(0);
        grupoDAO gdao = new grupoDAO();
        for(UsuarioDTO m: gdao.PegarMembros(idGrupo)){
            if (m.getNota()== 0.0) {
                modelo.addRow(new Object[]{
                m.getUsername(),
                "NA"
                });                
            } else{
            modelo.addRow(new Object[]{
                m.getUsername(),
                m.getNota()
                });
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
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
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMembros = new javax.swing.JTable();
        txtNomeGrupo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelCriador = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel3.setText("TAG");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 90, 300, 30);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextTag.setEditable(false);
        jTextTag.setColumns(20);
        jTextTag.setRows(5);
        jScrollPane4.setViewportView(jTextTag);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(110, 120, 320, 30);

        jTextDescricao.setEditable(false);
        jTextDescricao.setColumns(20);
        jTextDescricao.setRows(5);
        jScrollPane2.setViewportView(jTextDescricao);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(110, 190, 320, 110);

        jLabel1.setText("DESCRIÇÃO DO GRUPO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 160, 320, 30);

        jLabel2.setText("CONTATO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 310, 320, 30);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextContato.setEditable(false);
        jTextContato.setColumns(20);
        jTextContato.setRows(5);
        jTextContato.setText("\n");
        jScrollPane3.setViewportView(jTextContato);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(110, 340, 320, 60);

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(110, 450, 140, 40);

        jButton3.setBackground(new java.awt.Color(255, 153, 102));
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Sair do Grupo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(520, 450, 140, 40);

        jTableMembros.setAutoCreateRowSorter(true);
        jTableMembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Membros", "Nota Média"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMembros.setFillsViewportHeight(true);
        jTableMembros.setFocusCycleRoot(true);
        jTableMembros.getTableHeader().setReorderingAllowed(false);
        jTableMembros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMembrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMembros);
        if (jTableMembros.getColumnModel().getColumnCount() > 0) {
            jTableMembros.getColumnModel().getColumn(0).setResizable(false);
            jTableMembros.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(450, 120, 210, 280);

        txtNomeGrupo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNomeGrupo.setText("PLACEHOLDER");
        txtNomeGrupo.setToolTipText("");
        getContentPane().add(txtNomeGrupo);
        txtNomeGrupo.setBounds(110, 30, 320, 40);

        jLabel6.setText("Criado por:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 400, 60, 30);

        jLabelCriador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCriador.setText("nomeAqui");
        getContentPane().add(jLabelCriador);
        jLabelCriador.setBounds(170, 400, 140, 30);

        jLabel7.setText("Grupo ID:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 60, 50, 30);

        jLabelId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelId.setText("IDAqui");
        getContentPane().add(jLabelId);
        jLabelId.setBounds(170, 60, 140, 30);

        jLabel5.setText("<html><i> Selecione um membro para mais opções.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 400, 211, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        telas.Inicio telaInicio = new Inicio();
                            telaInicio.setVisible(true);
                            dispose(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Object[] options = { "Cancelar", "Confirmar" };
        int escolha = (JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair do grupo?", "Sair do Grupo?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]));
        System.out.println(escolha);
        if (escolha == 0) { //Cancelar
            //dispose();                   
        }else{ //Confirmar
            ChamarSair(); }
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTableMembrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMembrosMouseClicked
        int index = jTableMembros.getSelectedRow();
        TableModel model = jTableMembros.getModel();
        //pega o username do usuario selecionado
        String username = model.getValueAt(index, 0).toString();
        
        usuarioDAO user = new usuarioDAO();
            String nome = user.PegarUsuario(username).get(0).toString();
            String email = user.PegarUsuario(username).get(1).toString();
            String telefone = user.PegarUsuario(username).get(2).toString();
            String id = user.PegarUsuario(username).get(3).toString();
        PerfilMembros userInfo = new PerfilMembros(username,nome,email,telefone,id);
            userInfo.setVisible(true);     
            dispose();
        
    }//GEN-LAST:event_jTableMembrosMouseClicked

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
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabelCriador;
    public javax.swing.JLabel jLabelId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableMembros;
    public javax.swing.JTextArea jTextContato;
    public javax.swing.JTextArea jTextDescricao;
    public javax.swing.JTextArea jTextTag;
    public javax.swing.JLabel txtNomeGrupo;
    // End of variables declaration//GEN-END:variables
    public void ChamarSair(){
        String grupoId = jLabelId.getText();
        grupoDAO grupo = new grupoDAO();
        grupo.SairGrupo(grupoId);
        MeusGrupos telaMeusGrupos = new MeusGrupos();
                                telaMeusGrupos.setVisible(true);
                                dispose();    
    }
}
