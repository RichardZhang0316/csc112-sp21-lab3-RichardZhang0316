/*
 *   This class represents a deck of 52 cards.
 *
 *   David John, February 2021 -- basic design
 */

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards=new ArrayList < Card >();

    // Build a deck of 52 cards
    public Deck(){
        for(int i=0; i<52; i++){
            cards.add(new Card(i));
        }
    }

    // is the deck of cards empty
    public Boolean emptyDeck(){
        if(cards.size()==0){
            return true;
        }
        else{
            return false;
        }
    }

    // randomly pick a card from the deck, remove it and return it
    public Card dealCard(){
        Random randGen=new Random();
        int rand=randGen.nextInt(cards.size());
        Card cardThatIsReturned=new Card(rand);
        cards.remove(rand);
        return cardThatIsReturned;
    }



}
