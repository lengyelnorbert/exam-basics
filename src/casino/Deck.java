package casino;


import java.util.ArrayList;
import java.util.List;

public class Deck {

  int deckSize;
  List<Card> deckCardList;

  Deck(int deckSize) {
    this.deckSize = deckSize;
    createNewDeck(deckSize);
  }

  public void createNewDeck(int deckSize) {
    deckCardList = new ArrayList<>();
    int deckSizeInTheMethod = deckSize;
    if (deckSize > 1) {
      deckCardList.add(getRandomHeartsCard());
      deckSizeInTheMethod--;
    }
    if (deckSize > 1) {
      deckCardList.add(getRandomDiamondCard());
      deckSizeInTheMethod--;
    }
    if (deckSize > 1) {
      deckCardList.add(getRandomSpadesCard());
      deckSizeInTheMethod--;
    }
    if (deckSize > 1) {
      deckCardList.add(getRandomClubsCard());
      deckSizeInTheMethod--;
    }
    for (int i = 0; i < deckSizeInTheMethod; i++) {
      addRandomCardToTheDeck();
    }
  }

  public void addRandomCardToTheDeck() {
    int randomCard = (int) (Math.random() * 4) + 1;
    if (randomCard == 1) {
      deckCardList.add(getRandomHeartsCard());
    }
    if (randomCard == 2) {
      deckCardList.add(getRandomDiamondCard());
    }
    if (randomCard == 3) {
      deckCardList.add(getRandomSpadesCard());
    }
    if (randomCard == 4) {
      deckCardList.add(getRandomClubsCard());
    }
  }

  public Card getRandomHeartsCard() {
    int cardValue = (int) (Math.random() * 13) + 1;
    Card thisCard = new Card("Hearts", cardValue);
    return thisCard;
  }

  public Card getRandomDiamondCard() {
    int cardValue = (int) (Math.random() * 13) + 1;
    Card thisCard = new Card("Diamond", cardValue);
    return thisCard;
  }

  public Card getRandomSpadesCard() {
    int cardValue = (int) (Math.random() * 13) + 1;
    Card thisCard = new Card("Spades", cardValue);
    return thisCard;
  }

  public Card getRandomClubsCard() {
    int cardValue = (int) (Math.random() * 13) + 1;
    Card thisCard = new Card("Clubs", cardValue);
    return thisCard;
  }

  public void shuffle() {
    int deckSizeInTheMethod = deckSize;
    List<Card> shuffledCardList = new ArrayList<>();
    while (deckSizeInTheMethod > 0) {
      int randomCardToPick = (int) (Math.random() * deckSizeInTheMethod);
      shuffledCardList.add(deckCardList.get(randomCardToPick));
      deckCardList.remove(randomCardToPick);
      deckSizeInTheMethod--;
    }
    deckCardList = shuffledCardList;
  }

  public String getDeckInfo() {
    String deckInfo = "Deck" + deckSize + " | ";
    for (Card card : deckCardList) {
      deckInfo += card.getCardInfo() + ", ";
    }
    return deckInfo;
  }

  public Card draw() {
    Card drawnCard = deckCardList.get(0);
    deckCardList.remove(drawnCard);
    deckSize--;
    return drawnCard;
  }
}
