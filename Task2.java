import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number of subjects");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the marks in subject" + i);
            int x = sc.nextInt();
            sum = sum + x;
        }

        int avg = sum / n;
        System.out.println("Total Marks: " + sum);
        System.out.println("Average marks: " + avg);
        if (avg > 10 && avg < 40) {
            System.out.println("Grade C");
        } else if (avg > 40 && avg < 60) {
            System.out.println("Grade B");
        } else if (avg > 60 && avg < 80) {
            System.out.println("Grade A");
        } else {
            System.out.println("Grade A+");
        }

    }
}
