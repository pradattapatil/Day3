package Day3.LineComparisonComputation;

import java.util.Scanner;

public class compareToMethod {
    public static void FIND_LENGTH(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
       double length1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
       double length2 = Math.sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2);
       System.out.println("The length between (x1, y1) and (x2, y2) is " + length1);
       System.out.println("The length between (x3, y3) and (x4, y4) is " + length2);

       //Comparing Length
        if (length1 > length2){
            System.out.println("First line is greater than second line");
        }
        else if (length1 < length2){
            System.out.println("First line is less than second line");
        }
        else {
            System.out.println("Both lines are Equal");
        }
    }


    // Getting input for user
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 point: ");
        x1 = sc.nextInt();
        System.out.print("Enter y1 point: ");
        y1 = sc.nextInt();
        System.out.print("Enter x2 point: ");
        x2 = sc.nextInt();
        System.out.print("Enter y2 point: ");
        y2 = sc.nextInt();

        int x3, y3, x4, y4;
        System.out.print("Enter x3 point: ");
        x3 = sc.nextInt();
        System.out.print("Enter y3 point: ");
        y3 = sc.nextInt();
        System.out.print("Enter x4 point: ");
        x4 = sc.nextInt();
        System.out.print("Enter y4 point: ");
        y4 = sc.nextInt();

        // Calling Method
        FIND_LENGTH(x1, y1, x2, y2, x3, y3, x4, y4);
    }
}












/*

    int x1, y1, x2, y2;
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 point: ");
                x1 = sc.nextInt();
                System.out.print("Enter y1 point: ");
                y1 = sc.nextInt();
                System.out.print("Enter x2 point: ");
                x2 = sc.nextInt();
                System.out.print("Enter y2 point: ");
                y2 = sc.nextInt();

                System.out.println();

                int x3, y3, x4, y4;
                System.out.print("Enter x3 point: ");
                x3 = sc.nextInt();
                System.out.print("Enter y3 point: ");
                y3 = sc.nextInt();
                System.out.print("Enter x4 point: ");
                x4 = sc.nextInt();
                System.out.print("Enter y4 point: ");
                y4 = sc.nextInt();

 */