package org.m2i.tp5_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView goalList;

    List<String> goals = new ArrayList();
    String[] goals_txt = new String[]{
    "Learn Java OOP", "Learn Android", "Learn IOS",
            "Learn Ionic", "Learn DevOps", "Learn Docker", "Learn Kubernetes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(String g : goals_txt){
            goals.add(g);
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        goalList = findViewById(R.id.goals_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        goalList.setLayoutManager(linearLayoutManager);
        GoalsRecyclerView rc = new GoalsRecyclerView(goals);
        goalList.setAdapter(rc);
    }
}