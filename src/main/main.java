package main;

import db.sql;

/**
 *
 * @author Alves
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //temporario, só pra testes iniciais do banco
        sql connect = new sql();
        connect.connect();
        connect.insertSQL("insert into usuarios (username, nome, email, senha, celular) values "
                + "('Bank', 'Banco de Dados', 'bd@gmail.com', 'ABC', '00000000000');");
        connect.disconnect();
        
        
        
        
    }
    
}
