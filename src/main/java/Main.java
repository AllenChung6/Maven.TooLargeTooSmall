import java.util.Random;
import java.util.*;

public class Main {
    public static int guess;
    public static int answer;
    public static int numberOfGuesses;


    public void checkNumber() {

        Scanner scan1 = new Scanner(System.in);

        while (guess != answer) {
            numberOfGuesses++;
            System.out.print("Try to guess a number from 0 - 50, please!");
            guess = scan1.nextInt();
            if (guess == answer) {
                System.out.println("You got the right number! The number is: " + answer);
                System.out.println("It took you " + numberOfGuesses + " guesses!");
            } else if (guess < answer) {
                System.out.println("Your guess is smaller than the number.");
            } else if (guess > answer) {
                System.out.println("Your guess is greater than the number.");
            }
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        answer = rand.nextInt(50);

        System.out.println("Lets play a guessing game!");

        Main obj1 = new Main();
        obj1.checkNumber();
    }

}