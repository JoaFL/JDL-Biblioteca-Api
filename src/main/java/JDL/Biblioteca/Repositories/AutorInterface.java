package JDL.Biblioteca.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import JDL.Biblioteca.Models.*;

@Repository
public interface AutorInterface extends JpaRepository<Livro, Integer> { 
    
}