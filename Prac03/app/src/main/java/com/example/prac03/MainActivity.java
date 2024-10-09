package com.example.prac03;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.prac03.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //du lieu
        List<Country> list = new ArrayList<>();
        list.add(new Country("Japan", R.drawable.japan,"Tokyo"));
        list.add(new Country("United Kingdom",R.drawable.uk, "London"));
        list.add(new Country("Ukraine", R.drawable.ukraine, "Ukraine"));

        //set layout
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        //set adapter
        CustomAdapter adapter = new CustomAdapter(list);
        binding.recCountry.setAdapter(adapter);
        binding.recCountry.setLayoutManager(new LinearLayoutManager(this));

        setContentView(binding.getRoot());
    }
}
