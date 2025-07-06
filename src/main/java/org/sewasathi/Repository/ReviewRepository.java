package org.sewasathi.Repository;

import org.bson.types.ObjectId;
import org.sewasathi.Entity.Review;
import org.sewasathi.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {}
