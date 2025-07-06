package org.sewasathi.Repository;

import org.bson.types.ObjectId;
import org.sewasathi.Entity.Client;
import org.sewasathi.Entity.Job;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, ObjectId> {}
