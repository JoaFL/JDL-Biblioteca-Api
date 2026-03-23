package JDL.Biblioteca.Models;

public class Livro extends DbModel {

    private String titulo;
    private String autor;
    private String sinopse;
    private String capa;
    private String editora;
    private String edicao;
    private int ano;
    private int disponiveis;
    private int exemplares;
    private String genero;
    private String status;

    public Livro(int id, String titulo, String autor, String sinopse, String capa, 
                 String editora, String edicao, int ano, int disponiveis, 
                 int exemplares, String genero, String status) {
        
        super(id);
        
        this.titulo = titulo;
        this.autor = autor;
        this.sinopse = sinopse;
        this.capa = capa;
        this.editora = editora;
        this.edicao = edicao;
        this.ano = ano;
        this.disponiveis = disponiveis;
        this.exemplares = exemplares;
        this.genero = genero;
        this.status = status;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getSinopse() { return sinopse; }
    public void setSinopse(String sinopse) { this.sinopse = sinopse; }

    public String getCapa() { return capa; }
    public void setCapa(String capa) { this.capa = capa; }

    public String getEditora() { return editora; }
    public void setEditora(String editora) { this.editora = editora; }

    public String getEdicao() { return edicao; }
    public void setEdicao(String edicao) { this.edicao = edicao; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public int getDisponiveis() { return disponiveis; }
    public void setDisponiveis(int disponiveis) { this.disponiveis = disponiveis; }

    public int getExemplares() { return exemplares; }
    public void setExemplares(int exemplares) { this.exemplares = exemplares; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}