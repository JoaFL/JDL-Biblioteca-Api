package JDL.Biblioteca.Models;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tder_livro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_LivroPK")
    private Integer idLivroPk;

    @Column(name = "TDER_nmLivro", nullable = false)
    private String nomeLivro;

    @Column(name = "TDER_nmAutor", nullable = false)
    private String nomeAutor;

    @Column(name = "TDER_dsSinopse", nullable = false)
    private String sinopse;

    @Column(name = "TDER_imgCapa", nullable = false)
    private String imgCapa;

    @Column(name = "TDER_nmEditora", nullable = false)
    private String nomeEditora;

    @Column(name = "TDER_nrEdicao", nullable = false)
    private Integer nrEdicao;

    @Column(name = "TDER_nrAno", nullable = false)
    private LocalDate nrAno;

    @Column(name = "TDER_dsExemplares", nullable = false)
    private String exemplares;

    @Column(name = "TDER_dsGenero", nullable = false)
    private String genero;

    @Column(name = "TDER_dsStatus", nullable = false)
    private String statusLivro;

    @ManyToOne
    @JoinColumn(name = "TTEP_Emprestimo_id_Emprestimo_PK", nullable = false)
    private Emprestimo emprestimo;

    @ManyToOne
    @JoinColumn(name = "TAUT_Autor_idTAUT_Autor", nullable = false)
    private Autor autor;
}