package com.example.ben.todomore.ToDo.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ben.todomore.R;
import com.example.ben.todomore.ToDo.ToDoItem;

import java.util.ArrayList;

/**
 * Created by ben on 26/02/18.
 */

public class ToDoListAdapter extends ArrayAdapter<ToDoItem> {

    public ToDoListAdapter(Context context, ArrayList<ToDoItem> toDoItemArrayList) {
        super(context, 0, toDoItemArrayList);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.to_do_list_item, parent, false);
        }

        ToDoItem currentItem = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.to_do_title);
        title.setText(currentItem.getPrimary().getTitle());

//        TextView year = (TextView) listItemView.findViewById(R.id.to_do_timeLeft);
//        year.setText(currentItem.getPrimary().getTimeToCompletion());

        listItemView.setTag(currentItem);

        return listItemView;
    }


}
