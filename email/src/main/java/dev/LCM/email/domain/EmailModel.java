package dev.LCM.email.domain;

import dev.LCM.email.enums.EmailStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_email")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailModel {

    private final long serialVersionUid = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private UUID userId;
    private String emailFrom;
    private String emailTo;
    private String emailSubject;
    @Column (columnDefinition = "body")
    private String body;
    private LocalDateTime sendDateEmail;
    private EmailStatus statusEmail;
}
