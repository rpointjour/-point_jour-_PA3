package com.jetbrains;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void learnMult () {       // Method for generating questions

        int answer = 0;
        Random r = new Random();        // Declare random variable r
        Scanner in = new Scanner(System.in);
        int num1 = r.nextInt(10);   // Set num1 to be a positive one-digit integer
        int num2 = r.nextInt(10);   // Set num2 to be a positive one-digit integer

        System.out.println("How much is "+num1 +" times "+num2 +" ?");
        answer =in.nextInt();

        if(answer ==(num1*num2))

        {
            System.out.println("Very good!");
            learnMult();
        }
        else

        {
            while (answer != (num1 * num2)) {
                System.out.println("No. Please try again.");
                answer = in.nextInt();
            }
            learnMult();
        }

    }
    public static void main(String[] args)  // Main method
    {
        learnMult();
    }
}
