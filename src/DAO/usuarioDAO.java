package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

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
    
    

    
}
