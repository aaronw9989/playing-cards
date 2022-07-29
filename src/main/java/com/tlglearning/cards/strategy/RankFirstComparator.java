package com.tlglearning.cards.strategy;

import com.tlglearning.cards.model.Card;
import java.util.Comparator;

public class RankFirstComparator implements Comparator<Card> {

  @Override
  public int compare(Card card1, Card card2) {

    int comparison = card1.getRank().compareTo(card2.getRank());
    if (comparison == 0) {
      comparison = card1.getSuit().compareTo(card2.getSuit());
    }
    return comparison;
  }

}
