package org.sewasathi.Service;

import org.sewasathi.Entity.WorkerEntry;
import org.sewasathi.Repository.WorkerEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WorkerEntryService {

    @Autowired
    private WorkerEntryRepository workerRepository;

    public void saveWorker(WorkerEntry worker) {
        workerRepository.save(worker);
    }


}
