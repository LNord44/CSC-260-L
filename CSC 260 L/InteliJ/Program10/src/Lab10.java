/*
    Luke Nordheim
    Course: CSC 260L
    April 6th, 2021
    Assignment: Lab 10
    Instructor: Doyle
 */

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = new int[5];
        int num = 0;
        int max = 0;

        while (num < 5) {
            System.out.print("Enter your value for element " + num + " in list:");
            list[num] = input.nextInt();
            num++;
        }

        for (int i = 0; i < num; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        System.out.print(max);
    }
}
/*
1. I fixed this error by removing the less than AND EQUAl to in the loops.  I didn't need break points because it is not variable based.

2. No, the problem with this is that I set max equal to zero and zero is greater than all negative numbers.  I inserted my breakpoints on the for loop.

3. The debugger helps me watch the execution of my variables.  This can help me fix problems related to how my loops are running.  It can help me fix runtime errors.

4. It lets me see the values of my variables.

5. It is good to place breakpoints in areas that show how your variables are changing.
 */
