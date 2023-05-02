package com.example.networking;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;



public class Mountain {
    @SerializedName("ID")
    private String id;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    @SerializedName("size")
    private int meters;
    @SerializedName("cost")
    private int feet;
    private Auxdata auxdata;

}



