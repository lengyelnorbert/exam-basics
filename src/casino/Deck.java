package casino;


import java.lang.reflect.Array;
import java.util.List;

public class Deck {
  int deckSize;
  List<Card> myDeck;

  Deck(int deckSize){
    this.deckSize = deckSize;
    myDeck.add(getRandomClubsCard());
    if (deckSize < 5){
      smallDeckFillUp(deckSize);
    }


  }

  public void smallDeckFillUp(int deckSize){

  }

  public void addRandomCardToTheDeck(){
    int randomCard = (int) (Math.random() * 4) + 1;
    if (randomCard == 1){myDeck.add(getRandomHeartsCard());}
    if (randomCard == 2){myDeck.add(getRandomDiamondCard());}
    if (randomCard == 3){myDeck.add(getRandomSpadesCard());}
    if (randomCard == 4){myDeck.add(getRandomClubsCard());}
  }

  public Card getRandomHeartsCard(){
    int cardValue = (int) (Math.random() * 13) + 1;
    Card thisCard = new Card("Hearts", cardValue);
    return thisCard;
  }

  public Card getRandomDiamondCard(){
    int cardValue = (int) (Math.random() * 13) + 1;
    Card thisCard = new Card("Diamond", cardValue);
    return thisCard;
  }

  public Card getRandomSpadesCard(){
    int cardValue = (int) (Math.random() * 13) + 1;
    Card thisCard = new Card("Spades", cardValue);
    return thisCard;
  }

  public Card getRandomClubsCard(){
    int cardValue = (int) (Math.random() * 13) + 1;
    Card thisCard = new Card("Clubs", cardValue);
    return thisCard;
  }
}
