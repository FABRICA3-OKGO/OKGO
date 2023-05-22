package DAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

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
    
    public ResultSet GruposInicio(){
        Connection conn; 
        conn = new sql().conectaBD();
        try {
            String sql = "SELECT * FROM grupos ORDER by data_criacao";
            PreparedStatement pstm = conn.prepareStatement(sql);            
            ResultSet rs = pstm.executeQuery();
            return rs;           
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel recuperar informações dos grupos mais recentes: " + erro,
                    "database errror" , 2);
            return null; 
        }
    }
    
  
}