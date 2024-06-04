package com.example.worldcup2024teams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TeamsActivity extends AppCompatActivity {

    ListView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);
        String[]array={
                "Pakistan",
                "India",
                "West Indies",
                "Australia",
                "England",
                "South Africa",
                "New Zealand",
                "Usa",
                "Afghanistan",
                "Ireland",
                "Uganda",
                "Oman",
                "Canada",
                "Namibia",
                "Papua New Guinea",
                "Nepal",
                "Sri Lanka",
                "Netherlands",
                "Scotland",
                "Bangladesh"
        };
        view=findViewById(R.id.list_item);
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,array);
        view.setAdapter(adapter);



    }
}