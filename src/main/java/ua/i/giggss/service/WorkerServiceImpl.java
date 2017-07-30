package ua.i.giggss.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.i.giggss.dao.WorkerDao;
import ua.i.giggss.model.Worker;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
    private WorkerDao workerDao;

    public void setWorkerDao(WorkerDao workerDao) {
        this.workerDao = workerDao;
    }

    @Override
    @Transactional
    public void addWorker(Worker worker) {
        this.workerDao.addWorker(worker);
    }

    @Override
    @Transactional
    public void updateWorker(Worker worker) {
        this.workerDao.updateWorker(worker);
    }

    @Override
    @Transactional
    public void removeWorker(int id) {
        this.workerDao.removeWorker(id);
    }

    @Override
    @Transactional
    public Worker getWorkerById(int id) {
        return this.workerDao.getWorkerById(id);
    }

    @Override
    @Transactional
    public List<Worker> listWorkers() {
        return this.workerDao.listWorkers();
    }
}
