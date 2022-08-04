package com.tlglearning.cards.model;

public enum Suit {

  // NOTE: this is what the compiler creates for us
  // public static final Suit CLUBS = new Suit(symbol)

  CLUBS('\u2663', Color.BLACK),
  DIAMONDS('\u2662', Color.RED),
  HEARTS('\u2661', Color.RED),
  SPADES('\u2660', Color.BLACK);

  // NOTE: all constructors in ENUM are private
  private final char symbol;
  private final Color color; // NOTE: Fields get default values, unless we make it final!

  Suit(char symbol, Color color) {
    this.symbol = symbol;
    this.color = color;
  }

  public char getSymbol() {
    return symbol;
  }

  public enum Color {
    BLACK, RED
  }

  public Color getColor() {
    return color;
  }

}
