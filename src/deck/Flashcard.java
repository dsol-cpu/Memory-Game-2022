package src.deck;

public class Flashcard extends Card{
    boolean flippedOver = false;
    public Flashcard(String sideA, String sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
}
