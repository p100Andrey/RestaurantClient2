package ua.i.giggss.dao;

import ua.i.giggss.model.Worker;

import java.util.List;

public interface WorkerDao {
    public void addWorker(Worker worker);

    public void updateWorker(Worker worker);

    public void removeWorker(int id);

    public Worker getWorkerById(int id);

    public List<Worker> listWorkers();
}