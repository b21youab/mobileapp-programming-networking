package com.example.networking;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Mountain {
    private String name;
    private String ID;
    private String location;
    private String type;
    // Using @SerializedName to change name from attribute "size" in json to "height" in code.
    @SerializedName("size")
    private int height;

    public Mountain(String name, String location, int height) {
        this.name = name;
        this.location = location;
        this.height = height;
        this.ID = ID;
        this.type = type;
    }


    public Mountain() {
        name = "MISSING";
        location = "MISSING";
        height = -1;
    }

    public String getName() {

        return name;
    }
    public String getLocation() {

        return location;
    }

    public int getHeight() {

        return height;
    }
    public String getID() {

        return this.ID;
    }
    public String getType() {

        return this.type;
    }




    @NonNull
    @Override
    public String toString() {

    return name;
    }

    public String info() {
        String s = name
                + " is located in " + location
                + " and has a height of " + height + " m above sea level.";

        return s;
    }
}








