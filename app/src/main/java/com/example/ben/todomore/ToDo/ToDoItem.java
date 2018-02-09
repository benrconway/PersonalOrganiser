package com.example.ben.todomore.ToDo;

import java.util.ArrayList;

/**
 * Created by ben on 09/02/18.
 */

public class ToDoItem {

    private Completeable primary;
    private ArrayList<Completeable> secondary;

    public ToDoItem(){}

    public void setPrimary(Completeable toBeSet) {
        this.primary = toBeSet;
    }

    public Completeable getPrimary(){
        return primary;
    }

    public ArrayList<Completeable> getSecondary(){
        return secondary;
    }

    public void setSecondary(Completeable toBeSet){
        this.secondary.add(toBeSet);
    }


}
