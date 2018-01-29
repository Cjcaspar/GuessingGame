package com.company;

public class MessageUtils {

    public static void equals(int i){
        System.out.println("Congratulations, you have guessed correctly on attempt number: " + (i + 1) + "\n");
    }
    //Output to user if they guessed number correctly
    public static void higher(){
        System.out.println("Your guess was higher than my number\n");
    }
    //output to user if they guess higher than random number
    public static void lower(){
        System.out.println("Your guess was lower than my number\n");
    }
    //output to user if they guess lower than random number
    public static void invalidInput(){
        System.out.println("That is not a valid input. please try entering a number between 1 and 100");
    }
    //output to user if they input data that causes an exception
    public static void instructions(int numGuess){
        System.out.println("I will generate a number between 1 and 100. You will guess the number and I will tell you if your number is higher or lower than the generated number. You have " + numGuess + "chances to correctly guess my number. \n \n");
    }
    //output to user telling them how to play the game
    public static void guessNumber(int guess){
        System.out.println("Guess number " + (guess + 1) + ":");
    }
    // output to user telling them how many guesses they have used
    public static void wrong(int num){
        System.out.println("Better luck next time! My number was: " + num + "\n");
    }
    //output to user if they fail to guess within the limit number of guesses.
    public static void playAgain(){
        System.out.println("Do you wish to play again? \n\nPress the y character, then enter to play again.\nPress the n key then enter to close.\n");
    }
    //output to user asking them if they wish to play again
    public static void close(){
        System.out.println("Could not read input. Please enter 'y' or 'n'");
    }
    //output to user telling them that the program will close
    public static void selectDifficulty(){
        System.out.println("Which difficulty do you wish to play? enter 1 for easy, 2 for medium, or 3 for hard.");
    }
    //output to user instructing them how to select a difficulty
    public static void difficultyError(){
        System.out.println("That input does not correspond to a difficulty level. Please try again.");
    }
    //output to user, telling them that their input is invalid
}
