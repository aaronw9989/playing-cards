package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.model.Deck;
import com.tlglearning.cards.model.Rank;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class TestMain {

  public static void main(String[] args) {
    Deck deck = new Deck();
    // Secure Random IS-A Random
    Random rng = new SecureRandom();
    Set<Rank> excludedCards = EnumSet.range(Rank.TWO, Rank.EIGHT);
    deck.shuffle(rng);
    Spliterator<Card> splitter = Spliterators.spliterator(deck.iterator(), deck.size(), 0);

    List<Card> pinochleCards = StreamSupport
        .stream(splitter, false)
        .filter((card) -> !excludedCards.contains(card.getRank()))
        .collect(Collectors.toList());

    System.out.println(pinochleCards);





  }

}

