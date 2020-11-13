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
            System.out.println("\n\nWelcome To Career Dev's Yahtzee, type 'start' to begin a new game.");
            System.out.println("Yahtzee is a dice based game. The goal is to score as many points as possible using 5 dice and a total of 3 turns.");
            System.out.println("The first roll is with all 5 dice. After the first roll, you have the option of putting aside any dice before the second and third turn.");
            System.out.println("I.e., you roll all 5 dice and see you have three 6's and decide to hold on to the 6's. You now have the option to roll three dice to try");
            System.out.println("to maximize your point potential.");
            System.out.println("\nEnter 'start' to roll and start your first turn.");
            Scanner scan = new Scanner(System.in);
            String firstRoll = scan.next();
            if (firstRoll.equals("start")) {
                dice1.rollAllDice();
                System.out.println("Type 'roll' to re-roll or 'keep' to keep selected dice.\n");
                String secondRoll = scan.next();
                if (secondRoll.equals("keep")) {
                    System.out.println("\nEnter specific dice to keep, i.e. 024 to keep the first, third and fifth dice.");
                    System.out.println("Enter dice to keep.\n");
                    String nextLine = scan.nextLine();
                    String diceToRemove = scan.nextLine();
                    dice1.keepSelectedDice(diceToRemove);
                    System.out.println("\nType roll to roll your second turn.\n");
                    String firstTurn = scan.nextLine();
                    if (firstTurn.equals("roll")){
                        dice1.rollSelectedDice();
                        System.out.println("Type 'roll' to re-roll or 'keep' to keep selected dice.\n");
                        String secondTurn = scan.nextLine();
                        if (secondTurn.equals("roll")){
                            dice1.rollSelectedDice();
                        }
                        else if (secondTurn.equals("keep")){
                            System.out.println("\nEnter specific dice to keep, i.e. 024 to keep the first, third and fifth dice.");
                            System.out.println("Enter dice to keep.\n");
                            String thirdTurn = scan.nextLine();
                            dice1.keepSelectedDice(thirdTurn);
                            System.out.println("Enter 'roll' to roll your final roll");
                            String fourthTurn = scan.nextLine();
                            if(fourthTurn.equals("roll")) {
                                dice1.rollSelectedDice();
                                System.out.println("Enter specific dice to keep, i.e. 024 to keep the first, third and fifth dice.");
                                String fifthTurn = scan.nextLine();
                                dice1.keepSelectedDice(fifthTurn);
                            }
                        }
                    }
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



