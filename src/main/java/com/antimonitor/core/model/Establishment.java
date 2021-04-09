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

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "image_urls", nullable = false)
    private String[] image_urls;


    private String message;



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


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String[] getImage_urls() {
        return image_urls;
    }

    public void setImage_urls(String[] image_urls) {
        this.image_urls = image_urls;
    }

    public String getMessage() {
        return urlValidation(getImage_urls());
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String urlValidation(String [] validation) {
        if ((validation.length) > 5) {
            return "O usuário cadastrou mais que 5 imagens";
        }
        return "Tudo Ok";
    }



}