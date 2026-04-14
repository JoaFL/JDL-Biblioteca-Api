package JDL.Biblioteca.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JDL.Biblioteca.Models.Biblioteca;

@Repository
public interface BibliotecaInterface extends JpaRepository<Biblioteca, Integer> { 

    List<Biblioteca> findByNomeBiblioteca(String nomeBiblioteca);
    List<Biblioteca> findByTelefone(String telefone);
    List<Biblioteca> findByEmail(String email);
    List<Biblioteca> findByCnpj(Integer cnpj);
    List<Biblioteca> findByEndereco(String endereco);

}