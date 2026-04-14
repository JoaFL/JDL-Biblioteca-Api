package JDL.Biblioteca.Services;

import org.springframework.stereotype.Service;
import java.util.List;
import JDL.Biblioteca.Repositories.StatusInterface;
import JDL.Biblioteca.Models.Status;

@Service
public class StatusService {
    private final StatusInterface statusInterface;

    public StatusService(StatusInterface statusInterface) {
        this.statusInterface = statusInterface;
    }

    public List<Status> getAllStatuses() {
        return statusInterface.findAll();
    }

    public Status getStatusById(Integer id) {
        return statusInterface.findById(id).orElse(null);
    }
    
    public Status createStatus(Status status) {
        return statusInterface.save(status);
    }

    public Status updateStatus(Integer id, Status statusDetails) {
        Status status = statusInterface.findById(id).orElse(null);
        if (status != null) {
            status.setDsStatus(statusDetails.getDsStatus());
            return statusInterface.save(status);
        }
        return null;
    }

    public void deleteStatus(Integer id) {
        statusInterface.deleteById(id);
    }
}