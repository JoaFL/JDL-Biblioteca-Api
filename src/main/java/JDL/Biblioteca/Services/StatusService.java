package JDL.Biblioteca.Services;

import org.springframework.stereotype.Service;
import java.util.List;
import JDL.Biblioteca.Repositories.StatusRepository;
import JDL.Biblioteca.Models.Status;

@Service
public class StatusService {
    private final StatusRepository statusRepository;

    public StatusService(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    public List<Status> getAllStatuses() {
        return statusRepository.findAll();
    }

    public Status getStatusById(Long id) {
        return statusRepository.findById(id).orElse(null);
    }
    
    public Status createStatus(Status status) {
        return statusRepository.save(status);
    }

    public Status updateStatus(Long id, Status statusDetails) {
        Status status = statusRepository.findById(id).orElse(null);
        if (status != null) {
            status.setName(statusDetails.getName());
            return statusRepository.save(status);
        }
        return null;
    }

    public void deleteStatus(Long id) {
        statusRepository.deleteById(id);
    }
}