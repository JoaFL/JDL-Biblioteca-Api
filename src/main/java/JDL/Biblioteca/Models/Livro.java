package JDL.Biblioteca.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TDER_LIVRO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String titulo;

    @Column(nullable = false, length = 100)
    private String autor;

    @Column(nullable = false, length = 1500)
    private String sinopse;

    @Column(nullable = false, length = 50)
    private String capa;

    @Column(nullable = false, length = 100)
    private String editora;

    @Column(nullable = false, length = 100)
    private String edicao;

    @Column(nullable = false)
    private int ano;

    @Column(nullable = false, length = 100)
    private int disponiveis;

    @Column(nullable = false, length = 100)
    private String exemplares;

    @Column(nullable = false, length = 100)
    private String genero;

    @Column(nullable = false, length = 100)
    private String status;
}