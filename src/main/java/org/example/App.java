/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double total = 0.00, tax = 0.00;
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        total = input.nextInt();

        input.nextLine();
        System.out.print("What state do you live in? ");
        String state = input.nextLine();

        System.out.print("What county do you live in? ");
        String county = input.nextLine();

        if (state.equalsIgnoreCase("Wisconsin"))
        {
            tax = 0.50;

            if (county.equalsIgnoreCase("Eau Claire"))
                tax = tax + 0.05;
            else if (county.equalsIgnoreCase("Dunn"))
                tax = tax + 0.04;

            total = total + tax;
            System.out.printf("The tax is $%.2f.\n", tax);
        }
        else if (state.equalsIgnoreCase("Illinois"))
        {
            tax = 0.80;
            total = total + tax;
            System.out.printf("The tax is $%.2f.\n", tax);
        }

        System.out.printf("The total is $%.2f.", total);
    }
}