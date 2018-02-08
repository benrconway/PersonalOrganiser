package com.example.ben.todomore;

import java.util.Date;

/**
 * Created by ben on 07/02/18.
 */

public class Objective {

    private String title;
    private String description;
    private boolean completed;
    private int rating;
    //private Date completionDate;
    private boolean important;
    private boolean urgent;
    private String notes;
    // private Date dateToday;

    // Early explorations, refactor guaranteed.

    public Objective(){
        this.completed = false;
        this.important = false;
        this.urgent = false;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void toggleCompleted() {
        if(isCompleted()){
            this.completed = false;
        } else {
            this.completed = true;
        }
    }

    public int getRating() {
        return rating;
    }

    public void setRating() {

        //  Quadrant of necessity (manage)
        if(isImportant() && isUrgent()){
            this.rating = 1;
            return;
        }

        // Quadrant of quality and personal leadership (focus)
        if(isImportant()){
            this.rating = 2;
        }

        // Quadrant of deception (avoid)
        if(isUrgent()) {
            this.rating = 3;
        }
        // Quadrant of Waste
        else {
            this.rating = 4;
        }

    }

    public boolean isImportant() {
        return important;
    }

    public void toggleImportant() {
        if(isImportant()){
            this.important = false;
        } else {
            this.important = true;
        }
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void toggleUrgent() {
        if(isUrgent()){
            this.urgent = false;
        } else {
            this.urgent = true;
        }
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
