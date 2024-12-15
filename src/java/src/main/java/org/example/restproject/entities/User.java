package org.example.restproject.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table
@Data
public class User {

    @Id
    private long id;
    private String username;
    private String password;
    private String email;
    private String role;
    @Column("isBanned")
    private boolean isBanned;
}
