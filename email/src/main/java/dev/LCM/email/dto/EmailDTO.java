package dev.LCM.email.dto;


import org.hibernate.validator.constraints.UUID;

public record EmailDTO(
        UUID userId,
        String emailTo,
        String emailSubject,
        String body
) {

}
