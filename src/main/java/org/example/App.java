package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 13 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App
{
    public static void main( String[] args ) //main function
    {
        Scanner userInput = new Scanner(System.in);

        //declare the variables that will be used in convertion
        Double principal;
        Double rate;
        double year;
        double comp;



        //scan all the numbers
        System.out.println("What is the principal amount? " );
        principal = userInput.nextDouble(); //scan the input
        System.out.println("What is the rate? " );
        rate = userInput.nextDouble(); //scan the input
        System.out.println("What is the number of years? " );
        year = userInput.nextDouble(); //scan the input
        System.out.println("What is the number of times the interest is compounded per year? " );
        comp = userInput.nextDouble(); //scan the input

        //math operations
        double ratePer = (rate / 100);
        double base = (1 + (ratePer / comp));
        double power = (comp * year);
        double powerF = Math.pow(base, power);
        double interest = principal*(powerF);

        //round up the cents for final interest
        double interestR = Math.floor(interest*100)/100;

        //print output
        System.out.println("$" + principal + " invested at " + rate + "% for " +
                year + " years compounded " + comp + " times per year is $" +
                interestR + ".");
    }
}