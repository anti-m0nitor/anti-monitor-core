package com.antimonitor.core.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.time.LocalTime;
import java.util.Arrays;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class EstablishmentRequestDTO {

    private String id;
    private String name;
    private String description;
    private Type type;
    private boolean opened;
    private LocalTime defaultOpenTime;
    private LocalTime defaultCloseTime;
    private boolean automaticOpen;
    private boolean automaticClose;
    private String[] image_urls;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public LocalTime getDefaultOpenTime() {
        return defaultOpenTime;
    }

    public void setDefaultOpenTime(LocalTime defaultOpenTime) {
        this.defaultOpenTime = defaultOpenTime;
    }

    public LocalTime getDefaultCloseTime() {
        return defaultCloseTime;
    }

    public void setDefaultCloseTime(LocalTime defaultCloseTime) {
        this.defaultCloseTime = defaultCloseTime;
    }

    public boolean isAutomaticOpen() {
        return automaticOpen;
    }

    public void setAutomaticOpen(boolean automaticOpen) {
        this.automaticOpen = automaticOpen;
    }

    public boolean isAutomaticClose() {
        return automaticClose;
    }

    public void setAutomaticClose(boolean automaticClose) {
        this.automaticClose = automaticClose;
    }

    public String[] getImage_urls() {
        return image_urls;
    }

    public void setImage_urls(String[] image_urls) {
        this.image_urls = image_urls;
    }

    @Override
    public String toString() {
        return "Establishment{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", opened=" + opened +
                ", defaultOpenTime=" + defaultOpenTime +
                ", defaultCloseTime=" + defaultCloseTime +
                ", automaticOpen=" + automaticOpen +
                ", automaticClose=" + automaticClose +
                ", image_urls=" + Arrays.toString(image_urls) +
                '}';
    }
}
