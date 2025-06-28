package org.sewasathi.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor

@Document(collection = "worker_entries")
public class WorkerEntry {

    @Id
    private ObjectId id;
    private String name;
    private String email;
//    private String phoneNumber;
//    private String address;
//    private String skills;
//    private String experience;
//    private String availability;
//
//





}
