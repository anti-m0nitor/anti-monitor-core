package com.antimonitor.core.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        return LocalDateTime.parse(dateTimePattern(LocalDateTime.now()));
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }



    public static String dateTimePattern(LocalDateTime received) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
        String inThePattern = formatter.format(received);

        return inThePattern;
    }
}
