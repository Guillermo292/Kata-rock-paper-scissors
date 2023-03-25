package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerTest {

    private Player player1;
    private Player player2;

    public PlayerTest() {
        this.player1 = new Player();
        this.player2 = new Player();

    }
    @Test
    void testPlayerCanChooseArock(){
         player1 = player1.choose("Rock");

    }


}
