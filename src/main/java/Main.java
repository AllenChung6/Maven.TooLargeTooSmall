import java.util.Random;
import java.util.*;

public class Main {
    public static int guess;
    public static int answer;


    public boolean checkNumber(int guess) {
        while (true) {
            if (guess == answer) {
                System.out.println("You guessed right! The number is:" + answer);
                return true;
            } else {
                System.out.println("You guessed wrong! Try guessing another number");
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        answer = rand.nextInt(50);

        System.out.println("Lets play a guessing game!");
        System.out.println("Try to guess a number from 0 - 50, please!");
        Scanner scan1 = new Scanner(System.in);
        guess = scan1.nextInt();

        Main obj1 = new Main();
        obj1.checkNumber(guess);

    }

}