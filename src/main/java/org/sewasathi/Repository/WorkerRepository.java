package org.sewasathi.Repository;

import org.bson.types.ObjectId;
import org.sewasathi.Entity.Worker;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkerRepository extends MongoRepository<Worker, ObjectId> {
}
