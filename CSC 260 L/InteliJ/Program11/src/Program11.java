/*
    Luke Nordheim
    Course: CSC 260L
    April 9, 2021
    Assignment: Lab 11
    Instructor: Doyle
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Program11 {

    // Reads in a file with lines of words, store in a 2-dimensional array
    public static String[][] getInput(String fileName) throws IOException
    {
        File file = new File(fileName);
        Scanner in = new Scanner(file);
        String [][] returnArray;

        // read row and columns of array
        int rows = in.nextInt();
        int columns = in.nextInt();
        returnArray = new String[rows][columns];

        // read in the 2-dimensional array of strings
        for (int i = 0; i < returnArray.length; i++)
            for (int j = 0; j < returnArray[0].length; j++)
                returnArray[i][j] = in.next();

        in.close();
        return returnArray;

    }

    // For each new name, if you find it then replace it OR increase the error count.
    // -->  You will write this method.
    public static void process(String fName, String[][] data) throws IOException
    {
        File file = new File(fName);
        Scanner in = new Scanner(file);

        int lineCount = 0, errorCount = 0;

        while (in.hasNext()) {
            int row = in.nextInt();
            int cols = in.nextInt();
            String str1 = in.next();
            String str2 = in.next();
            lineCount++;

            if (data[row][cols].equals(str1)) {
                data[row][cols] = str2;
            }
            else {
                errorCount++;
            }
        }

        System.out.printf("Read in %d lines and had %d errors comparing data to %s\n",
                lineCount, errorCount, fName);
        in.close();
    }

    // Print the final 2D array to a file.
    public static void output(String fname, String [][] data) throws IOException
    {
        File file = new File(fname);
        PrintWriter pw = new PrintWriter(file);

        for (String[] datum : data) {
            pw.println();
            for (int j = 0; j < datum.length; j++)
                pw.printf("%s\t", datum[j]);
        }

        pw.close();
    }

    // Ask for file names, read in and store then replace occurrences of names if
    // they are in the list.
    public static void main(String [] args)
    {
        String [][] data;
        Scanner sc = new Scanner(System.in);
        String startingFile, replaceFile, outputFile;

        System.out.print("What is your input file name? ");
        startingFile = sc.next();
        System.out.print("What is the name of your updated file? ");
        replaceFile = sc.next();
        System.out.print("What is the name of our output file? ");
        outputFile = sc.next();

        try {
            data = getInput(startingFile);
            process(replaceFile, data);  // You will write this  file.
            output(outputFile, data);
        } catch (IOException e) {
            System.out.println("File corrupted. Input Output error\n");
        }
        sc.close();
    }
}

/*
What is your input file name? input1.txt
What is the name of your updated file? input2.txt
What is the name of our output file? inputFinal.txt
Read in 37 lines and had 7 errors comparing data to input2.txt
 */
