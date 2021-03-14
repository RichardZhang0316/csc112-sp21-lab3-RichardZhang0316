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
    private Deck newDeck;

    // *********

    // main switchboard
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Blind Man's Bluff");
        System.out.println("");

        String Outcome="";
        int round=0;

        // local variables
        int numberWins = 0;
        int numberLosses = 0;

        // set up deck of playing cards
        newDeck=new Deck();

        // loop to play the game
        while(!newDeck.emptyDeck()) {

            // assign a card from deck to computer and user
            Card computerCard= newDeck.dealCard();
            Card userCard= newDeck.dealCard();

            // show user the computer's card
            System.out.println("Computer's card is "+computerCard.toString());

            // get the user's guess
            if(getUserGuess(sc)==computerCard.lessthan(userCard)){
                Outcome="Great! You are right!";
                numberWins++;
            }
            else{
                Outcome="Sorry, you are wrong.";
                numberLosses++;
            }


            // show user's card
            System.out.println("Your card is "+userCard.toString());

            // print correct outcome or incorrect outcome
            System.out.println(Outcome);
            System.out.println("");

            // determine is user wants to play again
            //determine whether there are enough cards in the deck
            round++;
            if(round>=26){
                break;
            }

            if(playagain(sc)==false){
                break;
            }

        }

        // output stats
        System.out.println("\nThanks for playing!");
        System.out.println("Your record was " + numberWins + "-" + numberLosses +  "(W-L)" );
    }

    // ******************************

    // private method to manage user's "play again?" response
    private boolean playagain(Scanner myInputDevice) {
        boolean playAgain=true;
        while(playAgain) {
            System.out.print("Do you want to play again? Yes/No ");
            String userAnswer = myInputDevice.next();
            if (userAnswer.equals("y")||userAnswer.equals("Y")||userAnswer.equals("Yes")||userAnswer.equals("yes")) {
                System.out.println("");
                return true;
            } else if (userAnswer.equals("n")||userAnswer.equals("N")||userAnswer.equals("No")||userAnswer.equals("no")) {
                System.out.println("");
                return false;
            } else{
                System.out.println("Invalid response");
                System.out.println("");
                playAgain=true;
            }
        }
        return false;
    }

    // ***************************

    // private method to manage the user's guess
    private boolean getUserGuess(Scanner keyboard){
        boolean guessAgain=true;
        while(guessAgain) {
            System.out.print("Do you think your number is higher or lower? (H/L) : ");
            String inputHighOrLow = keyboard.next();
            if (inputHighOrLow.equals("H") || inputHighOrLow.equals("h")||inputHighOrLow.equals("higher")) {
                return true;
            } else if (inputHighOrLow.equals("L") || inputHighOrLow.equals("l")||inputHighOrLow.equals("lower")) {
                return false;
            } else {
                System.out.println("Invalid response");
                guessAgain=true;

            }
        }
        return false;
    }

    // **********************

    public static void main(String[] args) {

        new Main().run();
        System.exit(0);
    }

}
