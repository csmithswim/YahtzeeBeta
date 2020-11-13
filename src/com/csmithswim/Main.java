package com.csmithswim;
import java.util.Scanner;
import javax.swing.JOptionPane;

//implement do/while loop to exit only when input = 'quit' or totalScore != 0;
public class Main {

    public static void main(String[] args) {
        boolean play = true;
        String removeRoll="remove";
        while (play){
            Dice dice1 = new Dice();
            System.out.println("Welcome To Career Dev's Yahtzee, type 'start' to begin a new game.");
            Scanner scan = new Scanner(System.in);
            String firstRoll = scan.next();

            if (firstRoll.equals("start")) {
                dice1.rollAllDice();
                System.out.println("Type 'roll' to re-roll or 'remove' to remove selected dice");
                String secondRoll = scan.next();
                if (secondRoll.equals("remove")) {
                    System.out.println("Enter specific dice to be removed, i.e. 024 to remove the first, third and fifth dice.");
                    System.out.println("Enter Dice To Be Removed:");
                    String nextLine = scan.nextLine();
                    String diceToRemove = scan.nextLine();
                    dice1.removeSelectedDice(diceToRemove);
                    System.out.println("Type roll to roll your second time.");

                }
                else if (secondRoll.equals("roll")) {
                    dice1.rollAllDice();
                    String thirdRoll = scan.next();
                    if (thirdRoll.equals("roll")){
                        dice1.rollAllDice();
                    }
                }
            return;
            }
        }
    }
}



