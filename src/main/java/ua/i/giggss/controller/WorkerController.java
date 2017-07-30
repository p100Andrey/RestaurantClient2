package ua.i.giggss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.i.giggss.model.Worker;
import ua.i.giggss.service.WorkerService;

@Controller
public class WorkerController {

    private WorkerService workerService;

    @Autowired(required = true)
    @Qualifier(value = "workerService")
    public void setWorkerService(WorkerService workerService) {
        this.workerService = workerService;
    }

    // формерую полный список книг
    @RequestMapping(value = "workers", method = RequestMethod.GET)
    public String listWorkers(Model model) {
        model.addAttribute("worker", new Worker());
        model.addAttribute("listWorkers", this.workerService.listWorkers());

        return "workers";
    }
}