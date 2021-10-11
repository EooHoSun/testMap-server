package com.example.hakgoongido.highSchoolInfo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class HighSchoolSearchBody {
    private float startX;
    private float endX;
    private float startY;
    private float endY;
    private int zoomLevel;

    @Override
    public String toString() {
        return "HighSchoolSearchBody{" +
                "startX=" + startX +
                ", endX=" + endX +
                ", startY=" + startY +
                ", endY=" + endY +
                ", zoomLevel=" + zoomLevel +
                '}';
    }

    public float getStartX() {
        return startX;
    }

    public void setStartX(float startX) {
        this.startX = startX;
    }

    public float getEndX() {
        return endX;
    }

    public void setEndX(float endX) {
        this.endX = endX;
    }

    public float getStartY() {
        return startY;
    }

    public void setStartY(float startY) {
        this.startY = startY;
    }

    public float getEndY() {
        return endY;
    }

    public void setEndY(float endY) {
        this.endY = endY;
    }

    public int getZoomLevel() {
        return zoomLevel;
    }

    public void setZoomLevel(int zoomLevel) {
        this.zoomLevel = zoomLevel;
    }

    public HighSchoolSearchBody(float startX, float endX, float startY, float endY, int zoomLevel) {

        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.zoomLevel = zoomLevel;
    }
}
