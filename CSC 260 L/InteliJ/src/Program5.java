/*
    Luke Nordheim
    Course: CSC 260L
    February 18, 2021
    Assignment: Lab 5
    Instructor: Doyle
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Program5 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("$#,###.00");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the customer's type: ");
        char customerType = input.next().toLowerCase().charAt(0);
        System.out.print("Please enter the customer's minutes: ");
        int minutes = input.nextInt();
        double cost;

        if (customerType == 'r') {   // residential
            if (minutes <= 60 && minutes > 0) {
                cost = 5.00;
                System.out.print("The charge for your plan is " + df.format(cost));
            } else if (minutes > 60 && minutes <= 9000) {
                cost = 5 + ((minutes - 60) * (.10));
                System.out.print("The charge for your plan is " + df.format(cost));
            } else if (minutes < 0) {
                System.out.print("Invalid number of minutes");
            } else if (minutes > 9000) {
                System.out.print("Invalid number of minutes");
            }
        }
        else if (customerType == 'c') {   //commercial
            if (minutes < 300 && minutes > 0) {
                cost = (minutes * .20);
                System.out.print("The charge for your plan is " + df.format(cost));
            } else if (minutes >= 300 && minutes < 700) {
                char bonus = input.next().toLowerCase().charAt(0);
                System.out.print("Do you have the bonus (y/n)?: ");
                if(bonus == 'y'){
                    cost = ((300 * .20) + ((minutes - 300) * .15)) * .3;
                    System.out.print("The charge for your plan is " + df.format(cost));
                }
                else if(bonus == 'n'){
                    cost = (300 * .20) + ((minutes - 300) * .15);
                    System.out.print("The charge for your plan is " + df.format(cost));
                }
            } else if (minutes < 0) {
                System.out.print("Invalid number of minutes");
            } else if (minutes > 700) {
                System.out.print("Invalid number of minutes");
            }
        }
        else if (customerType == 'e') {   //educational
            if (minutes <= 700 && minutes > 0) {
                cost = (minutes * .18);
                System.out.print("The charge for your plan is " + df.format(cost));
            } else if (minutes < 0) {
                System.out.print("Invalid number of minutes");
            } else if (minutes > 700) {
                System.out.print("Invalid number of minutes");
            }
        }
        else if (customerType == 'p') {   //preferred
            if (minutes <= 500 && minutes > 0) {
                cost = 10 + (minutes * .06);
                System.out.print("The charge for your plan is " + df.format(cost));
            } else if (minutes > 500 && minutes <= 700) {
                cost = 10 + (500 * .06) + ((minutes - 500) * .04);
                System.out.print("The charge for your plan is " + df.format(cost));
            } else if (minutes < 0) {
                System.out.print("Invalid number of minutes");
            } else if (minutes > 700) {
                System.out.print("Invalid number of minutes");
            }
        }
        else
        {
            System.out.print("Invalid client type");
        }
    }
}
/*

if (!(customerType == 'c' && customerType == 'r' && customerType == 'e' && customerType == 'p'))
*** is broken c value when asking about bonus

Please enter the customer's type: c
Please enter the customer's minutes: 150
The charge for your plan is $30.00

Please enter the customer's type: e
Please enter the customer's minutes: 271
The charge for your plan is $48.78

Please enter the customer's type: e
Please enter the customer's minutes: 0

Please enter the customer's type: p
Please enter the customer's minutes: -10
Invalid number of minutes

Please enter the customer's type: p
Please enter the customer's minutes: 315
The charge for your plan is $28.90

Please enter the customer's type: r
Please enter the customer's minutes: 28
The charge for your plan is $5.00

Please enter the customer's type: r
Please enter the customer's minutes: 423
The charge for your plan is $41.30

***

Please enter the customer's type: t
Please enter the customer's minutes: 200
Invalid client type

Please enter the customer's type: c
Please enter the customer's minutes: 205
The charge for your plan is $41.00

***

Please enter the customer's type: p
Please enter the customer's minutes: 626
The charge for your plan is $45.04

Please enter the customer's type: e
Please enter the customer's minutes: 10583
Invalid number of minutes

Please enter the customer's type: p
Please enter the customer's minutes: 45
The charge for your plan is $12.70

Please enter the customer's type: r
Please enter the customer's minutes: 8301
The charge for your plan is $829.10

***

Please enter the customer's type: a
Please enter the customer's minutes: 200
Invalid client type

***

 */
