package org.sewasathi.Repository;

import org.bson.types.ObjectId;
import org.sewasathi.Entity.WorkService;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkerServiceRepository extends MongoRepository<WorkService, ObjectId> {}
