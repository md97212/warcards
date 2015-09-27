package com.mark.war;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static java.lang.String.format;
import static java.util.stream.Collectors.toList;

public class DeckImpl implements Deck {
    private final static Logger logger = LoggerFactory.getLogger(DeckImpl.class);
    private int numberOfRanks;
    private int numberOfSuits;
    private List<Card> cards;

    public DeckImpl() {
    }

    @Override
    public void create(int numberOfSuits, int numberOfRanks) {
        this.numberOfRanks = numberOfRanks;
        this.numberOfSuits = numberOfSuits;
        logger.info(format("*** Creating Deck with %s suits and %s ranks ***", numberOfSuits, numberOfRanks));

        List<Card.Suit> suits = Arrays.asList(Card.Suit.values()).subList(0, numberOfSuits);
        List<Card.Rank> ranks = Arrays.asList(Card.Rank.values()).subList(0, numberOfRanks);
        cards = suits.stream().flatMap(suit -> ranks.stream().map(rank -> new Card(rank, suit))).collect(toList());
    }

    @Override
    public void shuffle() {
        logger.info("*** Shuffle Deck ***");
        Collections.shuffle(cards, new Random(System.nanoTime()));
    }

    @Override
    public Card deal() {
        Optional<Card> nextCard = cards.stream().findFirst();
        if (nextCard.isPresent()) {
            cards.remove(nextCard.get());
        }
        return nextCard.get();
    }

    @Override
    public int getNumberOfSuits() {
        return numberOfSuits;
    }

    @Override
    public int getOriginalNumberOfCards() {
        return numberOfRanks*getNumberOfSuits();
    }
}
