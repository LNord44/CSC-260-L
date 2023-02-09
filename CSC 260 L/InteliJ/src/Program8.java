/*
    Luke Nordheim
    Course: CSC 260L
    March 18, 2021
    Assignment: Lab 8
    Instructor: Doyle
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Program8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Number of items: ");
        int num = input.nextInt();

        if (num <= 1 || num >= 100) {
            System.out.print("ERROR, incorrect range of numbers");
            System.exit(0);
        }
        int[] numbers = getArray(num, input);
        double average = getAverage(num, numbers);
        System.out.print("The average of the array is " + average + "\n");
        double standDev = getSD(num, numbers, average);
        System.out.print("The standard deviation of the " + num + " values in the array is " + df.format(standDev) + "\n");
        int lessThanAverage = getLessAverage(numbers, average);
        System.out.print("The number of values in the array less than the average is " + lessThanAverage + "\n");
        boolean sortedOrder = sortedArray(numbers);
    }

    public static int[] getArray(int num, Scanner input) {
        System.out.print("Items: ");
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
    public static double getAverage(int num, int[] numbers) {
        double total = 0;
        for(int i=0; i<numbers.length; i++){
            total = total + numbers[i];
        }
        total = total / num;
        return total;
    }
    public static double getSD(int num, int[] numbers, double average) {
        double sum = 0;
        double stdDev = 0;
        for(int i =0; i < (numbers.length - 1); i++) {
            sum = sum + Math.pow(numbers[i] - average, 2);
        }
        if (numbers.length <  2) {
            return -1000;
        }
        else {
            stdDev = Math.sqrt(sum / (numbers.length - 1));
        }
        return stdDev;
    }
    public static int getLessAverage(int[] numbers, double average) {
        int counter = 0;
        for(int i=0; i<numbers.length; i++){
            if (numbers[i] < average) {
                counter = counter + 1;
            }
        }
        return counter;
    }
    public static boolean sortedArray(int[] numbers) {
        for (int i = 0; i<(numbers.length - 2); i++) {
            if (numbers[i] > numbers[i + 1]) {
                System.out.print("Array is not in sorted order");
                return false;
            }
        }
        System.out.print("Array is in sorted order");
        return true;
    }
}
/*
Number of items: 5
Items: 16 25 81 80 24
The average of the array is 45.2
The standard deviation of the 5 values in the array is 30.63
The number of values in the array less than the average is 3
Array is not in sorted order

Items: 1000 1001 1111 1222 1775 1776 1777 1888 1997 1998
The average of the array is 1554.5
The standard deviation of the 10 values in the array is 390.91
The number of values in the array less than the average is 4
Array is in sorted order

Number of items: 1
ERROR, incorrect range of numbers

Number of items: 10
Items: 1 2 3 9 8 7 4 6 12 15
The average of the array is 6.7
The standard deviation of the 10 values in the array is 3.52
The number of values in the array less than the average is 5
Array is not in sorted order

Number of items: 0
ERROR, incorrect range of numbers

Number of items: 20
Items: 21 3 20 5 30 1 33 14 17 18 10 4 48 50 22 25 6 47 8 19
The average of the array is 19.25
The standard deviation of the 20 values in the array is 15.68
The number of values in the array less than the average is 11
Array is not in sorted order

Number of items: 10
Items: 8 7 8 7 8 7 9 8 9 7
The average of the array is 7.8
The standard deviation of the 10 values in the array is 0.74
The number of values in the array less than the average is 4
Array is not in sorted order
 */