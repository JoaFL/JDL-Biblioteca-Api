package JDL.Biblioteca.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JDL.Biblioteca.Models.Editora;

@Repository
public interface EditoraInterface extends JpaRepository<Editora, Integer> { 

    List<Editora> findByNomeEditora(String nomeEditora);

}