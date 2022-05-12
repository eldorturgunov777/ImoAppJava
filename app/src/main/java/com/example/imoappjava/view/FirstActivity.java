package com.example.imoappjava.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.imoappjava.adapter.VPAdapter;
import com.example.imoappjava.fragment.FirstFragment;
import com.example.imoappjava.model.ListData;
import com.example.imoappjava.R;
import com.example.imoappjava.adapter.MyAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {
    //    private RecyclerView recyclerView;
//    private final List<ListData> list = new ArrayList<>();
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.viewPager);
        tabLayout.setupWithViewPager(viewPager);
        VPAdapter adapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFragment(new FirstFragment(), "Chats");
        adapter.addFragment(new FirstFragment(), "Calls");
        viewPager.setAdapter(adapter);

    }
}
//        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        initViews();
//        list();
//
//    }
//
//    public void initViews() {
//        MyAdapter adapter = new MyAdapter(this, list);
//        recyclerView.setAdapter(adapter);
//
//    }
//
//    public void list() {
//        list.add(new ListData(R.drawable.img1, "Mason Mount", "Hi, do you speak English", 8));
//        list.add(new ListData(R.drawable.img2, "Eldor Turgunov", "", 0));
//        list.add(new ListData(R.drawable.img3, "Hamdam Sobirov", "Hi, do you speak English", 1));
//        list.add(new ListData(R.drawable.img4, "Chelsea FC", "Happy", 1));
//        list.add(new ListData(R.drawable.img5, "Adama Traore", "Play Futboll", 7));
//        list.add(new ListData(R.drawable.img1, "Mason Mount", "Hi, do you speak English", 8));
//        list.add(new ListData(R.drawable.img2, "Eldor Turgunov", "", 0));
//        list.add(new ListData(R.drawable.img3, "Hamdam Sobirov", "Hi, do you speak English", 1));
//        list.add(new ListData(R.drawable.img4, "Chelsea FC", "Happy", 1));
//        list.add(new ListData(R.drawable.img5, "Adama Traore", "Play Futboll", 7));
//        list.add(new ListData(R.drawable.img1, "Mason Mount", "Hi, do you speak English", 8));
//        list.add(new ListData(R.drawable.img2, "Eldor Turgunov", "", 0));
//        list.add(new ListData(R.drawable.img3, "Hamdam Sobirov", "Hi, do you speak English", 1));
//        list.add(new ListData(R.drawable.img4, "Chelsea FC", "Happy", 1));
//        list.add(new ListData(R.drawable.img5, "Adama Traore", "Play Futboll", 7));
//        list.add(new ListData(R.drawable.img1, "Mason Mount", "Hi, do you speak English", 8));
//        list.add(new ListData(R.drawable.img2, "Eldor Turgunov", "", 0));
//        list.add(new ListData(R.drawable.img3, "Hamdam Sobirov", "Hi, do you speak English", 1));
//        list.add(new ListData(R.drawable.img4, "Chelsea FC", "Happy", 1));
//        list.add(new ListData(R.drawable.img5, "Adama Traore", "Play Futboll", 7));
//
//    }
//}