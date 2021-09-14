package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = in.nextDouble();
        System.out.println("Enter the second number: ");
        double b = in.nextDouble();
        System.out.println("Enter the third number: ");
        double c = in.nextDouble();
        double largest = 0;
        if (a > b && a > c)
            largest = a;
        if (b > a && b > c)
            largest = b;
        if (c > a && c > b)
            largest = c;
        System.out.printf("The largest number is %.02f", largest);
    }
}
