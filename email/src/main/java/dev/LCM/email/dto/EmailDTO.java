package dev.LCM.email.dto;


import org.hibernate.validator.constraints.UUID;

public record EmailDTO(
        UUID id,
        String subject,
        String body
) {

}
