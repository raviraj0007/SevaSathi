package org.sewasathi.Repository;

import org.bson.types.ObjectId;
import org.sewasathi.Entity.Job;
import org.sewasathi.Entity.JobApplication;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobApplicationRepository extends MongoRepository<JobApplication, ObjectId> {}
