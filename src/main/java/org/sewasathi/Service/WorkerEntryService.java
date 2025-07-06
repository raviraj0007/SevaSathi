package org.sewasathi.Service;

import org.sewasathi.Entity.Worker;
import org.sewasathi.Repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WorkerEntryService {

    @Autowired
    private WorkerRepository workerRepository;

    public void saveWorker(Worker worker) {
        workerRepository.save(worker);
    }


}
