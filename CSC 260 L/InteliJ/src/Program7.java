/*
    Luke Nordheim
    Course: CSC 260L
    March 4, 2021
    Assignment: Lab 7
    Instructor: Doyle
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Program7 {
    public static int getSize(String dimension, Scanner input) {
        System.out.print("Enter the " + dimension + " of the room: ");
        int value = input.nextInt();
        return value;
    }

    public static String getColor(Scanner input) {
        System.out.print("Enter the color of the room: ");
        String color = input.next();
        return color;
    }

    public static int getPaintCans(int height, int width, int length) {
        int squareFootage = (length * width) + (height * length) + (height * length) + (height * width) + (height * width);
        double numCans = (double) squareFootage / 365;
        numCans = Math.ceil(numCans);
        return (int) numCans;
    }

    public static double getCost(int numCans, String color) {
        double cost = 0;
        if (color.equalsIgnoreCase("Green")) {
            if (numCans > 10) {
                cost = (numCans * 3.68) - ((numCans * 3.68) * .1);
            }
            else {
                cost = numCans * 3.68;
            }
        }
        if (color.equalsIgnoreCase("Orange")) {
            if (numCans > 10) {
                cost = (numCans * 4.25) - ((numCans * 4.25) * .1);
            }
            else {
                cost = numCans * 4.25;
            }
        }
        if (color.equalsIgnoreCase("Mauve")) {
            if (numCans > 10) {
                cost = (numCans * 3.69) - ((numCans * 3.69) * .1);
            }
            else {
                cost = numCans * 3.69;
            }
        }
        if (color.equalsIgnoreCase("Eggshell")) {
            if (numCans > 10) {
                cost = (numCans * 4.25) - ((numCans * 4.25) * .1);
            }
            else if (numCans < 10 || numCans >= 5) {
                cost = (numCans * 4.25) - ((numCans * 4.25) * .06);
            }
            else {
                cost = numCans * 4.25;
            }
        }
        if (color.equalsIgnoreCase("White")) {
            if (numCans > 10) {
                cost = (numCans * 3.25) - ((numCans * 3.25) * .1);
            }
            else if (numCans < 10 || numCans >= 5) {
                cost = (numCans * 3.25) - ((numCans * 3.25) * .06);
            }
            else {
                cost = numCans * 3.25;
            }
        }
        if (color.equalsIgnoreCase("Other")) {
            if (numCans > 10) {
                cost = (numCans * 6.00) - ((numCans * 6.00) * .1);
            }
            else if (numCans < 10 || numCans >= 5) {
                cost = (numCans * 6.00) - ((numCans * 6.00) * .04);
            }
            else {
                cost = numCans * 6.00;
            }
        }
        else {
            System.out.print("Incompatible color");
            System.exit(0);
        }
        return cost;
    }

    public static void finalOutput(int height, int width, int length, int numCans, String color, double cost) {
        DecimalFormat df = new DecimalFormat("$#,###.00");
        System.out.print("Height: " + height + " Length: " + length + " Width: " + width + " Color: " + color + " Num Cans: " + numCans + " Cost: " + df.format(cost));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dimension;

        int height = getSize("height", input);
        int length = getSize("length", input);
        int width = getSize("width", input);
        String color = getColor(input);
        input.close();
        int numCans = getPaintCans(height, width, length);
        double cost = getCost(numCans, color);
        finalOutput(height, width, length, numCans, color, cost);
    }
}
/*
Enter the height of the room: 18
Enter the length of the room: 20
Enter the width of the room: 25
Enter the color of the room: green
Height: 18 Length: 20 Width: 25 Color: green Num Cans: 6 Cost: $22.08

Enter the height of the room: 12
Enter the length of the room: 16
Enter the width of the room: 14
Enter the color of the room: orange
Height: 12 Length: 16 Width: 14 Color: orange Num Cans: 3 Cost: $12.75

Enter the height of the room: 12
Enter the length of the room: 22
Enter the width of the room: 20
Enter the color of the room: white
Height: 12 Length: 22 Width: 20 Color: white Num Cans: 4 Cost: $12.22

Enter the height of the room: 30
Enter the length of the room: 85
Enter the width of the room: 40
Enter the color of the room: eggshell
Height: 30 Length: 85 Width: 40 Color: eggshell Num Cans: 30 Cost: $114.75

Enter the height of the room: 10
Enter the length of the room: 19
Enter the width of the room: 33
Enter the color of the room: mauve
Height: 10 Length: 19 Width: 33 Color: mauve Num Cans: 5 Cost: $18.45

Enter the height of the room: 9
Enter the length of the room: 66
Enter the width of the room: 56
Enter the color of the room: blue
Incompatible color

Enter the height of the room: 16
Enter the length of the room: 28
Enter the width of the room: 22
Enter the color of the room: white
Height: 16 Length: 28 Width: 22 Color: white Num Cans: 7 Cost: $21.39

Enter the height of the room: 24
Enter the length of the room: 35
Enter the width of the room: 20
Enter the color of the room: black
Incompatible color

 */