package JDL.Biblioteca.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JDL.Biblioteca.Models.Status;

@Repository
public interface StatusInterface extends JpaRepository<Status, Integer> { 

    List<Status> findByDsStatus(String dsStatus);
    List<Status> findByDtAtualizacao(String dtAtualizacao);
}