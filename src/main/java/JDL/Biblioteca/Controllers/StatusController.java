package JDL.Biblioteca.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import JDL.Biblioteca.Models.Status;
import JDL.Biblioteca.Services.StatusService;
import java.util.List;

@RestController
@RequestMapping("/status") 
public class StatusController {
    private final StatusService statusService;

    @Autowired
    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping("/get")
    public List<Status> getAllStatuses() {
        return statusService.getAllStatuses();
    }

    @GetMapping("/get/{id}")
    public Status getStatusById(@PathVariable Long id) {
        return statusService.getStatusById(id);
    }

    @PostMapping("/post")
    public Status createStatus(@RequestBody Status status) {
        return statusService.createStatus(status);
    }

    @PutMapping("/put/{id}")
    public Status updateStatus(@PathVariable Long id, @RequestBody Status status) {
        return statusService.updateStatus(id, status);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStatus(@PathVariable Long id) {
        statusService.deleteStatus(id);
    }
}