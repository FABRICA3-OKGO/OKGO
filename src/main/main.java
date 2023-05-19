package main;

import db.sql;
import telas.login;

/**
 *
 * @author Alves
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        telas.login login = new login();
        login.setVisible(true);
        
        //temporario, só pra testes iniciais do banco
        //sql connect = new sql();
        //connect.connect();
        //connect.insertSQL("insert into usuarios (username, nome, email, senha, celular) values "
        //        + "('testebd', 'Banco de Dados', 'bd@gmail.com', 'ABC', '00000000000');");
        //connect.disconnect();
        
        
    }
    
}
