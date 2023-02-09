/*
    Luke Nordheim
    Course: CSC 260L
    February 11, 2021
    Assignment: Lab 4
    Instructor: Doyle

 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Program4B {
    public static void main( String[] args )
    {
        DecimalFormat df = new DecimalFormat("$#,###.00");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the customer's age: ");
        long age = input.nextLong();
        double ticketPrice = 30;
        double seniorDiscount = (ticketPrice * .5);
        double childrenDiscount = 0;
        System.out.print("Please enter the customer’s county: ");
        String county = input.next();
        if(county.equalsIgnoreCase("Warren"))
        {
            if(age >= 65)
            {
                System.out.print("Ticket price is " + df.format(seniorDiscount));
            }
            else if(age < 5)
            {
                System.out.print("Ticket price is " + df.format(childrenDiscount));
            }
            else
            {
                System.out.print("Ticket price is " + df.format(ticketPrice));
            }
        }
        else
        {
            double newTicketPrice = 40;
            double newSeniorDiscount = (newTicketPrice * .5);
            if(age >= 65)
            {
                System.out.print("Ticket price is " + df.format(newSeniorDiscount));
            }
            else if(age < 5)
            {
                System.out.print("Ticket price is " + df.format(childrenDiscount));
            }
            else
            {
                System.out.print("Ticket price is " + df.format(newTicketPrice));
            }
        }

    }
}