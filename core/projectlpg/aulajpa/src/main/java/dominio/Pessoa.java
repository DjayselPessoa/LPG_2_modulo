package dominio;

import java.io.Serializable;

public class Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private String email;

    public Pessoa(){

    }

    public Pessoa(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa [email=" + email + ", id=" + id + ", nome=" + nome + "]";
    }

    

}
