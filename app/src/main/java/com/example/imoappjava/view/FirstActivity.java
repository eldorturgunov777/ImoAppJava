package com.example.imoappjava.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.imoappjava.model.ListData;
import com.example.imoappjava.R;
import com.example.imoappjava.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private final List<ListData> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        initViews();
        list();
    }

    public void initViews() {
        MyAdapter adapter = new MyAdapter(this, list);
        recyclerView.setAdapter(adapter);

    }

    public void list() {
        list.add(new ListData(R.drawable.img1, "Mason Mount", "Hi, do you speak English", 8));
        list.add(new ListData(R.drawable.img2, "Eldor Turgunov", "", 0));
        list.add(new ListData(R.drawable.img3, "Hamdam Sobirov", "Hi, do you speak English", 1));
        list.add(new ListData(R.drawable.img4, "Chelsea FC", "Happy", 1));
        list.add(new ListData(R.drawable.img5, "Adama Traore", "Play Futboll", 7));
        list.add(new ListData(R.drawable.img1, "Mason Mount", "Hi, do you speak English", 8));
        list.add(new ListData(R.drawable.img2, "Eldor Turgunov", "", 0));
        list.add(new ListData(R.drawable.img3, "Hamdam Sobirov", "Hi, do you speak English", 1));
        list.add(new ListData(R.drawable.img4, "Chelsea FC", "Happy", 1));
        list.add(new ListData(R.drawable.img5, "Adama Traore", "Play Futboll", 7));
        list.add(new ListData(R.drawable.img1, "Mason Mount", "Hi, do you speak English", 8));
        list.add(new ListData(R.drawable.img2, "Eldor Turgunov", "", 0));
        list.add(new ListData(R.drawable.img3, "Hamdam Sobirov", "Hi, do you speak English", 1));
        list.add(new ListData(R.drawable.img4, "Chelsea FC", "Happy", 1));
        list.add(new ListData(R.drawable.img5, "Adama Traore", "Play Futboll", 7));
        list.add(new ListData(R.drawable.img1, "Mason Mount", "Hi, do you speak English", 8));
        list.add(new ListData(R.drawable.img2, "Eldor Turgunov", "", 0));
        list.add(new ListData(R.drawable.img3, "Hamdam Sobirov", "Hi, do you speak English", 1));
        list.add(new ListData(R.drawable.img4, "Chelsea FC", "Happy", 1));
        list.add(new ListData(R.drawable.img5, "Adama Traore", "Play Futboll", 7));

    }
}