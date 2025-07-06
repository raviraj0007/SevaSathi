package org.sewasathi.Repository;

import org.bson.types.ObjectId;
import org.sewasathi.Entity.Job;
import org.sewasathi.Entity.WorkerSkill;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkerSkillRepository extends MongoRepository<WorkerSkill, ObjectId> {}
