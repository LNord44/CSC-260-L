/*
    Luke Nordheim
    Course: CSC 260L
    April 15, 2021
    Assignment: Lab 12
    Instructor: Doyle
 */

import java.text.DecimalFormat;

public class Program12 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        RightTriangle triangle1 = new RightTriangle();
        RightTriangle triangle2 = new RightTriangle();
        RightTriangle triangle3 = new RightTriangle();
        RightTriangle triangle4 = new RightTriangle();


        triangle1.getSide(5, 20);
        triangle2.getSide(3, 4);
        triangle3.setSide();
        triangle4.getSide(16.3, 4.889);

        System.out.println("The perimeter if triangle one is " + df.format(triangle1.getPerimeter(5, 20)));
        System.out.println("Angle A for triangle one is " + df.format(triangle1.getAngleA(5, triangle1.getHyp(5, 20))));
        System.out.println("Angle B for triangle one is " + df.format(triangle1.getAngleB(20, triangle1.getHyp(5, 20))));
        System.out.println("The area for triangle two is " + df.format(triangle2.getArea(3, 4)));

        triangle3.setSideA(10.1);
        triangle3.setSideB(12.4);

        System.out.println("Angle A for triangle three is " + df.format(triangle3.getAngleA(10.1, triangle3.getHyp(10.1, 12.4))));
        System.out.println("Angle B for triangle three is " + df.format(triangle3.getAngleB(12.4, triangle3.getHyp(10.1, 12.4))));
        System.out.println("Triangle 4 is " + triangle4.toString());

        triangle4.setSideA(-6);

        System.out.println("Triangle 4 is " + triangle4.toString());

        triangle2.setSideA(5.0);

        System.out.println("Triangle 2 is " + triangle2.toString());
    }
}

/*
The perimeter if triangle one is 45.62
Angle A for triangle one is 14.04
Angle B for triangle one is 75.96
The area for triangle two is 6
Angle A for triangle three is 39.16
Angle B for triangle three is 50.84
Triangle 4 is 16.3 4.89 17.02 38.21 39.85
Triangle 4 is 16.3 4.89 17.02 38.21 39.85
Triangle 2 is 5 4 6.4 15.4 10
 */
