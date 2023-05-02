package com.example.networking;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


 public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

     private RecyclerView.Adapter adapter;
     private Mountain[] mountains;

     public static String convertStreamToString(InputStream is) throws Exception {


         BufferedReader reader = new BufferedReader(new InputStreamReader(is));
         StringBuilder builder = new StringBuilder();
         String line = null;

         while ((line = reader.readLine()) != null) {
             builder.append(line).append("\n");
         }

         reader.close();

         return builder.toString();
     }


     ArrayList<String> Mountain = new ArrayList<String>();

     private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
     private final String JSON_FILE = "mountains.json";

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         new JsonTask(this).execute("https://mobprog.webug.se/json-api?login=brom");


         new JsonFile(this, this).execute("mountains.json");

         try {
             InputStream is = getApplicationContext().getAssets().open("mountains.json");
             String s = convertStreamToString(is);
             Log.d("MainActivity==> ", "The following text was found in textfile: \n\n" + s);

             Gson gson = new Gson();
             Type type = new TypeToken<ArrayList<Mountain>>() {
             }.getType();
             mountains = gson.fromJson(s, Mountain[].class);
             for (int i = 0; i < mountains.length; i++) {
                 Log.d("MainActivity", "Hittat ett berg" + i);
             }
         } catch (Exception e) {
             Log.e("MainActivity==>", "Something went wrong when reading textfile: \n\n" + e.getMessage());

         }
         // }


     }






    @Override
    public void onPostExecute(void result) {


    }
        }

