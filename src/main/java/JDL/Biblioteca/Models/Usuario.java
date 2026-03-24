package JDL.Biblioteca.Models;

import JDL.Biblioteca.Enums.NivelPerm;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Usuario extends DbModel {

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
}