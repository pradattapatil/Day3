package Day3.LineComparisonComputation;

import java.util.Scanner;

public class LengthOfLine {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program!");

        int x1;
        int x2;
        int y1;
        int y2;
        double length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 point: ");
        x1 = sc.nextInt();
        System.out.print("Enter y1 point: ");
        y1 = sc.nextInt();
        System.out.print("Enter x2 point: ");
        x2 = sc.nextInt();
        System.out.print("Enter y2 point: ");
        y2 = sc.nextInt();
        length = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("A length line of 2 points (x1, y1) and (x2, y2) is " + length);
    }
}
