package org.sewasathi.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "services")
public class WorkService {
    @Id
    private String id;

    private String serviceName;
    private String description;
    private double price;

    @DBRef
    private Worker worker;
}
