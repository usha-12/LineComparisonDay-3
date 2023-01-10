package com.brideglabz.LineComparison;
import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("------Welcome to Line Comparison------");
        int line1x1 = 0;
        int line1x2 = 0;
        int line1y1 = 0;
        int line1y2 = 0;
        int line2x1 = 0;
        int line2x2 = 0;
        int line2y1 = 0;
        int line2y2 = 0;
        double lengthLine1 = 0.0;
        double lengthLine2 = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Using the cartesian coordinate system enter the endpoint of the Line 1");
        System.out.println("Endpoint 1 (x1, y1)");
        System.out.println("Enter the abscissa (x-Coordinate) =");
        line1x1 = sc.nextInt();
        System.out.println("Enter the ordinate (y-Coordinate) =");
        line1y1 = sc.nextInt();
        System.out.println("Endpoint 2 (x2, y2)");
        System.out.println("Enter the abscissa (x-Coordinate) =");
        line1x2 = sc.nextInt();
        System.out.println("Enter the ordinate (y-Coordinate) =");
        line1y2 = sc.nextInt();
        lengthLine1 = Math.sqrt((Math.pow((line1x2-line1x1),2)+Math.pow((line1y2-line1y1),2)));
        System.out.println("Length of Line is 1 => " +lengthLine1);
        System.out.println("==============================================");
        System.out.println("Using the cartesian coordinate system enter the endpoint of the Line 2");
        System.out.println("Endpoint 1 (x1, y1)");
        System.out.println("Enter the abscissa (x-Coordinate) =");
        line2x1 = sc.nextInt();
        System.out.println("Enter the ordinate (y-Coordinate) =");
        line2y1 = sc.nextInt();
        System.out.println("Endpoint 2 (x2, y2)");
        System.out.println("Enter the abscissa (x-Coordinate) =");
        line2x2 = sc.nextInt();
        System.out.println("Enter the ordinate (y-Coordinate) =");
        line2y2 = sc.nextInt();
        lengthLine1 = Math.sqrt((Math.pow((line2x2-line2x1),2)+Math.pow((line2y2-line2y1),2)));
        System.out.println("Length of Line is 2 => " +lengthLine2);
        Double d1 = new Double(lengthLine1);
        Double d2 = new Double(lengthLine2);
        if (d1.equals(d2))
            System.out.println("Line 1 and line 2 have equal lengths .");
        else
            System.out.println("Line first and line 2 not have equal lengths .");
        if ((Double.compare(lengthLine1, lengthLine2))==0)
            System.out.println("Length of line 1 is equal to the length of line 2.");
        else
        if ((Double.compare(lengthLine1, lengthLine2)) <0)
            System.out.println("Length of line 1 is less than the length of line 2.");
        else
        if ((Double.compare(lengthLine1,lengthLine2))>0)
            System.out.println("Length of line 1 is greater than the length of line 2.");
    }
}
/*As a fan of geometry, I want to
model a line based on a point
consisting of (x, y) co

-ordinates
using the Cartesian system,
So that I can calculate its
length
.
- A Length as 2 Points (x1, y1) and (x2, y2) - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2

- y1) ^ 2)*/
/*
compare two lines based on
the end points, So that I know
one line is equal, greater or
less than the other line. - Using Java compareTo method to compare 2 Lengths is
preferable.*/
