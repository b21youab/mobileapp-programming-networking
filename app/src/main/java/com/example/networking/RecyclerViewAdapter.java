package com.example.networking;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    public TextView mountainInfo;
    public List<Mountain> listOfMountains;
    private LayoutInflater layoutInflater;




    public RecyclerViewAdapter(List<Mountain> listOfMountains) {
        this.listOfMountains= listOfMountains;

    }

    public void newMountains (List<Mountain> mountainList) {
        this.listOfMountains = mountainList;
    }


    public TextView mountainText;



    @Override
    @NonNull
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Log.d("ViewHolder1", "View1");
            Log.d("ViewHolder2", "View2");
        holder.title.setText(listOfMountains.get(position).getName());
    }




    @Override
    public int getItemCount() {

        return listOfMountains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       private TextView mountainData;
       TextView title;

        ViewHolder(View itemView) {
            super(itemView);
        title = itemView.findViewById(R.id. mountainData);
            mountainData = itemView.findViewById(R.id.mountainData);
        }





        }






    }

