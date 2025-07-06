package org.sewasathi.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.sewasathi.Enum.JobStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;


@Data
@NoArgsConstructor
@Document(collection = "jobs")
public class Job {
    @Id
    private String id;

    private String title;
    private String description;
    private String location;
    private Date date;
    private String jobType; // e.g., Full-time, Part-time, Contract
    private JobStatus status;

}
