package com.tlglearning.cards.model;

import java.util.Comparator;
import java.util.Objects;

// The card class implements the ability to be
// comparable against other cards
public final class Card implements Comparable<Card> {

  private final Rank rank;
  private final Suit suit;
  private final String representation;
  private final int hash;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
    representation = rank.getSymbol() + suit.getSymbol();
    // Objects.hash() - generates a hash code for a sequence of inputs
    hash = Objects.hash(rank, suit);
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

  @Override
  public final int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    // NOTE: local variables don't get a default value
    boolean result;

    if(this == obj) {
      result = true;
    } else if (obj instanceof Card) {
      // Cast the reference type to Card, because it is currently obj
      Card other = (Card) obj;
      // because rank and suit are Enums we can compare them
      // enums only live in one place in memory
      result = (rank == other.rank && suit == other.suit);
    } else {
      result = false;
    }
    return result;
  }

  @Override
  public final String toString() {
    return representation;
    //return super.toString();
  }

  @Override
  public int compareTo(Card other) {
    return Comparator
        .comparing(Card::getSuit)
        .thenComparing(Card::getRank)
        .compare(this, other);
  }

}
