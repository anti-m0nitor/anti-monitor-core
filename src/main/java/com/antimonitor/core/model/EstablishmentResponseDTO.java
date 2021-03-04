package com.antimonitor.core.model;

import java.time.LocalDateTime;

public class EstablishmentResponseDTO {

    private String message;
    private LocalDateTime date;

    public EstablishmentResponseDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDate() {
        return LocalDateTime.now();
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
