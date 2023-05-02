package com.example.networking;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter>.ViewHolder {

        public class ViewHolder extends RecyclerView.ViewHolder implements view.OnClickListener {

            TextView title;
            ViewHolder(View itemView) {
                super(itemView);
                itemView.setOnClickListener(this);
                title = itemView.findViewById(R.id.title);
            }
        }
          @Override
        public void onClick (View view) {
            onClickListener.onClick(items.getgetAdapterPosition)));
          }
        }

    public interface OnClickListener {
            void OnClick(RecyclerViewItem item);

}


