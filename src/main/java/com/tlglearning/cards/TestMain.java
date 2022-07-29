package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.model.Deck;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Random;

public class TestMain {

  public static void main(String[] args) {
    Deck deck = new Deck();
    // Secure Random IS-A Random
    Random rng = new SecureRandom();
    System.out.println(deck);

    deck.shuffle(rng);
    System.out.println(deck);

//    for (Card card : deck) {
//      System.out.println(card);
//    }

    deck.sort();
    System.out.println(deck);

    // Local class because inside a method

    deck.sort((card1, card2) -> {
      int comparison = card1.getRank().compareTo(card2.getRank());
      if (comparison == 0) {
        comparison = card1.getSuit().compareTo(card2.getSuit());
      }
      return comparison;
    });

    System.out.println(deck);

  }

}

