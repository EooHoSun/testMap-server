package com.example.hakgoongido.highSchoolInfo.dto;

import lombok.Data;

public class HighSchoolInfoDTO {
    Long id;
    String name;
    float lat;
    float lon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public HighSchoolInfoDTO(Long id, String name, float lat, float lon) {
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }
}
