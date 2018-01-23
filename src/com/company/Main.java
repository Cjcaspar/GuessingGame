package com.company;
import java.util.Random;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        boolean playAgain = true;
        while (playAgain)
        {

            Random rand = new Random();
            Scanner scanner = new Scanner(System.in);
            int n = rand.nextInt(100) + 1;
            System.out.println("I will generate a number between 1 and 100. You will guess the number and I will tell you if your number is higher or lower than the generated number. You have five chances to correctly guess my number. \n \n");


            for (int i = 0; i < 5; i++)
            {
                int guess = -1;
                while (guess < 1 || guess > 100)
                {
                    System.out.println("Guess number " + (i+1) + ":");
                    String guessString = scanner.nextLine();

                    try
                    {
                        guess = Integer.parseInt(guessString);
                        if (guess < 1 	|| guess > 100)
                        {
                            System.out.println("Your number is not between 1 and 100. Please try again.");
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println("That is not a valid input. please try entering a number between 1 and 100");
                    }
                }

                if(n == guess)
                {
                    System.out.println("Congratulations, you have guessed correctly on attempt number: " + (i+1));
                    break;
                }
                else if (n > guess)
                {
                    System.out.println("Your guess was lower than my number");
                }
                else if (n < guess)
                {
                    System.out.println("Your guess was higher than my number");
                }
                if (i == 4)
                {
                    System.out.println("Better luck next time! My number was: " + n + "\n");
                }
            }

            System.out.println("Do you wish to play again? \n\nPress the y character, then enter to play again.\nPress the n key then enter to close.\n");

            String playString = scanner.nextLine();
            char play = playString.charAt(0);



            if (play != 'y')
            {
                playAgain = false;
            }
        }
    }
}