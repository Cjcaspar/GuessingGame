package com.company;
import java.util.Random;
import java.util.Scanner;
public class Utility
{
    public static void game(int difficulty)
    {
        int numGuess = -1;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        if (difficulty == 1)
        {
            numGuess = 10;
        }
        else if (difficulty == 2)
        {
            numGuess =  7;
        }
        else if (difficulty == 3)
        {
            numGuess = 5;
        }

        int n = rand.nextInt(100) + 1;
        System.out.println("I will generate a number between 1 and 100. You will guess the number and I will tell you if your number is higher or lower than the generated number. You have " + numGuess + "chances to correctly guess my number. \n \n");


        for (int i = 0; i < numGuess; i++)
        {
            int guess = -1;
            while (guess < 1 || guess > 100)
            {
                System.out.println("Guess number " + (i + 1) + ":");
                String guessString = scanner.nextLine();

                try
                {
                    guess = Integer.parseInt(guessString);
                    if (guess < 1 || guess > 100)
                    {
                        System.out.println("Your number is not between 1 and 100. Please try again.");
                    }
                }
                catch (Exception e)
                {
                    System.out.println("That is not a valid input. please try entering a number between 1 and 100");
                }
            }

            if (n == guess)
            {
                System.out.println("Congratulations, you have guessed correctly on attempt number: " + (i + 1) + "\n");
                break;
            }
            else if (n > guess)
            {
                System.out.println("Your guess was lower than my number\n");
            }
            else if (n < guess)
            {
                System.out.println("Your guess was higher than my number\n");
            }
            if (i == (numGuess - 1))
            {
                System.out.println("Better luck next time! My number was: " + n + "\n");
            }
        }
    }
    public static char playAgain()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you wish to play again? \n\nPress the y character, then enter to play again.\nPress the n key then enter to close.\n");
        String playString = scanner.nextLine();
        char play = 'n';

        try
        {
            play = playString.charAt(0);
        }
        catch (Exception e)
        {
            System.out.println("Could not read input. Program will now close.");
        }

        return play;
    }

    public static int getDifficulty()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which difficulty do you wish to play? enter 1 for easy, 2 for medium, or 3 for hard.");
        int difficulty = scanner.nextInt();

        while (difficulty != 1 && difficulty != 2 && difficulty != 3)
        {
            System.out.println("That input does not correspond to a difficulty level. Please try again");
            difficulty = scanner.nextInt();
        }
        return difficulty;
    }
}

