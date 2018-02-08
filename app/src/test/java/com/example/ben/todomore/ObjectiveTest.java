package com.example.ben.todomore;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ben on 08/02/18.
 */

public class ObjectiveTest {

    Objective objective;

    @Before
    public void before(){
        objective = new Objective();
        objective.setTitle("Test more often");
        objective.setDescription("Test more & more");
        objective.setNotes("Testing is super important");

    }

    @Test
    public void titleCanBeRetrieved(){
        assertEquals("Test more often",objective.getTitle());
    }

    @Test
    public void descriptionCanBeRetrieved() {
        assertEquals("Test more & more", objective.getDescription());
    }

    @Test
    public void notesCanBeRetrieved(){
        assertEquals("Testing is super important", objective.getNotes());
    }

    @Test
    public void completedBeginsFalse(){
        assertEquals(false, objective.isCompleted());

    }
    @Test
    public void importantBeginsFalse() {
        assertEquals(false, objective.isImportant());
    }
    @Test
    public void urgentBeginsFalse() {
        assertEquals(false, objective.isUrgent());
    }

    @Test
    public void canToggleCompleted(){
        objective.toggleCompleted();
        assertEquals(true, objective.isCompleted());
    }

    @Test
    public void canToggleImportance(){
        objective.toggleImportant();
        assertEquals(true, objective.isImportant());
    }

    @Test
    public void canToggleUrgent(){
        objective.toggleUrgent();
        assertEquals(true, objective.isUrgent());
    }



}
