/*
    Luke Nordheim
    Course: CSC 260L
    February 18, 2021
    Assignment: Lab 5
    Instructor: Doyle
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Program5A {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("$#,###.00");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the customer's type: ");
        char customerType = input.next().toLowerCase().charAt(0);
        System.out.print("Please enter the customer's minutes: ");
        int minutes = input.nextInt();
        double cost;
        if(customerType == 'r')
        {   // residential
            if(minutes <= 60 && minutes > 0)
            {
                cost = 5.00;
                System.out.print("The charge for your plan is " + df.format(cost));
            }
            else if(minutes > 60 && minutes <= 600)
            {
                cost = (minutes - 60 ) * (.10);
                System.out.print("The charge for your plan is " + df.format(cost));
            }
            else if(minutes < 0)
            {
                System.out.print("Invalid number of minutes");
            }
            else if(minutes > 600)
            {
                System.out.print("Invalid number of minutes");
            }
        }
        else if(customerType == 'c')
        {   //commercial
            if(minutes <= 300 && minutes > 0)
            {
                cost = (minutes * .20);
                System.out.print("The charge for your plan is " + df.format(cost));
            }
            else if(minutes > 300 && minutes < 600)
            {
                cost = (300 * .20) + ((minutes - 300) * .15);
                System.out.print("The charge for your plan is " + df.format(cost));
            }
            else if(minutes < 0)
            {
                System.out.print("Invalid number of minutes");
            }
            else if(minutes > 600)
            {
                System.out.print("Invalid number of minutes");
            }
        }
        else if(!(customerType == 'c' && customerType == 'r'))
        {
            System.out.print("Invalid client type");
        }
    }
}
