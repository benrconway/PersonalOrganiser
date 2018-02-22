package com.example.ben.todomore.ToDo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ben.todomore.R;

public class ToDoListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);
    }
}
// Create an adapter for the listview, then use the todolist item xml to create
// individual instances of the todolist items. Then test to see that they populate like
 // the forage adapter.