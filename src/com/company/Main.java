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
            int difficulty = Utility.getDifficulty();

            Utility.game(difficulty);

            char play = Utility.playAgain();

            if (play != 'y')
            {
                playAgain = false;
            }
        }
    }
}


//1. Allow user input of a number (guess)
//2. Tell the user if their guess is too high or too low.
//4. Allow 5 chances, if the number isn't guessed, tell them what it is.
//4. If the number is guessed, congratulate them.
//5. Allow the user to play again if they would like.
