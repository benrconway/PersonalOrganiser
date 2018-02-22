package com.example.ben.todomore.ToDo.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ben.todomore.R;

public class MainActivity extends AppCompatActivity {

    Button todoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoList = (Button) findViewById(R.id.todoListButton);

    }

    public void onToDoListButtonClicked(View button){
        Intent intent = new Intent(this, ToDoListActivity.class);
        startActivity(intent);
    }

}
