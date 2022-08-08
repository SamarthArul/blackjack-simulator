
/**
 * Write a description of class DeckRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeckRunner
{
    public static void main(String[] args) {
        
    Deck testDeck = new Deck();
    testDeck.shuffleDeck();
    System.out.println(testDeck.getDeck());
    testDeck.deckPrinterSpecific();
    
}
}
