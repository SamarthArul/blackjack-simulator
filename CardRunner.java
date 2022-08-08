
/**
 * Write a description of class CardRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CardRunner
{
    
    
    public static void main (String[] args)
    {
        Card testCard = new Card("Ace", "Spades");
        System.out.println(testCard.isAce());
        testCard.setAceValue(false);
        System.out.println(testCard.getSuit());
        System.out.println(testCard.getRank());
        System.out.println(testCard.getValue());
        System.out.println(testCard);
    }



}
