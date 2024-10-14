package com.example.ex05;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter> {
    private List<Country> countries;

    public CountryAdapter(List<Country> countries){
        this.countries = countries;
    }

    @NonNull
    @Override
    public CountryAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_country, parent, false);
        return new CountryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryAdapter holder, int position) {
        Country currentItem = countries.get(position);
        holder.imageView.setImageResource(currentItem.getImageResId());
        holder.textView.setText(currentItem.getName());
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    static class CountryViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        CountryViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
