package com.csmithswim;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Dice {
    int counter = 3;
    ArrayList<Integer> currentRoll = new ArrayList<Integer>();
    ArrayList<Integer> diceKept = new ArrayList<Integer>();

    public void keepSelectedDice(String diceToBeRemoved){

        String[] splitDice = diceToBeRemoved.split("");

            for (String dice : splitDice) {
                diceKept.add(currentRoll.remove(Integer.parseInt(dice)));
                currentRoll.add(Integer.parseInt(dice),Integer.parseInt(dice));
            }

    currentRoll = diceKept;

        System.out.println("These are the dice you have kept: "+diceKept+".");

        if (counter == 2 ) {
            System.out.println("Enter 'roll' to roll your " + counter + "nd turn.");
        }
        if (counter == 1){
            System.out.println("Enter 'roll' to roll your final roll");
        }
    }

    public void rollSelectedDice(){
        System.out.println("\nType roll to roll your second turn.\n");

        ArrayList<Integer> roll = new ArrayList<Integer>();
        for (int i = 0; i <= 4-currentRoll.size(); i++) {
            double rand = Math.ceil(Math.random() * 6);
            int iRand;
            iRand = (int) rand;
            roll.add(iRand);
        }
        System.out.println("\nThese are the dice you have put aside:\n"+currentRoll);
        System.out.println("\n   Dice \n"+roll);
        System.out.println("--------------\n 0  1  2  3  4");
        System.out.println("\nYou have " +(counter-1) + " roll(s) left.\n");
        counter--;
        currentRoll = roll;
        if (counter >= 1) {
            System.out.println("Type 'roll' to re-roll or 'keep' to keep selected dice.\n");
        }
        if (counter == 0) {
            System.out.println("Enter any dice you want to keep for your final turn.");
        }
    }

    public void rollAllDice() {
        ArrayList<Integer> roll = new ArrayList<Integer>();
        for (int i = 0; i <= 4; i++) {
            double rand = Math.ceil(Math.random() * 6);
            int iRand;
            iRand = (int) rand;
            roll.add(iRand);
        }
        System.out.println("\n\n    Dice    \n"+roll + "\n--------------\n 0  1  2  3  4");
        System.out.println("\nYou have " + (counter-1) + " rolls left.");
        counter--;
        currentRoll = roll;
        System.out.println("Type 'roll' to re-roll. \nIf you want to keep some dice, first input 'keep' followed by enter then followed by the specific dice you want keep.");

        System.out.println("This game uses an index based number(s) as input to decide which dice you want to keep. For example, 01 means you are keeping the first and second " +
                "dice" +
                " " +
                "displayed left to right.\n");
    }

    public void introMessage(){
        System.out.println("\n\nWelcome To Career Dev's Yahtzee, type 'start' to begin a new game.");
        System.out.println("Yahtzee is a dice based game. The goal is to score as many points as possible using 5 dice and a total of 3 turns.");
        System.out.println("The first roll is with all 5 dice. After the first roll, you have the option of putting aside any dice before the second and third turn.");
        System.out.println("I.e., you roll all 5 dice and see you have three 6's and decide to hold on to the 6's. You now have the option to roll three dice to try");
        System.out.println("to maximize your point potential.");
        System.out.println("\nEnter 'start' to roll and start your first turn.");
    }


}
