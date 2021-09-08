package Ex13;

import java.text.NumberFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle: ");
        double principal = input.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = input.nextDouble()/100;
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();
        System.out.println("What is the number of times the interest is compound per year?");
        int compound = input.nextInt();

        double worth = principal*Math.pow((1+(rate/compound)),(compound*years));

        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        System.out.println("$"+principal+" invested at "+ rate +"% for "+ years+" compounded "+ compound+" times per year is "+defaultFormat.format(worth)+".");
    }
}