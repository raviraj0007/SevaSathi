package org.sewasathi.Repository;

import org.bson.types.ObjectId;
import org.sewasathi.Entity.Job;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<Job, ObjectId> {}
