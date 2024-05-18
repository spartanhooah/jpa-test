package net.frey.jpatest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "userz")
public class Userz {
    @Id
    private UUID id;

    @CreatedDate
    private LocalDateTime creationTimestamp;

    private String username;
    private String email;
    private String hashedPassword;
    private URL avatar;
    private String displayName;
    private boolean active;
}
