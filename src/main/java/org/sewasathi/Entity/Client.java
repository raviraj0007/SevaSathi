package org.sewasathi.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "clients")
public class Client {
    @Id
    private String id;

    private String name;
    private String phone;
    private String email;
}
