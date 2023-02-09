/*
    Luke Nordheim
    Course: CSC 260L
    April 6th, 2021
    Assignment: Lab 10
    Instructor: Doyle
 */

import java.util.Scanner;
import java.lang.Math;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        System.out.print("Enter the value of c: ");
        int c = input.nextInt();
        input.close();

        if (a == 0) {
            System.out.println("This is not a quadratic equation");
            System.exit(0);
        }

        double root1, root2;
        double discriminant;

        discriminant = computeDiscriminant(a, b, c);

        if (discriminant == Double.NaN) {
            System.out.println("This equation has no roots");
            System.exit(0);
        }
        else {
            root1 = computeRoot(discriminant, a, b, '+');
            root2 = computeRoot(discriminant, a, b, '-');

            System.out.print(root1 + "\n");
            System.out.print(root2);
        }
    }

    public static double computeDiscriminant(int a, int b, int c) {
        int temp = b * b - 4 * a * c;
        double disc = Math.sqrt(temp);
        return disc;
    }

    public static double computeRoot(double discriminant, int a, int b, char sign) {
        double num, denom;
        denom = 2 * a;
        if (sign == '+') {
            num = -b + discriminant;
        }
        else {
            num = -b - discriminant;
        }
        return num/denom;
    }
}
