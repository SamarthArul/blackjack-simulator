# blackjack simulator
 feb-march 2020


from project outlines:

Card.java and CardTester.java

A Card has three fundamental traits:
- a rank (String which indicates the card value. Possible values are: Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King)
- a suit (String indicating one of four suits in a standard deck of cards. The suits are: Hearts, Diamonds, Spades, Clubs)
- value (integer,the value assigned to a card can vary between card games. For our purposes, Aces will have an initial value of 11, face cards (Jacks, Queens and Kings) will have a value of 10 and all other cards have a value that matches its rank (i.e. a Two of Hearts has a value of 2).

The Card class has a constructor. The constructor takes TWO inputs: the Card rank and the Card suit. The value of the Card object should be determined and assigned by the constructor.
  
• Since Aces have special properties in the game of BlackJack, we need a couple of special methods to deal with them.
- isAce: takes no inputs, returns a boolean value that indicates whether a particular Card is an Ace (true means the Card is an Ace)
- setAceValue(boolean setToOne) – Although Aces start with a value of 11, they can switch to a value of 1 in some cases. This method should     start by ensuring the Card is actually an Ace. If it is not an Ace, the method simply exits. For Aces, the method checks the input, setToOne. If setToOne is true, the value of the Card should be set to 1. The Card value should be set to 11 otherwise.
• Finally, we should have getters for the suit (getSuit()), rank (getRank()) and value (getValue()) of a Card and a toString() the prints the Card details like this: "Ace of Hearts"

Deck.java and DeckTester.java
A Deck contains a group of Cards. The standard Deck consists of 52 Cards. There are thirteen Cards (Ace, 2, 3, ...,9, 10, J, Q, K) in each of the 4 suits.
• We will use an ArrayList to implement our Deck.
• The Deck class has a constructor. Creating a Deck should result in the creation of one and only one of each possible Card (52 total). As Cards are created, they should be added to our ArrayList. 
• Other objects will be making use of our Deck, so a method getDeck() will be needed. This method returns a reference to the ArrayList of Cards contained in the Deck.
• Finally, we need to be able to shuffle our Deck. shuffleDeck() accomplishes this task. The method should loop through the ArrayList and for each Card, swap the Card in the current position with another Card found at another randomly determined location in the list.
• a toString() method that prints the value of each Card in your Deck 
   
Shoe.java and ShoeTester.java

Originally, Blackjack was played with a single deck of cards. But savvy card players soon learned they could win more often by "counting cards." These players would keep track of which cards had been played already, and, as a result, they were able to make more accurate guesses about what cards they might be dealt in later hands. This is a huge advantage to the player. To counteract this, most blackjack games today use a "shoe". A shoe is a device that holds multiple decks of cards.

• Like a Deck, a Shoe should be implemented as an ArrayList of Card objects.
• The Shoe constructor should take a single integer input that indicates how many Decks of Cards should be placed in the Shoe. The constructor should create the appropriate number of Decks and add the Cards from each to the Shoe's ArrayList of Cards. 
• The dealer uses the Shoe to distribute Cards to the players, so the Shoe will need a dealCard() method that removes the first Card from the Shoe's Arraylist and returns it.
• Like the Deck method, we need a way to mix the Cards in the Shoe. shuffleShoe() shuffles all of the Cards in the Shoe.
• Even with a Shoe that holds multiple Decks, we will run out of cards eventually and need to start over with a new Shoe. To help us track that situation, we'll create a method getNumCardsInShoe(). This method takes no inputs and simply returns an integer indicating how many Cards remain in the Shoe.
