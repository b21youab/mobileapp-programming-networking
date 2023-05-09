package com.example.networking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

@SuppressWarnings("WeakerAccess")
public class RecyclerViewItem {

    private String title;
    private String name;

    public RecyclerViewItem(String title) {

        this.title = title;
    }

    public String getTitle() {

        return title;
    }


    public String getName() {

        return name;
    }
}