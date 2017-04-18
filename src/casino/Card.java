package casino;

public class Card {
  String color;
  int value;


  Card(String color, int value){
    this.color = color;
    this.value = value;
  }

  public String getCardInfo(){
    String cardInfo = color + " " + value;
    return cardInfo;
  }

}
