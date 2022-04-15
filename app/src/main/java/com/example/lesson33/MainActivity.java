package com.example.lesson33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList <String> contacts = new ArrayList<>();
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        contacts.add("+9111111111");
        contacts.add("+9222222222");
        contacts.add("+9333333333");
        contacts.add("+9444444444");
        contacts.add("+9555555555");
        contacts.add("+9666666666");
        contacts.add("+9777777777");
        contacts.add("+9888888888");
        contacts.add("+9999999999");
        contacts.add("+9999999999");
        contacts.add("+9999999999");
        ContactAdapter adapter = new ContactAdapter(contacts);
        recyclerView.setAdapter(adapter);


    }
}