package com.example.networking;

public class Mountain {

    private String name;
    private int height;
    private String location;


    public String Mountain(String name, int height, String location) {
    this.name =name;
    this.height =height;
    this.location = location;


    public String getName() {
        return name;
        }

    public int getHeight() {
        return height;
        }
    public String getLocation() {
        return location;
        }

    }
}