package net.frey.jpatest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "userz_token")
public class UserzToken {
    @Id
    private UUID userId;

    @CreatedDate
    private LocalDateTime creationTimestamp;

    private String authToken;
    private LocalDateTime expiryTimestamp;
}
