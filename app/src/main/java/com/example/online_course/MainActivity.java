package com.example.online_course;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCources;
    public RecyclerView recyclerViewCources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView(){
        ArrayList<CourseDomain> ItemsArraylist = new ArrayList<>();

        ItemsArraylist.add(new CourseDomain("Quick Learn C# Language", "Jammie young", 128, 4.6, "pic1"));
        ItemsArraylist.add(new CourseDomain("Full Course android Kotlin", "Alex Alba", 580, 4.0, "pic2"));
        ItemsArraylist.add(new CourseDomain("Quick Learn java Language", "Sara Anderson", 1280, 4.7, "pic1"));

        recyclerViewCources=findViewById(R.id.view);
        recyclerViewCources.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapterCources = new CourseAdapter(ItemsArraylist);
        recyclerViewCources.setAdapter(adapterCources);
    }
}