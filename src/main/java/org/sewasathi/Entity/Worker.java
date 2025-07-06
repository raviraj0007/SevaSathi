package org.sewasathi.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "workers")
public class Worker {
    @Id
    private String id;

    private String email;
    private String name;
    private String phone;
    private String address;
}
