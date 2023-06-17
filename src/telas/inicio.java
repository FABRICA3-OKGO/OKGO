/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import DAO.grupoDAO;
import DTO.grupo;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author cassi
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Inicio() {
        initComponents();
        setResizable(false);
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        jTable2.setRowSorter(new TableRowSorter(modelo));
        
        readJTable();
        jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(45);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(300);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(138);
        jTable2.getTableHeader().setEnabled(false);
        
    }
    
    public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setNumRows(0);        
        grupoDAO gdao = new grupoDAO();
        for(grupo g: gdao.GruposInicio()){
        
            modelo.addRow(new Object[]{
                
                g.getId(),
                g.getTag(),
                g.getNome(),
                g.getCriador()
            });
        }
    }
    
    GrupoDetalhes telaInfo = new GrupoDetalhes();
    //MembroGrupo telaMembro = new MembroGrupo();
    //AdminGrupo telaAdmin = new AdminGrupo();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        txtNomeGrupo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPesquisa = new javax.swing.JTextPane();
        jLabelLupa = new javax.swing.JLabel();
        txtNomeGrupo1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        txtNomeGrupo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNomeGrupo.setText("PLACEHOLDER");
        txtNomeGrupo.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/definicoes.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 510, 24, 24);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuarios-alt (1).png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 410, 24, 24);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casa (1).png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 460, 24, 24);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setEnabled(false);
        jPanel1.setFocusable(false);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

        jScrollPane2.setViewportView(jTextPesquisa);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 40, 570, 30);

        jLabelLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/procurar.png"))); // NOI18N
        jLabelLupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLupaMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelLupa);
        jLabelLupa.setBounds(600, 40, 30, 30);

        txtNomeGrupo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNomeGrupo1.setText("GRUPOS MAIS RECENTES");
        txtNomeGrupo1.setToolTipText("");
        jPanel1.add(txtNomeGrupo1);
        txtNomeGrupo1.setBounds(20, 100, 396, 32);

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDs", "TAG", "Nome", "Criador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setToolTipText("");
        jTable2.setAutoscrolls(false);
        jTable2.setFillsViewportHeight(true);
        jTable2.setFocusCycleRoot(true);
        jTable2.setRowHeight(23);
        jTable2.setRowSelectionAllowed(true);
        jTable2.setShowGrid(false);
        jTable2.setShowVerticalLines(true);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(7);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(20, 140, 610, 415);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, -10, 650, 620);

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.setMaximumSize(new java.awt.Dimension(24, 24));
        jButton1.setMinimumSize(new java.awt.Dimension(24, 24));
        jButton1.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(720, 490, 50, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        telas.Perfil telaPerfil = new Perfil();
        telaPerfil.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        telas.CriarGrupo telaCriarGrupo = new CriarGrupo();
        telaCriarGrupo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        //clicar na tabela e ela levar a outra pagina
        
        int index = jTable2.getSelectedRow();
        //DefaultTableModel modelo2 = (DefaultTableModel) jTable2.getModel();
        //jTable2.setRowSorter(new TableRowSorter(modelo));
        TableModel model = jTable2.getModel();
        //pega o id do grupo selecionado para pegar as informações adicionais 
        int id = Integer.valueOf(model.getValueAt(index, 0).toString());
        //informações reaproveitadas
        String tag = model.getValueAt(index, 1).toString();
        String nome = model.getValueAt(index, 2).toString();
        String criador = model.getValueAt(index, 3).toString();
        //pegando info adicionais do BD uteis pra todos os tipos de usuario
        grupoDAO desc = new grupoDAO();
        String descricao = desc.PegarDescricao(id).get(0).toString();
        
        //teste pra ver se é membro ou adm
        grupoDAO info = new grupoDAO();
        if (info.ValidarMembro(id) == 1) { 
            String contato = info.PegarContato(id).get(0).toString();
            //teste pra ver se é ADM
                if (info.ValidarAdm(id)) {
                    Admin(id,nome,tag,criador,descricao,contato);
                } else {
                Membro(id,nome,tag,criador,descricao,contato);
                }
        } else if (info.ValidarMembro(id) ==2) {
            Visitante(id,nome,tag,criador,descricao);
        } else {
            System.out.println("Ocorreu um erro na validação.");
        }        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        telas.MeusGrupos telaGruposUsuario = new MeusGrupos();
                            telaGruposUsuario.setVisible(true);
                            dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabelLupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLupaMouseClicked
        // TODO add your handling code here:
        telas.Pesquisa telaPesquisa = new Pesquisa(jTextPesquisa.getText());
                            telaPesquisa.setVisible(true);
                                    dispose();                      
    }//GEN-LAST:event_jLabelLupaMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelLupa;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextPane jTextPesquisa;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private javax.swing.JLabel txtNomeGrupo;
    private javax.swing.JLabel txtNomeGrupo1;
    // End of variables declaration//GEN-END:variables
public void Membro(int id, String nome, String tag, String criador, String descricao, String contato){
        MembroGrupo telaMembro = new MembroGrupo(id);
        telaMembro.jLabelId.setText(Integer.toString(id));
        telaMembro.txtNomeGrupo.setText(nome);
        telaMembro.jTextTag.setText(tag);
        telaMembro.jLabelCriador.setText(criador);
        telaMembro.jTextDescricao.setText(descricao);
        telaMembro.jTextContato.setText(contato);
        //chamando a tela
        telaMembro.setVisible(true);
        telaMembro.pack();
        telaMembro.setLocationRelativeTo(null);
        dispose();
}
    public void Admin(int id, String nome, String tag, String criador, String descricao, String contato){
        AdminGrupo telaAdmin = new AdminGrupo(id);
        telaAdmin.jLabelId.setText(Integer.toString(id));
        telaAdmin.txtNomeGrupo.setText(nome);
        telaAdmin.jTextTag.setText(tag);
        telaAdmin.jLabelCriador.setText(criador);
        telaAdmin.jTextDescricao.setText(descricao);
        telaAdmin.jTextContato.setText(contato);
        //chamando a tela
        telaAdmin.setVisible(true);
        telaAdmin.pack();
        telaAdmin.setLocationRelativeTo(null);
        dispose();
}
    public void Visitante(int id, String nome, String tag, String criador, String descricao){
    //tela de Visitante - definindo os textos
        telaInfo.jLabelId.setText(Integer.toString(id));
        telaInfo.txtNomeGrupo.setText(nome);
        telaInfo.jTextTag.setText(tag);
        telaInfo.jLabelCriador.setText(criador);
        telaInfo.jTextDescricao.setText(descricao);
        //chamando a tela
        telaInfo.setVisible(true);
        telaInfo.pack();
        telaInfo.setLocationRelativeTo(null);
        dispose();
}
    
}
