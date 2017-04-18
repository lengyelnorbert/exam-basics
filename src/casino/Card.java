package casino;

public class Card {

  String color;
  int value;

  Card(String color, int value) {
    this.color = color;
    this.value = value;
  }

  public String getCardInfo() {
    String cardInfo;
    if (value == 1) {
      cardInfo = "Ace " + color;
    } else if (value == 11) {
      cardInfo = "Jack " + color;
    } else if (value == 12) {
      cardInfo = "Queen " + color;
    } else if (value == 13) {
      cardInfo = "King " + color;
    } else {
      cardInfo = value + " " + color;
    }
    return cardInfo;
  }
}
