package com.example.ben.todomore.ToDo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ben.todomore.R;
import com.example.ben.todomore.ToDo.ToDoItem;

import java.util.ArrayList;

public class ToDoListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);

            //SQL runner to collect list of primary to do items.
//            ArrayList<ToDoItem> toDoItemArrayList = ;

//            ToDoListAdapter adapter = new ToDoListAdapter(this, toDoItemArrayList);


        }




    }
}
// The to do list needs to come from the SQLite database of primary objectives.
// It will allow a clickable item which will trigger  secondary search for items with a foreign key
// of the primary objectives and populate a larger list.

// In the end I want expandable lists of those goals and to have them all interactable on the first
// and only page, because less work is best work.