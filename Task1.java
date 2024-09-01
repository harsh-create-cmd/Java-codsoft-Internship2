import java.util.*;
import java.io.*;

public class Task1a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        // Generating randomn numbers between 0 and 100
        int r1 = rd.nextInt(1, 100);
        System.out.println(r1);
        int c = 0;
        System.out.println("Enter the max limit of attempts");
        int attempts = sc.nextInt();
        int score = 0;

        boolean f = true;
        while (c <= attempts) {

            System.out.println("User needs to guess the value between 1 and 100");
            int x = sc.nextInt();
            c++;
            if (x < r1) {
                System.out.println(" The  Value guessed is  low");
                score = score - 1;// for every incorrect answer 1 point will be deducted
                System.out.println("Your current score" + score);
            } else if (x > r1) {
                System.out.println(" The Value guessed is  high");
                score = score - 1;
                System.out.println("Your current score" + score);

            } else {
                score = score + 2;// for correct answer you will get 2 points

                System.out.println("Your guess is correct");
                System.out.println("Your current score" + " " + score);
            }
        }
        System.out.println("You have played" + " " + c + " " + "times");

        System.out.println("You have exceeded number of attempts and you scored" + " " + score);

    }

}
