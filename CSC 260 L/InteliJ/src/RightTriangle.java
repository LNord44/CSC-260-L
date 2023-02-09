/*
    Luke Nordheim
    Course: CSC 260L
    April 15, 2021
    Assignment: Lab 12
    Instructor: Doyle
 */

import java.lang.Math;
import java.text.DecimalFormat;

public class RightTriangle {
    DecimalFormat df = new DecimalFormat("#.##");
    private double sideA, sideB;

    public void getSide(double a, double b) {
        sideA = a;
        sideB = b;
    }

    public void setSide() {
        sideA = 0;
        sideB = 0;
    }

    public double getHyp(double sideA, double sideB) {
        double hyp = Math.sqrt((sideA * sideA) + (sideB * sideB));
        return hyp;
    }

    public double getAngleA(double sideA, double hyp) {
        double angleA = Math.asin(sideA / hyp);
        return Math.toDegrees(angleA);
    }

    public double getAngleB(double sideB, double hyp) {
        double angleB = Math.asin(sideB / hyp);
        return Math.toDegrees(angleB);
    }

    public double getPerimeter(double sideA, double sideB) {
        double perimeter = sideA + sideB + getHyp(sideA, sideB);
        return perimeter;
    }

    public double getArea(double sideA, double sideB) {
        double area = .5 * sideA * sideB;
        return area;
    }

    public String toString() {
        return df.format(sideA) + " " + df.format(sideB) + " " + df.format(getHyp(sideA, sideB)) + " " + df.format(getPerimeter(sideA, sideB)) + " " + df.format(getArea(sideA, sideB));
    }

    public double setSideA(double newA) {
        if (newA >= 0) {
            sideA = newA;
        }
        return sideA;
    }

    public double setSideB(double newB) {
        if (newB >= 0) {
            sideB = newB;
        }
        return sideB;
    }
}