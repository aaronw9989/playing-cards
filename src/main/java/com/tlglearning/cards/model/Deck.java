package com.tlglearning.cards.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Deck implements Iterable<Card> {

  private final List<Card> cards;
  private Random defaultRng;
  private Iterator<Card> drawIterator; // NOTE: The default value of an object reference is null


  public Deck() {
    Suit[] suits = Suit.values();
    Rank[] ranks = Rank.values();
    cards = new ArrayList<>(suits.length * ranks.length);

    for (Suit suit : suits) {
      for (Rank rank : ranks) {
        Card card = new Card(rank, suit);
        cards.add(card);
      }
    }
  }

  public void shuffle() {
    // if default source of randomness is not created
    // then create one
    if (defaultRng == null) {
      defaultRng = new Random();
    }
    shuffle(defaultRng);
  }

  public void shuffle(Random rng) {
    Collections.shuffle(cards, rng);
    drawIterator = null;
  }

  public void sort() {
    // if we use null as a comparator it uses natual order
    sort(null);
  }

  public void sort(Comparator<Card> comparator) {
    cards.sort(comparator);
    drawIterator = null;
  }

  @Override
  public Iterator<Card> iterator() {
    return Collections.unmodifiableList(cards).iterator();
  }

  @Override
  public String toString() {
    return cards.toString();
  }

  public int size() {
    return cards.size();
  }

  public boolean isEmpty() {
    // If we have a draw iterator and there is no next cards, then our deck is empty
    return drawIterator != null && !drawIterator.hasNext();
  }

  public Card draw() {
    if (drawIterator == null) {
      // Return a new array of card to iterate over
      drawIterator = cards.iterator();
    }
    return drawIterator.next();
  }

}
