/*
    Luke Nordheim
    Course: CSC 260L
    February 11, 2021
    Assignment: Lab 4
    Instructor: Doyle

 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Program4A {
    public static void main( String[] args )
    {
        DecimalFormat df = new DecimalFormat("$#,###.00");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the customer's age: ");
        long age = input.nextLong();
        double ticketPrice = 30;
        double seniorDiscount = (ticketPrice * .5);
        if(age >= 65)
        {
            System.out.print("Ticket price is " + df.format(seniorDiscount));
        }
        else
        {
            System.out.print("Ticket price is " + df.format(ticketPrice));
        }
    }
}
