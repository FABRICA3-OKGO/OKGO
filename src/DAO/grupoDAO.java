package DAO;

import DTO.grupo;
import DAO.sql;
import DTO.UsuarioDTO;
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
                    + "'group by id ORDER by id DESC;";
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
    
    public List<UsuarioDTO> PegarMembros(int grupoId){
        Connection conn; 
        conn = new sql().conectaBD();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<UsuarioDTO> membros = new ArrayList<>();
        
          try {
            String sql = "SELECT username, avg(nota)"
                    + " FROM membros AS mem "
                    + " LEFT JOIN usuarios as usu on"
                    + " id_membro = usu.id"
                    + " LEFT JOIN grupos as gru on "
                    + " id_grupo = gru.id "
                    + " LEFT JOIN avaliacoes as ava on"
                    + " ava.usuario_id = usu.id"
                    + " where gru.id = " + grupoId 
                    + " group by usu.id;";
            PreparedStatement pstm = conn.prepareStatement(sql);            
            rs = pstm.executeQuery();
            
            while (rs.next()){
                UsuarioDTO membro = new UsuarioDTO();
                membro.setUsername(rs.getString("username"));
                membro.setNota(rs.getDouble("avg(nota)"));
                membros.add(membro);
            }
            
          }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel recuperar informações sobre os membros do grupo: " + erro,
                    "database errror" , 2);
        }
        return membros;
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
    
    public void SairGrupo(String grupoId){
        sql connect = new sql();
        connect.connect();
        String query ="DELETE from membros WHERE id_grupo =" + grupoId +
                 " and id_membro =" + Login.id + ";";
        if (connect.insertSQL(query) == 0) {
            JOptionPane.showMessageDialog(null, "Não foi possível sair do grupo.","Erro ao sair do grupo.",2);
            connect.disconnect();
        }else{
            JOptionPane.showMessageDialog(null, "Você saiu do grupo com sucesso.", "Sucesso.",1);}
        connect.disconnect();
    }
    
    public void ApagarGrupo(String grupoId){
        sql connect = new sql();
        connect.connect();
        String query = "DELETE from membros WHERE id_grupo = " + grupoId + ";";
        if (connect.insertSQL(query) == 0) {
            JOptionPane.showMessageDialog(null, "Erro 01 ao apagar grupo.","Erro ao apagar grupo.",2);
            connect.disconnect();}
        else{
            String query2 = "DELETE from grupos WHERE id = " + grupoId + ";";
            if (connect.insertSQL(query2) == 0) {
                JOptionPane.showMessageDialog(null, "Erro 02 ao apagar grupo.","Erro ao apagar grupo.",2);
                connect.disconnect();}
            else{
                JOptionPane.showMessageDialog(null, "Grupo apagado com sucesso.", "Grupo Apagado.",1);
                connect.disconnect();
            } 
        }   
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
    
    public void Expulsar(String usuarioId, String grupoId){
        int idTeste =  Integer.parseInt(usuarioId);
        if (idTeste == Login.id ) {
            JOptionPane.showMessageDialog(null, "Você não pode expulsar a sí mesmo","Erro ao expulsar.",2);   
        }else{
        sql connect = new sql();
        connect.connect();
        String query = "DELETE from membros where id_grupo = " + grupoId  +" and "
                + "id_membro = " + usuarioId + " ;";
        if (connect.insertSQL(query) == 0) {
            JOptionPane.showMessageDialog(null, "Erro ao expulsar usuario.","Erro ao expulsar.",2);
        }else{
            JOptionPane.showMessageDialog(null, "Usuário Expulso!", "Sucesso!",1);}
        connect.disconnect();    
        }
    }
   
}
