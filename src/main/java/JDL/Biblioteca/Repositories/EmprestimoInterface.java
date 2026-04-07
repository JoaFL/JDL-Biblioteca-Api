package JDL.Biblioteca.Repositories;

import java.util.List;
import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JDL.Biblioteca.Models.Emprestimo;

@Repository
public interface EmprestimoInterface extends JpaRepository<Emprestimo, Integer> {

    List<Emprestimo> findByStatusIdStatusPk(Integer idStatusPk);
    List<Emprestimo> findByDtEmprestimoBetween(LocalDate startDate, LocalDate endDate);
    List<Emprestimo> findByDtDevolucaoBetween(LocalDate startDate, LocalDate endDate);
    List<Emprestimo> findByQtdDiasAtrasadosGreaterThan(Integer diasAtrasados);
    List<Emprestimo> findByQtdDiasAtrasadosLessThan(Integer diasAtrasados);
    List<Emprestimo> findByPrecoDiariaGreaterThan(Float precoDiaria);
    List<Emprestimo> findByPrecoDiariaLessThan(Float precoDiaria);
}