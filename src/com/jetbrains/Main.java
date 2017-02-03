package com.jetbrains;

import javax.jws.soap.SOAPBinding;
import java.util.Random;
import java.util.Scanner;


public class Main
    {

    public static void main(String[] args) {
         Scanner    scan1 = new Scanner(System.in);




        String userContinueChoice = "yes";
        do {
            int userInput = getInput();
            // DEBUG OUTPUT System.out.println(userInput);//    DEBUG OUTPUT
            int numberRolledDice1 = rollDice(userInput);
            int numberRolledDice2 = rollDice(userInput);

            System.out.println("Dice one rolled: " + numberRolledDice1 + " Dice two rolled: " + numberRolledDice2);

            System.out.println("Do  you want to continue? (yes /no) ");
            userContinueChoice = scan1.next();
            scan1.nextLine();
        } while (userContinueChoice.equalsIgnoreCase("yes"));




        }


        public static int getInput()
    {
            int userInput = 1;
            System.out.println("How many sides are on the dice?");
            Scanner scan1 = new Scanner(System.in);
            userInput = scan1.nextInt();
            scan1.nextLine();


            boolean rollDice = false;

            while (!rollDice)
            {
                System.out.println("Do you want to roll the dice?");
                String userChoice = scan1.nextLine();
                if( userChoice.equalsIgnoreCase("yes"))
                {
                    rollDice = true;
                    break;

                }

            }


            return userInput;
    }
    public static int rollDice(int userInput)
    {
        Random  randGen = new Random();
        int diceSides = randGen.nextInt(userInput) + 1;

        return diceSides;

    }
}

