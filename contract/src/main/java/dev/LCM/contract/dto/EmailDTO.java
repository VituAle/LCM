package dev.LCM.contract.dto;

import org.hibernate.validator.constraints.UUID;

public class EmailDTO {
    private UUID userId;
    private String emailTo;
    private String emailSubject;
    private String body;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setUserId(java.util.UUID id) {
    }
}




