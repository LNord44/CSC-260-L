/*
    Luke Nordheim
    Course: CSC 260L
    February 25, 2021
    Assignment: Lab 6
    Instructor: Doyle
 */

import java.util.Scanner;
import java.lang.Math;

public class Program6B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want the powers of? ");
        int n = input.nextInt();

        System.out.println("n\t\tn^2\t\tn^3\t\tn^4");

        for (int j = 1; j <= n; j++) {
            System.out.println(j + "\t\t" + (int) Math.pow(j,2) + "\t\t" + (int) Math.pow(j,3) + "\t\t" + (int) Math.pow(j,4));
        }
        input.close();
    }
}
//why are your outputs weird

/*
How many numbers do you want the powers of? 5
n		n^2		n^3		n^4
1		1		1		1
2		4		8		16
3		9		27		81
4		16		64		256
5		25		125		625


 */