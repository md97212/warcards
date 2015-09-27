package com.mark.war;

import static java.lang.String.format;

public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public enum Suit {
        HEARTS, SPADES, CLUBS, DIAMONDS
    }

    public enum Rank {
        Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }

    @Override
    public String toString() {
        return format("%s of %s", rank, suit);
    }
}

