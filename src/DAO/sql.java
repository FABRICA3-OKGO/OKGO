package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cassi
 */
public class sql {
    
    private Connection conn = null; 
    private Statement statement; 
    private ResultSet resultSet;
    
    //informações do banco
    private String server = "localhost:3306";
    private String databaseName = "OK_GO";
    private String user = "root";
    private String password = "PinkDarkchylde.1412";
    
    public sql(){}
    
    public sql(String server, String databaseName, String user, String password){
        this.server = server;
        this.databaseName = databaseName;
        this.user = user;
        this.password = password;
    }
    
    //get e setters

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
    
    //metodos
    public void connect(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + server + "/" + databaseName, user, password);     
            if(conn != null){
                System.out.println("Conexão estabelecida. " + conn);
            }              
        } catch (SQLException erro) {
            System.out.println("Falha ao conectar.  " + erro.getMessage());
        }
    }
    
    public Connection conectaBD(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + server + "/" + databaseName, user, password);     
            if(conn != null){
                System.out.println("Conexão estabelecida. " + conn);
            }              
        } catch (SQLException erro) {
            System.out.println("Falha ao conectar.  " + erro.getMessage());
        }
        
        return conn;
    }
    

    
    public boolean disconnect(){
        try {
            conn.close();
            System.out.println("Conexão Encerrada.");
            return true;
        } catch (Exception e) {
            System.out.println("Falha ao encerrar conexao. " + e.getMessage());
            return false;
        }
    }
    
    
    public void execSQL(String command) {
        try {
            this.statement = conn.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            this.resultSet = this.statement.executeQuery(command);
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }
    
    public int insertSQL(String SQL) {
        try {
            this.setStatement(getConn().createStatement());
            this.getStatement().executeUpdate(SQL);
            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }
    
    public boolean updateSQL(String pSQL){
        try { 
            this.setStatement(getConn().createStatement());
            getStatement().executeUpdate(pSQL);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
    public void cadastrar(String email, String user, String nome, String senha){
        sql connect = new sql();
        connect.connect();
        connect.insertSQL("insert into usuarios (username, nome, email, senha) values "
                +"(" + user + ',' + nome + ',' + email + ',' + senha + ");");       
        connect.disconnect();
        
    }
    
     public void cadastrar(String email, String user, String nome, String telefone, String senha){
         sql connect = new sql();
        connect.connect();
        connect.insertSQL("insert into usuarios (username, nome, email, telefone, senha) values "
                +"(" + user + ',' + nome + ',' + email + ',' + telefone + ',' + senha + ");");       
        connect.disconnect();
    }
     
   
}
