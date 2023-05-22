package DAO;


import DTO.grupo;
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

    Connection conn;    
    public ResultSet pesquisarGrupo(String tag){
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
    
    

    
}