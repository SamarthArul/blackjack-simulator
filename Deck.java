import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    // instance variables - replace the example below with your own
    String [] ranks = {"Ace", "Two", "Three", "Four", "Five","Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String [] suits = {"Hearts", "Diamonds", "Spades","Clubs"};
    private ArrayList<Card> deck = new ArrayList<Card>();

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {

        for (int i = 0; i < ranks.length; i++)
        {
            for (int n = 0; n < suits.length; n++)
            {

                deck.add(new Card(ranks[i], suits[n]));
                
            

            }
        }
    }

    public void shuffleDeck ()
    {
        ArrayList<Card> temp = new ArrayList<Card>();
        
        
        while(!deck.isEmpty()) {
            int randomNum = (int)(Math.random() * deck.size());
            temp.add(deck.get(randomNum));
            deck.remove(randomNum);   
        }
        
        deck=temp;
    }       

    public ArrayList getDeck()
    {
        return deck;
    }
    
    public void deckPrinterSpecific()
    {
        for (int i = 0; i < deck.size(); i++)
        {
            System.out.println(deck.get(i));
        }
    }
}


