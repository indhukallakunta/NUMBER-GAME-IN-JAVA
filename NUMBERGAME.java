import java.util.*;
public class randomex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random R=new Random();
        int number=R.nextInt(100)+1;
        int guess=0;
        int attempts=0, maxAttempts=5;
        System.out.println("enter a number between 1 and 100:");
          while (attempts < maxAttempts) {
            guess = sc.nextInt();
            attempts++;
            if (guess == number) {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            } else if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }
        if (attempts == maxAttempts) {
            System.out.println("Out of attempts! The number was: " + number);
        }
        while(guess!=number){
            guess = sc.nextInt();
            if (guess==number)
            System.out.println("That's correct guess");
            else if (guess>number)
            System.out.println("It's too high");
            else
            System.out.println("It's too low");
        }
        sc.close();
    }
}