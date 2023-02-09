/*
    Luke Nordheim
    Course: CSC 260L
    March 26, 2021
    Assignment: Lab 9
    Instructor: Doyle
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Program9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        int[] array = new int[20];
        int number = getArray(array, input);

        bubbleSort(array, number);

        int median = getMedian(array, number);
        System.out.println("The median value is " + median);
        double stepSize = getStep(array, number);
        System.out.println("The average step size is " + df.format(stepSize));
        int mostCommon = getMost(array, number);
        System.out.println("The most common element is " + mostCommon);
    }

    public static void bubbleSort(int[] list, int number) {
        boolean needNextPass = true;
        for (int k = 1; k < number && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < number - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static int getArray(int[] array, Scanner input) {
        System.out.print("Items: ");
        int number = 0;
        int value = input.nextInt();
        while (value != 0 && number < 20) {
            array[number] = value;
            number++;
            if (number == 20) {
                System.out.print("Error, too much data ");
                System.exit(0);
            }
            value = input.nextInt();
        }
        input.close();
        return number;
    }

    public static int getMedian(int[] array, int number) {
        int median = array[number/2];
        return median;
    }

    public static double getStep(int[] array, int number) {
        if (number <= 2) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < (number - 2); i++) {
            sum = sum + (array[i + 1] - array[i]);
        }
        double stepSize = sum / (number - 1);
        return stepSize;
    }

    public static int getMost(int[] array, int number) {
        int currentCount = 1;
        int maxCount = 1;
        int currentValue = array[0];
        int maxValue = array[0];
        for (int i = 1; i < (number - 1); i++) {
            if(array[i] == currentValue) {
                currentCount++;
                if(currentCount > maxCount) {
                    maxCount = currentCount;
                    maxValue = currentValue;
                }
            }
            else {
                currentValue = array[i];
                currentCount = 1;
            }
        }
        return maxValue;
    }
}

/*
Items: 153 100 532 100 534 154 153 100 101 153 155 153 100 193 154 153 0
The median value is 153
The average step size is 28.8
The most common element is 153

Items: 66 39 38 44 65 66 67 55 44 54 66 38 67 43 66 67 33 66 51 0
The median value is 55
The average step size is 1.89
The most common element is 66

Items: 10 15 19 3 7 15 4 6 19 6 15 12 9 7 15 16 10 11 8 15 21 6 15 0
Error, too much data
 */