package com.example.networking;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Mountain {
    int size;
    private  String name;
    private String ID;
    private String location;
    private String type;
    //@SerializedName("size")
    private int height;

    public Mountain(String name, String location, int height) {
        this.name = name;
        //    this.location = location;
        //   this.ID = ID;
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

        return ID;
    }
    public String getType() {

        return type;
    }


    public void setName() {

        this.name= name;
    }

    public void setLocation() {
        this.location =location;
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








