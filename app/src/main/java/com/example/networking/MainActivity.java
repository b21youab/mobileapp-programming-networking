package com.example.networking;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener  {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private final String JSON_FILE = "mountains.json";
    private RecyclerView views;
    ArrayList<Mountain> listOfMountains;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listOfMountains = new ArrayList<Mountain>();

    /*    ArrayList<RecyclerViewItem> items = new ArrayList<>(Arrays.asList(
                new RecyclerViewItem("Matterhorn"),
                new RecyclerViewItem("Mont Blanc"),
                new RecyclerViewItem("Denali")
        ));
        */



        RecyclerView view = findViewById(R.id.recycler_view);
        adapter = new RecyclerViewAdapter(listOfMountains);
        view.setLayoutManager(new LinearLayoutManager(this));

     //   new JsonFile(this, this).execute(JSON_FILE);
        new JsonTask(this).execute(JSON_URL);
        views = findViewById(R.id.recycler_view);
        listOfMountains =new ArrayList<>();
        views.setAdapter(adapter);

        views.setLayoutManager(new LinearLayoutManager(this));




    }
    @SuppressLint("NotifyDataSetChanged")
    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity==>", json);

        Gson gson = new Gson();
        Type type = new TypeToken<List<Mountain>>() {}.getType();
        ArrayList<Mountain> data = gson.fromJson(json, type);
        listOfMountains.addAll(data);
        Log.d("Youssuf", String.valueOf(listOfMountains.size()));
        adapter.newMountains(listOfMountains);
        adapter.notifyDataSetChanged();

    }

    @Override
    public void onItemClick(int position) {


    }


}