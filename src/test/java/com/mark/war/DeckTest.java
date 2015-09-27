package com.mark.war;


import org.junit.Test;

public class DeckTest {

    @Test
    public void createTest() {

        Deck deck = new DeckImpl();
        deck.create(4, 13);

    }

    @Test
    public void shuffleTest() {

    }

    @Test
    public void dealTest() {

    }
}
