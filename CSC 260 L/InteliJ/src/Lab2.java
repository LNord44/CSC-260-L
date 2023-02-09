/*
    Luke Nordheim
    Course: CSC 260L
    January 28, 2020
    Assignment: Lab 2
    Instructor: Doyle

 */

import java.text.DecimalFormat;
import java.util.Date;



public class Lab2 {
    public static void main( String[] args )
    {
        DecimalFormat df = new DecimalFormat("$#,###.00");
        Date date = new Date();

        int length, width, nStories;
        int baseCost, totalCost;
        double squareFootCost1, squareFootCost2, average;
        String clientName = "Frank Zappa";

        length= 510;
        width= 722;
        nStories= 9;
        baseCost= 950000;
        totalCost= 169583110;

        squareFootCost1= (totalCost- baseCost)/(width * length * nStories);

        System.out.println("Date of estimate: " + date + " for " + clientName + "\n\n");
        System.out.println("The cost per square foot of floor space for a "
                +length + " by " + width + " building");
        System.out.println("of " + nStories + " stories with a base cost of "
                +baseCost + " and a total cost of " + totalCost
                +" is " + df.format(squareFootCost1) + ".\n");

        length= 251;
        width= 161;
        nStories= 1;
        baseCost= 100000;
        totalCost= 281475;

        squareFootCost2= (totalCost- baseCost)/(width * length * nStories);

        System.out.println("The cost per square foot of floor space for a "
                +length + " by " + width + " building");
        System.out.println("of " + nStories + " stories with a base cost of "
                +baseCost + " and a total cost of " + totalCost
                +" is " + df.format(squareFootCost2) + ".");

        average= (squareFootCost1 + squareFootCost2)/2;
        System.out.println("\n\n" + df.format(average));


    }
}
/*
Date of estimate: Thu Jan 28 21:51:32 EST 2021 for Frank Zappa


The cost per square foot of floor space for a 510 by 722 building
of 9 stories with a base cost of 950000 and a total cost of 169583110 is $50.00.

The cost per square foot of floor space for a 251 by 161 building
of 1 stories with a base cost of 100000 and a total cost of 281475 is $4.00.


$27.00

Process finished with exit code 0
 */
