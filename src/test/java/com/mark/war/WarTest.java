package com.mark.war;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class WarTest {

    /*
        Example purpose only, more unit tests needed for production use
     */

    @Test
    public void playSimpleWarTest() {
        Card card1 = new Card(Card.Rank.Four, Card.Suit.CLUBS);
        Card card2 = new Card(Card.Rank.Three, Card.Suit.SPADES);
        Card card3 = new Card(Card.Rank.Ace, Card.Suit.DIAMONDS);
        Card card4 = new Card(Card.Rank.Five, Card.Suit.CLUBS);
        Card card5 = new Card(Card.Rank.Four, Card.Suit.SPADES);
        Card card6 = new Card(Card.Rank.Jack, Card.Suit.DIAMONDS);

        Player player1 = new Player(1);
        Player player2 = new Player(2);
        Player player3 = new Player(3);

        player1.addCardToHand(card1);
        player1.addCardToHand(card2);

        player2.addCardToHand(card3);
        player2.addCardToHand(card4);

        player3.addCardToHand(card5);
        player3.addCardToHand(card6);

        War warTest = new War();
        Deck deck = new DeckImpl();
        deck.create(4, 13);
        List<Player> winner = warTest.playWar(3, deck);

        assertEquals(1, winner.size());
        assertEquals(2, winner.get(0).getPlayerNumber());
    }

    @Test
    public void determineHighestRankPlayersTest() {

        Map<Player, Optional<Card>> playedCards = new HashMap<>();
        Card card1 = new Card(Card.Rank.Ace, Card.Suit.CLUBS);
        Card card2 = new Card(Card.Rank.Ten, Card.Suit.SPADES);
        Card card3 = new Card(Card.Rank.Ten, Card.Suit.DIAMONDS);

        Player player1 = new Player(1);
        Player player2 = new Player(2);
        Player player3 = new Player(3);
        playedCards.put(player1, Optional.of(card1));
        playedCards.put(player2, Optional.of(card2));
        playedCards.put(player3, Optional.of(card3));


        War warTest = new War();
        List<Player> result = warTest.determineWinnerOfBattle(playedCards);
        assertEquals(2, result.size());
        assertTrue(result.contains(player3));
        assertTrue(result.contains(player2));
    }

    @Test
    public void determineHighestRankPlayerCardForHand() {
        Map<Player, Optional<Card>> playedCards = new HashMap<>();
        Card card1 = new Card(Card.Rank.Ace, Card.Suit.CLUBS);
        Card card2 = new Card(Card.Rank.Ace, Card.Suit.SPADES);
        Card card3 = new Card(Card.Rank.Ten, Card.Suit.DIAMONDS);

        Player player1 = new Player(1);
        Player player2 = new Player(2);
        Player player3 = new Player(3);
        playedCards.put(player1, Optional.of(card1));
        playedCards.put(player2, Optional.of(card2));
        playedCards.put(player3, Optional.of(card3));

        War warTest = new War();
        List<Player> result = warTest.determineWinnerOfBattle(playedCards);
        assertEquals(1, result.size());
        assertTrue(result.contains(player3));
    }

    // @Test
    public void playWarMultilevelTest() {
        // test deep recursion
    }

    // @Test
    public void playWarManyPlayers() {
        // test with many players
    }

    // @Test
    public void playWarSuites() {
        // test edge cases, invalid parameter handling
    }


    // @Test
    public void playWarRanks() {
        // test edge cases, invalid parameter handling
    }
}

