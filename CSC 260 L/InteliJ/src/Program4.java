/*
    Luke Nordheim
    Course: CSC 260L
    February 11, 2021
    Assignment: Lab 4
    Instructor: Doyle

 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Program4 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("$#,###.00");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the customer's age: ");
        long age = input.nextLong();

        double ticketPrice = 30;
        double seniorDiscount = (ticketPrice * .5);

        double childrenDiscount = 0;

        double newTicketPrice = 40;
        double newSeniorDiscount = newTicketPrice * .5;

        double youthClermontPrice = newTicketPrice * .18;
        double seniorCampbellPrice = newSeniorDiscount * .075;

        System.out.print("Please enter the customer’s county: ");
        String county = input.next();

        if (county.equalsIgnoreCase("Warren")) {
            if (age < 0) {
                System.out.println("Sorry but this is not a recognized age!");
                System.exit(0);
            }
            else if (age >= 65) {
                System.out.print("Ticket price is " + df.format(seniorDiscount));
            }
            else if (age < 5) {
                System.out.print("Ticket price is " + df.format(childrenDiscount));
            }
            else {
                System.out.print("Ticket price is " + df.format(ticketPrice));
            }
        }

        else if (county.equalsIgnoreCase("Clermont") && age <= 14) {
            System.out.print("Ticket price is " + df.format(youthClermontPrice));
        }

        else if (county.equalsIgnoreCase("Campbell") && age >= 65) {
            System.out.print("Ticket price is " + df.format(seniorCampbellPrice));
        }

        else {
            if (age < 0) {
                System.out.println("Sorry but this is not a recognized age!");
                System.exit(0);
            }
            else if (age >= 65) {
                System.out.print("Ticket price is " + df.format(newSeniorDiscount));
            }
            else if (age < 5) {
                System.out.print("Ticket price is " + df.format(childrenDiscount));
            }
            else {
                System.out.print("Ticket price is " + df.format(newTicketPrice));
            }
        }

    }
}
/*
Please enter the customer's age: 12
Please enter the customer’s county: Hamilton
Ticket price is $40.00

Please enter the customer's age: 72
Please enter the customer’s county: Hamilton
Ticket price is $20.00

Please enter the customer's age: 2
Please enter the customer’s county: Kenton
Ticket price is $.00

Please enter the customer's age: 0
Please enter the customer’s county: Warren
Ticket price is $.00

Please enter the customer's age: 35
Please enter the customer’s county: Clermont
Ticket price is $40.00

Please enter the customer's age: 4
Please enter the customer’s county: Butler
Ticket price is $.00

Please enter the customer's age: 24
Please enter the customer’s county: Warren
Ticket price is $30.00

Please enter the customer's age: 65
Please enter the customer’s county: Campbell
Ticket price is $1.50

Please enter the customer's age: 10
Please enter the customer’s county: Clermont
Ticket price is $7.20

Please enter the customer's age: 21
Please enter the customer’s county: Campbell
Ticket price is $40.00

Please enter the customer's age: -15
Please enter the customer’s county: Hamilton
Sorry but this is not a recognized age!

Please enter the customer's age: 13
Please enter the customer’s county: Kenton
Ticket price is $40.00

Luke Nordheim
 */