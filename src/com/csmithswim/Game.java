package com.csmithswim;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int turn;
    boolean play;

    public Game(int turn, boolean play) {
        this.play = true;
        this.turn = 3;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (play) {
            //Instantiating random object
            Random rand = new Random();
            //Instantiating hand object
            Hand myHand = new Hand(5);

            //Welcome message, try to attach conditional to start game
            Console.welcome();
            //Filling myHand object with random die
            myHand.roll(rand);
            //Displaying first hand
            System.out.println(myHand);

            //FIRST TURN
            //Keep any dice or roll all 5
            myHand.roll(rand, Console.getChoices());
            System.out.println(myHand);
            myHand.checkYahtzee();
            turn--;

            //SECOND TURN
            //Keep any dice or roll all 5
            myHand.roll(rand, Console.getChoices());
            myHand.checkYahtzee();
            System.out.println(myHand);
            turn--;
            //THIRD TURN
            //Keep any dice or roll all 5
            myHand.roll(rand, Console.getChoices());
            System.out.println(myHand);

            //See if there is a Yahtzee
            myHand.checkYahtzee();

            turn--;
            //Conditional to end game
            if(turn == 0){
                play=false;
            }
        }
    }
}

