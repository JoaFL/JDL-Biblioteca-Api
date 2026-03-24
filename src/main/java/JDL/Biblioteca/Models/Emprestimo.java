package JDL.Biblioteca.Models;

import java.time.LocalDate;
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
public class Emprestimo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private LocalDate dataEmprestimo;
    
    @Column(nullable = false)
    private LocalDate dataDevolucao;

    @Column(nullable = false)
    private int qtDiasEmprestados;

    @Column(nullable = false)
    private double precoDiaria;

    @Column(nullable = false)
    private int qtDiasAtrasados;
}