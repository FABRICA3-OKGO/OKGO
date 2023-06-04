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
    
  
}