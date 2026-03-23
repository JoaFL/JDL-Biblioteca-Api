package JDL.Biblioteca.Models;

import JDL.Biblioteca.Enums.NivelPerm;

public class Usuario extends DbModel{

    private String matricula;
    private String nome;
    private String numero;
    private String serie;
    private String email;
    private NivelPerm nivelPerm;
    private String senha;


    public Usuario(int id, String matricula, String nome, String numero, String serie, String email, NivelPerm nivelPerm, String senha) {

        super(id);

        this.matricula = matricula;
        this.nome = nome;
        this.numero = numero;
        this.serie = serie; 
        this.email = email; 
        this.nivelPerm = nivelPerm; 
        this.senha = senha;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getNivelPerm() {
        return nivelPerm;
    }
    public void setNivelPerm(int nivelPerm) {
        this.nivelPerm = nivelPerm;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


}