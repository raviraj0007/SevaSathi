package org.sewasathi.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.sewasathi.Enum.AccountType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    private String id;

    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private AccountType accountType;
}
