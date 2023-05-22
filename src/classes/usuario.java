package classes;

/**
 *
 * @author cassi
 */
public class usuario {
    private int id;//
    private String username;//
    private String nome;//
    private String email;//
    private String senha;//
    private String celular;//

    public usuario() {
    }

    public usuario(int id, String username, String nome, String email, String senha, String celular) {
        this.id = id;
        this.username = username;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.celular = celular;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
      
}
    

