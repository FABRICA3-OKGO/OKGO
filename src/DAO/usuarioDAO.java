package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
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
    
    public void AtualizarSenha(String senha){
        sql connect = new sql();
        connect.connect();
        String query = "UPDATE usuarios SET senha = '" + senha + "' WHERE id = " + Login.id;
        if (connect.insertSQL(query) == 0) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cadastro.","Erro ao atualizar cadastro.",2);
        }else{
            JOptionPane.showMessageDialog(null, "Cadastro atualizado!", "Sucesso!",1);}
        connect.disconnect();    
        }
    
    public void Avaliar(String nota, String idUsuario){
        int idTeste =  Integer.parseInt(idUsuario);
        if (idTeste == Login.id ) {
            JOptionPane.showMessageDialog(null, "Você não pode avaliar a sí mesmo","Erro ao avaliar.",2);   
        }else{
       
        sql connect = new sql();
        connect.connect();
        String query = "INSERT into avaliacoes (usuario_id, nota) values"
                + "(" + idUsuario + ", " + nota +")";
        if (connect.insertSQL(query) == 0) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar avaliação.","Erro ao avaliar.",2);
        }else{
            JOptionPane.showMessageDialog(null, "Avaliação enviada!", "Sucesso!",1);}
        connect.disconnect();    
        }
    }
    
    public List<String> PegarUsuario(String username){
       Connection conn; 
       conn = new sql().conectaBD();
       
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<String> userInfo = new ArrayList<>();
       
       try {
            String sql = "SELECT nome, email, celular, id FROM usuarios WHERE username = '" + username +"' ;";
            PreparedStatement pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()){
               String a;
               String b;
               String c;
               String d;
               a = rs.getString("nome");
               userInfo.add(a);
               b = rs.getString("email");
               userInfo.add(b);
               c = rs.getString("celular");
               userInfo.add(c);    
               d = rs.getString("id");
               userInfo.add(d);   
            }           
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel recuperar as informações do usuario desejado: " + erro,
                    "Erro ao conectar " , 2);
        }
       return userInfo;
    }
    
    public void Apagar(){
        sql connect = new sql();
        connect.connect();
        String query = "DELETE from avaliacoes WHERE usuario_id = " + Login.id + ";";
            if (connect.insertSQL(query) == 0) {
                JOptionPane.showMessageDialog(null, "Erro ao apagar seu cadastro.","Erro ao apagar cadastro.",2);
                connect.disconnect();}
            else{
                String query2 = "DELETE from membros WHERE id_membro =" + Login.id + ";";
                if (connect.insertSQL(query2) == 0) {
                    JOptionPane.showMessageDialog(null, "Erro ao apagar seu cadastro.","Erro ao apagar cadastro.",2);
                    connect.disconnect();} 
                else{
                    String query3 = " DELETE from grupos WHERE criador_id = " + Login.id + ";";
                    if (connect.insertSQL(query3) == 0) {
                        JOptionPane.showMessageDialog(null, "Erro ao apagar seu cadastro.","Erro ao apagar cadastro.",2);
                        connect.disconnect();}
                    else{
                        String query4 = "DELETE from usuarios WHERE id = " + Login.id + ";";
                        if (connect.insertSQL(query4) == 0) {
                            JOptionPane.showMessageDialog(null, "Erro ao apagar seu cadastro.","Erro ao apagar cadastro.",2);
                            connect.disconnect();}
                        else{
                            JOptionPane.showMessageDialog(null, "Conta Encerrada com sucesso.", "Cadastro Deletado.",1);
                            connect.disconnect();} 
                        }                          
                }    
            }
    } 
    
}
