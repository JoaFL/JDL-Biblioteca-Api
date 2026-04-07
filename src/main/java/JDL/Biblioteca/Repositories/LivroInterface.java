package JDL.Biblioteca.Repositories;

import java.util.List;
import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import JDL.Biblioteca.Models.*;

@Repository
public interface LivroInterface extends JpaRepository<Livro, Integer> {

    List<Livro> findByNomeLivro(String nomeLivro);
    List<Livro> findByNomeAutor(String nomeAutor);
    List<Livro> findByGenero(String genero);

    List<Livro> findByStatusLivro(String statusLivro);
    List<Livro> findByNrAno(LocalDate nrAno);
    List<Livro> findByNrEdicao(Integer nrEdicao);
}