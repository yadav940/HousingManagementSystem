package com.example.mapdemo.data;


public class Data{
    private double latitude;
    private double longitude;
    private String title;

    public Data(double latitude, double longitude, String title) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.title=title;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getTitle() {
        return title;
    }
}
