package com.factoriaf5.rps.application;

import static org.junit.Assert.*;

import org.junit.Test;

import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class GameTest {
    
    @Test
    public void checked_type_rock() {
        Rock rock = new Rock();
       assertEquals("Rock",rock.getType());
    }

    @Test
    public void checked_type_paper() {
        Paper paper = new Paper();
       assertEquals("paper",paper.getType());
    }
@Test
    public void checked_type_Scissors() {
        Scissors scissors = new Scissors();
       assertEquals("scissors",scissors.getType());
    }

}


