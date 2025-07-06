package org.sewasathi.Repository;

import org.bson.types.ObjectId;
import org.sewasathi.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {}
