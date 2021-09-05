package com.example.room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Adapter extends AppCompatActivity {

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        recyclerView = findViewById(R.id.recycleView);

        ArrayList<Room> room = new ArrayList<>();
        room.add(new Room( R.drawable.ah_yes_fix1, "Saleh Apartement", "$ 20000", "An Apartement with the best view"));
        room.add(new Room( R.drawable.ah_yes_fix1 ,"Saleh Apartement", "$ 20000", "An Apartement with the best view"));
        room.add(new Room( R.drawable.ah_yes_fix1 ,"Saleh Apartement", "$ 20000", "An Apartement with the best view"));

        roomViewAdapter adapter = new roomViewAdapter(this);
        adapter.setRoom(room);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}