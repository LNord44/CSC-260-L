/*
    Luke Nordheim
    Course: CSC 260L
    February 25, 2021
    Assignment: Lab 6
    Instructor: Doyle
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Program6A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("Enter your target number: ");
        int target = input.nextInt();
        int targetCount = 0;

        System.out.print("Enter an integer value (0 to quit): ");
        int value = input.nextInt();

        int sum = 0;
        int count = 0;
        double average;
        int oddCount = 0;
        int max = Integer.MIN_VALUE;

        while (value != 0) {
            count++;
            sum += value;
            System.out.print("Enter next value (0 to quit): ");
            value = input.nextInt();
            if (!(value % 2 == 0)){
                oddCount++;
            }
            if (value == target) {
                targetCount++;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.println("\nThe sum of the entered values is " + sum);
        System.out.println("The number of inputs is " + count);
        if (count > 0) {
            average = (double) sum / count;
            System.out.print("The average of the input values is " + df.format(average));
        }
        else if (count == 0) {
            System.out.print("The average is undefined");
        }
        System.out.println("\nThe number of odd values input is " + oddCount);
        System.out.println("The value " + target + " was input " + targetCount + " times");
        System.out.println("The maximum value entered was " + max);

        input.close();
    }
}

//average not = with more decimal spaces, 1 not counted with odds

/*
The sum of the entered values is 83
The number of inputs is 13
The average of the input values is 6.38
The number of odd values input is 6
The value 10 was input 3 times
The maximum value entered was 11


 */