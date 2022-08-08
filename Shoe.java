import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Shoe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shoe
{
    // instance variables - replace the example below with your own
    private ArrayList<Card> shoe = new ArrayList<Card>();
    String [] ranks = {"Ace", "Two", "Three", "Four", "Five","Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String [] suits = {"Hearts", "Diamonds", "Spades","Clubs"};
    
    /**
     * Constructor for objects of class Shoe
     */
    public Shoe(int x)
    {
        for (int i = 0; i < ranks.length; i++)
        {
            for (int n = 0; n < suits.length; n++)
            {
                
                for (int z = 0; z < x; z++)
                {
                shoe.add(new Card(ranks[i], suits[n]));
                }
            
            }
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Card dealCard()
    {
        // put your code here
        Card cardReturn = shoe.get(0);
        shoe.remove(0);
        return cardReturn;
    }
    
    
    public void shuffleShoe ()
    {
        ArrayList<Card> temp = new ArrayList<Card>();
        
        
        while(!shoe.isEmpty()) {
            int randomNum = (int)(Math.random() * shoe.size());
            temp.add(shoe.get(randomNum));
            shoe.remove(randomNum);   
        }
        
        shoe=temp;
    }  
    
    public int getNumCardsInShoe ()
    {
        return shoe.size();
    } 
    
    public void shoePrinterSpecific()
    {
        for (int i = 0; i < shoe.size(); i++)
        {
            System.out.println(shoe.get(i));
        }
    }
}
