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

    @Test
    public void canToggleCompletedBackToFalse(){
        objective.toggleCompleted();
        objective.toggleCompleted();
        assertEquals(false, objective.isCompleted());
    }
    // Given the above test runs fine, I will assume at this point that
    // both importance and urgency also work.
    // I can feel a refactor in this toggling code to put all under the
    // same function coming on.

    @Test
    public void canGenerateRatings(){
        objective.setRating();
        assertEquals(4, objective.getRating());

        // Toggling urgent to true should raise rating to 3.
        objective.toggleUrgent();
        objective.setRating();
        assertEquals(3, objective.getRating());

        //Toggling urgent to false and important to true should
        // raise the rating to 2
        objective.toggleUrgent();
        objective.toggleImportant();
        objective.setRating();
        assertEquals(2, objective.getRating());

        //Toggling urgent and important to true gives a rating of 1
        objective.toggleUrgent();
        objective.setRating();
        assertEquals(1, objective.getRating());



    }


}
