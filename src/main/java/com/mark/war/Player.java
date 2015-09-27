package com.mark.war;

import com.google.common.collect.Iterables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.lang.String.format;

public class Player {
    private final static Logger logger = LoggerFactory.getLogger(Player.class);
    private final int playerNumber;
    private final List<Card> handCards = new ArrayList<>();

    private final List<Card> stackCards = new ArrayList<>();

    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public void addCardsToStack(List<Card> cards) {
        stackCards.addAll(cards);
    }

    public void addCardToHand(Card card) {
       logger.info(format("Dealing %s to player #%s", card, playerNumber));
        handCards.add(card);
    }

    public Optional<Card> playCard() {
        // last cards dealt are played first
        Optional<Card> card = Optional.ofNullable(Iterables.getLast(handCards, null));
        if (card.isPresent()) {
            handCards.remove(card.get());
        }
        logger.info(format("   + Player #%s plays %s", playerNumber, card.get()));
        return card;
    }

    public boolean hasHandCards() {
        return (!handCards.isEmpty());
    }

    public int getPlayerNumber () {
        return playerNumber;
    }

    @Override
    public String toString() {
        return format("#Player: %s, #CardsInHand: %s, #CardsInStack: %s, StackCards Detail: %s", playerNumber,  handCards, getNumberOfStackCards(),     stackCards);
    }

    public int getNumberOfStackCards() {
        return stackCards.size();
    }
}
