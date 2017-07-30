package ua.i.giggss.service;

import ua.i.giggss.model.Worker;

import java.util.List;

public interface WorkerService {
    public void addWorker(Worker worker);

    public void updateWorker(Worker worker);

    public void removeWorker(int id);

    public Worker getWorkerById(int id);

    public List<Worker> listWorkers();
}
