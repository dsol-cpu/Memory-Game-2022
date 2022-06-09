package src.deck;

public class Playing_Card extends Card{
    String sideA,sideB;
    boolean flippedOver = false;
    public Playing_Card(String sideA, String sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }    
}
