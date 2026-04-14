package JDL.Biblioteca.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JDL.Biblioteca.Models.Autor;

@Repository
public interface AutorInterface extends JpaRepository<Autor, Integer> { 
    
    List<Autor> findByNomeAutor(String nomeAutor);
    List<Autor> findBySobrenome(String sobrenome);

}