package com.example.imoappjava.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.imoappjava.R;
import com.example.imoappjava.adapter.MyAdapter;
import com.example.imoappjava.model.ListData;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {
    private RecyclerView recyclerView;
    private final List<ListData> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(FirstFragment.this.getActivity()));
        MyAdapter adapter = new MyAdapter(FirstFragment.this.getActivity(),list);
        recyclerView.setAdapter(adapter);
        list.add(new ListData(R.drawable.img1, "Mason Mount", "Hi, do you speak English", 8));
        list.add(new ListData(R.drawable.img2, "Eldor Turgunov", "", 0));
        list.add(new ListData(R.drawable.img3, "Hamdam Sobirov", "Hi, do you speak English", 1));
        list.add(new ListData(R.drawable.img4, "Chelsea FC", "Happy", 1));
        list.add(new ListData(R.drawable.img5, "Adama Traore", "Play Futboll", 12));
        list.add(new ListData(R.drawable.img1, "Mason Mount", "Hi, do you speak English", 15));
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