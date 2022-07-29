package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.model.Deck;
import java.security.SecureRandom;
import java.util.Random;

public class TestMain {

  public static void main(String[] args) {
    Deck deck = new Deck();
    // Secure Random IS-A Random
    Random rng = new SecureRandom();
    System.out.println(deck);

    deck.shuffle(rng);

    System.out.println(deck);

    for (Card card : deck) {
      System.out.println(card);
    }

  }

}
