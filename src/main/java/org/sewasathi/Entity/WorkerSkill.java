package org.sewasathi.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "worker_skills")
public class WorkerSkill {
    @Id
    private String id;

    private String skillName;

    private String proficeincyLevel; // e.g., Beginner, Intermediate, Expert

    @DBRef
    private Worker worker;
}
