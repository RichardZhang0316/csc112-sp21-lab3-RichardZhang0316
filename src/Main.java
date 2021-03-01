/*
 *   Program to play a simple game, Blind Man's Bluff,
 *   with the computer.
 *
 *   Designed by:
 *   Sarra Alqahtani
 *   2020
 *
 *   David John
 *   February 2021  -- redesigned
 */

import java.util.Scanner;

public class Main {

    // deck of playing cards
    private Deck playingCards;

    // *********

    // main switchboard
    public void run(){

        System.out.println("Welcome to Blind Man's Bluff");

        // local variables
        int numberWins = 0;
        int numberLosses = 0;

        // set up deck of playing cards


        // loop to play the game
        while(!playingCards.emptyDeck()) {

            // assign a card from deck to computer and user


            // show user the computer's card


            // get the user's guess


            // show user's card


            // correct outcome

            // incorrect outcome


            // determine is user wants to play again

        }

        // output stats
        System.out.println("\nThanks for playing!");
        System.out.println("Your record was " + numberWins + "-" + numberLosses +  "(W-L)" );
    }

    // ******************************

    // private method to manage user's "play again?" response
    private boolean playagain(Scanner myInputDevice) {

        return false;

    }

    // ***************************

    // private method to manage the user's guess
    private boolean getUserGuess(Scanner keyboard){

        return true;
    }

    // **********************

    public static void main(String[] args) {

        new Main().run();
        System.exit(0);
    }

}
