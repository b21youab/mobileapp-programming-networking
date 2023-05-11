package com.example.networking;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    public List<Mountain> listOfMountains;




    public RecyclerViewAdapter(List<Mountain> listOfMountains) {
        this.listOfMountains= listOfMountains;

    }

    public void newMountains (List<Mountain> mountainList) {

        this.listOfMountains = mountainList;
    }


    @Override
    @NonNull
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Log.d("ViewHolder1", "View1");
            Log.d("ViewHolder2", String.valueOf(listOfMountains.size()) + " "+ String.valueOf(position));
        holder.title.setText(listOfMountains.get(position).getName());

    }




    @Override
    public int getItemCount() {

        return listOfMountains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mountainText;
       TextView title;
        ViewHolder(View itemView) {

            super(itemView);
        title = itemView.findViewById(R.id. mountainData);

        }



    }
    }

