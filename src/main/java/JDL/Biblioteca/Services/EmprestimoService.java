package JDL.Biblioteca.Services;

import org.springframework.stereotype.Service;
import java.util.List;
import JDL.Biblioteca.Repositories.EmprestimoInterface;
import JDL.Biblioteca.Models.Emprestimo;

@Service
public class EmprestimoService {
    private final EmprestimoInterface repository;

    public EmprestimoService(EmprestimoInterface repository) {
        this.repository = repository;
    }

    public List<Emprestimo> getAllEmprestimos() {
        return repository.findAll();
    }

    public Emprestimo getEmprestimoById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Emprestimo createEmprestimo(Emprestimo emprestimo) {
        if (validarEmprestimo(emprestimo)) {
            return repository.save(emprestimo);
        }

        return null;
    }

    public Emprestimo updateEmprestimo(Integer id, Emprestimo emprestimo) {
        if (repository.existsById(id)) {
            emprestimo.setIdEmprestimoPk(id);
            return repository.save(emprestimo);
        }
        return null;
    }

    public boolean deleteEmprestimo(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }

    public boolean validarEmprestimo(Emprestimo emprestimo) {
        return (emprestimo.getDataEmprestimo() != null && emprestimo.getDataDevolucao() != null);
    }
}