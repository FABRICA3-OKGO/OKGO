package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import telas.Login;

/**
 *
 * @author cassi
 */

public class usuarioDAO {
    Connection conn;
    
    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto){
        conn = new sql().conectaBD();
        try {
            String sql = "SELECT * FROM usuarios WHERE email = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getEmail());
            pstm.setString(2, objusuariodto.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;           
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro,
                    "Erro ao conectar " , 2);
            return null; 
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
    
    public void atualizar(String user, String nome, String telefone){
        sql connect = new sql();
        connect.connect();
        String query = "UPDATE usuarios SET username = '" + user + "', nome = '" + nome +"', celular = '" + telefone + "' WHERE id = " + Login.id;
        if (connect.insertSQL(query) == 0) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cadastro.","Erro ao atualizar cadastro.",2);
        }else{
            JOptionPane.showMessageDialog(null, "Cadastro atualizado!", "Sucesso!",1);}
        connect.disconnect();    
        }
    
    public void atualizarSenha(String senha){
        sql connect = new sql();
        connect.connect();
        String query = "UPDATE usuarios SET senha = '" + senha + "' WHERE id = " + Login.id;
        if (connect.insertSQL(query) == 0) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cadastro.","Erro ao atualizar cadastro.",2);
        }else{
            JOptionPane.showMessageDialog(null, "Cadastro atualizado!", "Sucesso!",1);}
        connect.disconnect();    
        }
    
    public void Apagar(){
        sql connect = new sql();
        connect.connect();
        String query = "DELETE from avaliacoes WHERE usuario_id = " + Login.id + ";";
            if (connect.insertSQL(query) == 0) {
                JOptionPane.showMessageDialog(null, "Erro ao apagar seu cadastro.","Erro ao  cadastro.",2);
                connect.disconnect();}
            else{
                String query2 = "DELETE from membros WHERE id_membro =" + Login.id + ";";
                if (connect.insertSQL(query2) == 0) {
                    JOptionPane.showMessageDialog(null, "Erro ao apagar seu cadastro.","Erro ao  cadastro.",2);
                    connect.disconnect();} 
                else{
                    String query3 = " DELETE from grupos WHERE criador_id = " + Login.id + ";";
                    if (connect.insertSQL(query3) == 0) {
                        JOptionPane.showMessageDialog(null, "Erro ao apagar seu cadastro.","Erro ao  cadastro.",2);
                        connect.disconnect();}
                    else{
                        String query4 = "DELETE from usuarios WHERE id = " + Login.id + ";";
                        if (connect.insertSQL(query4) == 0) {
                            JOptionPane.showMessageDialog(null, "Erro ao apagar seu cadastro.","Erro ao  cadastro.",2);
                            connect.disconnect();}
                        else{
                            JOptionPane.showMessageDialog(null, "Conta Encerrada com sucesso.", "Cadastro Deletado.",1);
                        connect.disconnect();} 
                        }                          
                }    
            }
    } 
    
}
