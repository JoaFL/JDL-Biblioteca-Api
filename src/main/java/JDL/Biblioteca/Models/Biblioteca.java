package JDL.Biblioteca.Models;

//import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbta_biblioteca")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Biblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Biblioteca_PK")
    private Integer idBibliotecaPk;

    @Column(name = "TBTA_nmNomeBiblioteca", nullable = false)
    private String nomeBiblioteca;

    @Column(name = "TBTA_nrTelefone", nullable = false)
    private String telefone;

    @Column(name = "TBTA_dsEmail", nullable = false)
    private String email;

    @Column(name = "TBTA_nrCNPJ", nullable = false)
    private Integer cnpj;

    @Column(name = "TBTA_dsEndereco", nullable = false)
    private String endereco;

    @ManyToOne
    @JoinColumn(name = "TDER_LIVRO_id_LivroPK", nullable = false)
    private Livro livro;

    @ManyToOne
    @JoinColumn(name = "TUSU_Usuario_id_Usuario_PK", nullable = false)
    private Usuario usuario;
}