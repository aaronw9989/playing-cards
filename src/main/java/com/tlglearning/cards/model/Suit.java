package com.tlglearning.cards.model;

public enum Suit {

  // NOTE: this is what the compiler creates for us
  // public static final Suit CLUBS = new Suit(symbol)

  CLUBS('\u2663'),
  DIAMONDS('\u2662'),
  HEARTS('\u2661'),
  SPADES('\u2660');

  // NOTE: all constructors in ENUM are private
  private final char symbol;

  Suit(char symbol) {
    this.symbol = symbol;
  }

  public char getSymbol() {
    return symbol;
  }


}
