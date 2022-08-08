
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    private String rank;
    private String suit;
    private int value;

    String [] ranks = {"Ace", "Two", "Three", "Four", "Five","Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    /**
     * Constructor for objects of class Card
     */
    public Card(String r, String s)
    {
        rank = r;
        suit = s;

        for (int i = 1; i < ranks.length; i++)
        {
            if ((rank == ranks[i]) && (i > 8))
                value = 10;
            else if (rank == ranks[i])
                value = i + 1;
            else if (rank.equals("Ace"))
                value = 11;

            
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean isAce()
    {
        if (rank.equals("Ace"))
            return true;

        return false;
    }

    public void setAceValue (boolean s)
    {
        if (isAce())
        {
            if (s)
                value = 11;
            else
                value = 1;
        }
    }

    public String getSuit()
    {
        return suit;
    }

    public String getRank()
    {
        return rank;
    }

    public int getValue()
    {
        return value;
    }

    public String toString()
    {
        return getRank() + " of " + getSuit();
    }
}
