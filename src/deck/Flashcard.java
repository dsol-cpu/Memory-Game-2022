package src.deck;

public class Flashcard extends Card{
    String sideA;
    String sideB;
    boolean flippedOver = false;
    public Flashcard(String sideA, String sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
}
