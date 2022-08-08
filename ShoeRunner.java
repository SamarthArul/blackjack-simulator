
/**
 * Write a description of class DeckRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoeRunner
{
    public static void main(String[] args) {
        
    Shoe testShoe = new Shoe(5);
    System.out.println(testShoe.dealCard());
    testShoe.shuffleShoe();
    testShoe.shoePrinterSpecific();
    System.out.println(testShoe.getNumCardsInShoe());
    
}
}
