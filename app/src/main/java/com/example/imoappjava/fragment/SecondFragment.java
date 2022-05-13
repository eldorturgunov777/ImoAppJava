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
import com.example.imoappjava.adapter.ContactAdapter;
import com.example.imoappjava.adapter.MyAdapter;
import com.example.imoappjava.model.ListContacts;
import com.example.imoappjava.model.ListData;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {
    private RecyclerView recyclerView;
    private final List<ListContacts> contacts = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recyclerView2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(SecondFragment.this.getActivity()));
        ContactAdapter adapter = new ContactAdapter(SecondFragment.this.getActivity(), contacts);
        recyclerView.setAdapter(adapter);
        contacts.add(new ListContacts(R.drawable.img1, "Mason Mount"));
        contacts.add(new ListContacts(R.drawable.img2, "Eldor Turgunov"));
        contacts.add(new ListContacts(R.drawable.img3, "Hamdam Sobirov"));
        contacts.add(new ListContacts(R.drawable.img4, "Chelsea FC"));
        contacts.add(new ListContacts(R.drawable.img5, "Adama Traore"));
        contacts.add(new ListContacts(R.drawable.img2, "Eldor Turgunov"));
        contacts.add(new ListContacts(R.drawable.img3, "Hamdam Sobirov"));
        contacts.add(new ListContacts(R.drawable.img1, "Mason Mount"));
        contacts.add(new ListContacts(R.drawable.img5, "Adama Traore"));
        contacts.add(new ListContacts(R.drawable.img4, "Chelsea FC"));
        contacts.add(new ListContacts(R.drawable.img2, "Eldor Turgunov"));
        contacts.add(new ListContacts(R.drawable.img5, "Adama Traore"));

    }
}