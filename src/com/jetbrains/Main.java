package com.jetbrains;

import java.util.Random;
import java.util.Scanner;

/*
    Dice Roller
    Rolls 2 dice
    Options for: Number of sides on each dice
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        boolean userChoice = false;     // set to true if user wants to roll dice
        int numSides = 6;               // number of sides on each of the dice rolled DEFAULT =  6
        int numberRolledDice1 = -1;     // value of number rolled on dice1
        int numberRolledDice2 = -1;     // value of number rolled on dice2

       
        String userContinueChoice = "yes";
        do {
            numSides = getSides();
            userChoice = getChoice();



            // DEBUG OUTPUT System.out.println(userInput);//    DEBUG OUTPUT
            if (userChoice) {
                numberRolledDice1 = rollDice(numSides);
                numberRolledDice2 = rollDice(numSides);
            }
            System.out.println("Die one rolled: " + numberRolledDice1 + " Die two rolled: " + numberRolledDice2);

            System.out.println("Do  you want to continue? (yes /no) ");
            userContinueChoice = scan1.next();
            scan1.nextLine();
        } while (userContinueChoice.equalsIgnoreCase("yes"));


    }


    public static int getSides() {
        // returns number of sides on dice rolled
        int userInput = 1;
        System.out.println("How many sides are on the dice?");
        Scanner scan1 = new Scanner(System.in);
        userInput = scan1.nextInt();
        scan1.nextLine();

        return userInput;
    }

    public static boolean getChoice() {
        // returns true if user wants to roll dice
        boolean rollDice = false;

        while (!rollDice) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Do you want to roll the dice?");
            String userChoice = scan1.nextLine();
            if (userChoice.equalsIgnoreCase("yes")) {
                rollDice = true;
                break;

            }

        }

        return rollDice;

    }

    public static int rollDice(int userInput) {
        Random randGen = new Random();
        int diceSides = randGen.nextInt(userInput) + 1; //generates a random number between 1 and the userInput

        return diceSides;

    }
}

