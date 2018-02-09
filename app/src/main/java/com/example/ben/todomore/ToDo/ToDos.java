package com.example.ben.todomore.ToDo;

import java.util.ArrayList;

/**
 * Created by ben on 09/02/18.
 */

public class ToDos {

    private ArrayList<ToDoItem> goals;

    public ToDos(){}

    public ArrayList<ToDoItem> getGoals() {
        return goals;
    }

    public void setGoal(ToDoItem toBeAdded){
        this.goals.add(toBeAdded);
    }

}
