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

    public Objective(Object object){
        this.title = object.title;
        this.description = object.description;
        this.completed = false;
        this.rating = calculateRating(this.getImportance, this.getUrgency);
        this.important = object.important;
        this.urgent = object.urgent;
        this.notes = object.notes;

    }


}
