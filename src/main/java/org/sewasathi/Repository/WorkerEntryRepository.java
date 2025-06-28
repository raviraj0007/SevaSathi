package org.sewasathi.Repository;

import org.bson.types.ObjectId;
import org.sewasathi.Entity.WorkerEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkerEntryRepository extends MongoRepository<WorkerEntry , ObjectId> {
}
