package DAO;

import DTO.grupo;
import DAO.sql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import telas.Login;
import static telas.Login.id;

/**
 *
 * @author cassi
 */
public class grupoDAO {
 
    public ResultSet pesquisarGrupo(String tag){
        Connection conn; 
        conn = new sql().conectaBD();
        try {
            String sql = "SELECT * FROM grupos WHERE tag = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, tag);
            
            ResultSet rs = pstm.executeQuery();
            return rs;           
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel recuperar informações de grupos com a tag desejada: " + erro,
                    "Erro ao conectar " , 2);
            return null; 
        }
    }
    
    public List<grupo> GruposInicio(){
        Connection conn; 
        conn = new sql().conectaBD();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<grupo> grupos = new ArrayList<>();
                
        try {
            String sql = "SELECT gru.nome, tag, gru.id, usu.username AS criador"
                    + " FROM grupos AS gru LEFT JOIN usuarios as usu on"
                    + " gru.criador_id = usu.id ORDER by id DESC;";
            PreparedStatement pstm = conn.prepareStatement(sql);            
            rs = pstm.executeQuery();
            
            while (rs.next()){
                grupo grupo = new grupo();
                grupo.setId(rs.getInt("id"));
                grupo.setNome(rs.getString("nome"));
                grupo.setTag(rs.getString("tag"));
                grupo.setCriador(rs.getString("criador"));
                grupos.add(grupo);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel recuperar informações dos grupos mais recentes: " + erro,
                    "database errror" , 2);
        }
        return grupos;
    }
    
    public List<grupo> MeusGrupos(){
        Connection conn; 
        conn = new sql().conectaBD();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<grupo> grupos = new ArrayList<>();
                
        try {
            String sql = "SELECT gru.nome, tag, gru.id, usu.username AS criador"
                    + " FROM grupos AS gru LEFT JOIN usuarios as usu on"
                    + " gru.criador_id = usu.id"
                    + " LEFT JOIN membros as mem"
                    + " on id_grupo = gru.id"
                    + " where id_membro = " + id 
                    + " ORDER by id DESC;";
            PreparedStatement pstm = conn.prepareStatement(sql);            
            rs = pstm.executeQuery();
            
            while (rs.next()){
                grupo grupo = new grupo();
                grupo.setId(rs.getInt("id"));
                grupo.setNome(rs.getString("nome"));
                grupo.setTag(rs.getString("tag"));
                grupo.setCriador(rs.getString("criador"));
                grupos.add(grupo);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel recuperar informações dos grupos mais recentes: " + erro,
                    "database errror" , 2);
        }
        return grupos;
    }
    
    public List<grupo> Pesquisar(String tag){
        Connection conn; 
        conn = new sql().conectaBD();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<grupo> grupos = new ArrayList<>();
                
        try {
            String sql = "SELECT gru.nome, tag, gru.id, usu.username AS criador"
                    + " FROM grupos AS gru LEFT JOIN usuarios as usu on"
                    + " gru.criador_id = usu.id"
                    + " where tag = '" + tag 
                    + "' ORDER by id DESC;";
            PreparedStatement pstm = conn.prepareStatement(sql);            
            rs = pstm.executeQuery();
            
            while (rs.next()){
                grupo grupo = new grupo();
                grupo.setId(rs.getInt("id"));
                grupo.setNome(rs.getString("nome"));
                grupo.setTag(rs.getString("tag"));
                grupo.setCriador(rs.getString("criador"));
                grupos.add(grupo);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel recuperar informações de grupos correspondentes a pesquisa: " + erro,
                    "database errror" , 2);
        }
        return grupos;
    }
    
    public List<String> PegarDescricao(int grupoId){
       Connection conn; 
       conn = new sql().conectaBD();
        
       PreparedStatement stmt = null;
       ResultSet rs = null;
        
       List<String> descri = new ArrayList<>();
            
        try {
            String sql = "SELECT descricao FROM grupos AS gru"
                    + " where gru.id = '" + grupoId + "'";
            PreparedStatement pstm = conn.prepareStatement(sql);            
            rs = pstm.executeQuery();
            
            while (rs.next()){
               String a;
               a = rs.getString("descricao");
               descri.add(a);
             }
                
            } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel recuperar a descricao do grupo: " + erro,
                    "database errror" , 2);
        }
        return descri;
    }
    
    public List<String> PegarContato(int grupoId){
       Connection conn; 
       conn = new sql().conectaBD();
        
       PreparedStatement stmt = null;
       ResultSet rs = null;
        
       List<String> contato = new ArrayList<>();
            
        try {
            String sql = "SELECT contato FROM grupos AS gru"
                    + " where gru.id = '" + grupoId + "'";
            PreparedStatement pstm = conn.prepareStatement(sql);            
            rs = pstm.executeQuery();
            
            while (rs.next()){
               String a;
               a = rs.getString("contato");
               contato.add(a);
             }
                
            } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel recuperar as informações solicitadas do grupo: " + erro,
                    "database errror" , 2);
        }
        return contato;
    }

    public void Participar(String grupoId){
        sql connect = new sql();
        connect.connect();
        String query ="insert into membros (id_grupo, id_membro) values "
                +"( '" + grupoId + "','" + Login.id + "');";
        if (connect.insertSQL(query) == 0) {
            JOptionPane.showMessageDialog(null, "Não foi possível entrar no grupo.","Erro ao entrar no grupo.",2);
            connect.disconnect();
        }else{
            JOptionPane.showMessageDialog(null, "Inscrito com sucesso!", "Sucesso!",1);}
        connect.disconnect();
    }
    
    public void criarGrupo(String nome, String tag, String descricao, String contato){
        sql connect = new sql();
        connect.connect();
        String query ="insert into grupos (tag, nome, descricao, criador_id, contato) values "
                +"( '" + tag + "','" + nome + "','" + descricao + "','" + Login.id + "','" + contato + "');";
        if (connect.insertSQL(query) == 0) {
            JOptionPane.showMessageDialog(null, "Não foi possível criar o grupo.","Erro ao criar grupo.",2);
            connect.disconnect();
        }else{
            JOptionPane.showMessageDialog(null, "Grupo criado!", "Sucesso!",1);}
        connect.disconnect();
    }
    
    public int ValidarMembro(int grupoId){
        Connection conn; 
        conn = new sql().conectaBD();
        PreparedStatement stmt = null;
        ResultSet rs = null;
       
        String sql = "select * from membros where id_grupo = " + grupoId + " and id_membro = " + Login.id + " ;"; 
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);            
            rs = pstm.executeQuery();
            
            if (rs.next()){
               int teste = rs.getInt("id_membro");
                if (teste == Login.id) {
                    return 1;} // é membro
            }      
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Não foi possivel recuperar as informações solicitadas do grupo: " + erro,
        "database errror" , 2);
        }
        return 2;  //não é membro     
    }
    
    public boolean ValidarAdm(int grupoId){
        Connection conn;
        conn = new sql().conectaBD();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql = "select criador_id from grupos where id = " + grupoId + " ;"; 
        try{
            PreparedStatement pstm = conn.prepareStatement(sql);            
            rs = pstm.executeQuery();
            
            if (rs.next()){
                int admId = rs.getInt("criador_id");
                if (Login.id == admId) {
                    return true;
                }
            }else{
                return false;}
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Não foi possivel recuperar as informações solicitadas do grupo: " + erro,
        "database errror" , 2);
        }
        return false;
    }
   
}
