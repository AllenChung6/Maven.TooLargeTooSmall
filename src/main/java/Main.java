import java.util.Random;


public class Main {
    public int guess;
    public static int answer;


    public boolean checkNumber(int guess) {
        if (guess==answer){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        answer = rand.nextInt(50);



        //System.out.println("Lets play a guessing game!");
        //System.out.println("Try to guess a number from 0 - 50, please!");

    }

}