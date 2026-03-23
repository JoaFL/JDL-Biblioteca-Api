package JDL.Biblioteca.Models;

public class Biblioteca extends DbModel {

    private String nome;
    private String telefone;
    private String email;
    private String cnpj;
    private String endereco;

    public Biblioteca(int id, String nome, String telefone, String email, String cnpj, String endereco) {
        
        super(id);
        
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}