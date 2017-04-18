package casino;

public class BlackJack {

  public static void main(String[] args) {
    Deck deck = new Deck(20);
    System.out.println(deck.getDeckInfo());
    deck.shuffle();
    System.out.println(deck.getDeckInfo());
    Card drawn = deck.draw();
    System.out.println(drawn.getCardInfo());
    System.out.println(deck.getDeckInfo());
  }
}
