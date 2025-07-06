package org.sewasathi.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "job_requests")
public class JobApplication {
    @Id
    private String id;

    @DBRef
    private User worker;

    @DBRef
    private Job job;

    private String status;
}
