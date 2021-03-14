/*
 *  This class represents a playing card by rank and suit, using two integers (for
 *  convenience.
 *
 *
 *  David John, February 2021 -- basic design
 *
 */

public class Card {
    // ranks are ordered Ace-low and Queen-high
    private static final String ranks[] =
            {"Ace","2","3","4","5","6","7","8","9","10","Jack","King","Queen"};

    // suits are ordered alphabetically
    private static final String suits[] = {"Clubs","Diamonds","Hearts","Spades"};

    //information about a single card
    private int myRank;
    private int mySuit;

    // constructor
    public Card(int cardcode){
        assert (cardcode>=0&&cardcode<52):"invalid code number"+cardcode;
        myRank=cardcode%13;
        mySuit=cardcode/13;
    }

    // lessthan() compares first by ranks and then by suits
    public Boolean lessthan(Card other){
        assert (other!=null):"card other is null";
        if(myRank> other.myRank){
            return false;
        }
        else if(myRank< other.myRank){
            return true;
        }
        else{
            if(mySuit>= other.mySuit){
                return false;
            }
            else{
                return true;
            }
        }
    }

    // override toString()
    @Override
    public String toString(){
        return (ranks[myRank]+" of "+suits[mySuit]) ;
    }
}
