package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.printf("Enter a 1 is you are male or a 2 if you are female: ");
        String choice = reader.nextLine();

        float bac = 0;

        if(choice.equals("1")) {
            System.out.printf("How many ounces of alcohol did you have? ");
            String ounce = reader.nextLine();

            System.out.printf("What is your weight, in pounds? ");
            String weight = reader.nextLine();

            System.out.printf("How many hours has it been since your last drink? ");
            String hour = reader.nextLine();

            //int gen = Integer.parseInt(choice);
            float oz = Float.parseFloat(ounce);
            float lb = Float.parseFloat(weight);
            int t = Integer.parseInt(hour);

            bac = (float) ((oz * 5.14 / lb * 0.73) - 0.015 * t);
            System.out.printf("\nYour BAC is %f.", bac);
        }
        else if (choice.equals("2")) {
            System.out.printf("How many ounces of alcohol did you have? ");
            String ounce = reader.nextLine();

            System.out.printf("What is your weight, in pounds? ");
            String weight = reader.nextLine();

            System.out.printf("How many hours has it been since your last drink? ");
            String hour = reader.nextLine();

            //int gen = Integer.parseInt(choice);
            float oz = Float.parseFloat(ounce);
            float lb = Float.parseFloat(weight);
            int t = Integer.parseInt(hour);

            bac = (float) ((oz * 5.14 / lb * 0.66) - 0.015 * t);
            System.out.printf("\nYour BAC is %f.", bac);
        }
        // If the user enters an nonint
        else {
            System.out.printf("Please enter an integer.");
        }

        if(bac < 0.08) {
            System.out.printf("\nIt is legal for you to drive.");
        }
        else {
            System.out.printf("\nIt is not legal for you to drive.");
        }
    }
}