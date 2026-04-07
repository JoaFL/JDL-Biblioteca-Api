package JDL.Biblioteca.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JDL.Biblioteca.Models.TipoUsuario;

@Repository
public interface TipoUsuarioInterface extends JpaRepository<TipoUsuario, Integer> { 

    List<TipoUsuario> findByTipoPermissao(String descricao);
}