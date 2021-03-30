package com.antimonitor.core.model;

import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Entity
@Table
public class Establishment {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public static String urlValidation(String [] validation) {
        if ((validation.length) > 5) {
            return "O usuário cadastrou mais que 5 imagens";
        }
        return "Tudo Ok";
    }

}