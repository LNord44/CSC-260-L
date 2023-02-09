/*
    Luke Nordheim
    Course: CSC 260L
    February 4, 2021
    Assignment: Lab 3
    Instructor: Doyle

 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Program3 {
    public static void main( String[] args )
    {
        DecimalFormat df = new DecimalFormat("$##.#");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String fullName = input.next();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        System.out.print("Enter total price for fill up: ");
        double fillUp = input.nextDouble();
        System.out.print("Enter initial odometer value: ");
        int initialDistance = input.nextInt();
        System.out.print("Enter final odometer value: ");
        int finalDistance = input.nextInt();
        System.out.print("\n\n");

        int totalDistance = finalDistance - initialDistance;
        double gasUsed = fillUp / pricePerGallon;
        double mileageAchieved = totalDistance / gasUsed;

        System.out.println(fullName + ", you drove " + totalDistance + " miles using " + df.format(gasUsed) + " gallons with a mpg of " + df.format(mileageAchieved));

        input.close();

    }
}

/*
Enter your name: Luke
Enter price per gallon: 2.84
Enter total price for fill up: 20.25
Enter initial odometer value: 6144
Enter final odometer value: 6279

Luke, you drove 135 miles using 7.1 gallons with a mpg of 18.9

Enter your name: Frank
Enter price per gallon: 1.72
Enter total price for fill up: 31.40
Enter initial odometer value: 21975
Enter final odometer value: 22496


Frank, you drove 521 miles using 18.3 gallons with a mpg of 28.5

Enter your name: Ruth
Enter price per gallon: 3.75
Enter total price for fill up: 22.87
Enter initial odometer value: 89108
Enter final odometer value: 89183


Ruth, you drove 75 miles using 6.1 gallons with a mpg of 12.3

Enter your name: Gail
Enter price per gallon: 2.05
Enter total price for fill up: 20.50
Enter initial odometer value: 65380
Enter final odometer value: 65691


Gail, you drove 311 miles using 10 gallons with a mpg of 31.1
 */