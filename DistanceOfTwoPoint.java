package distanceoftwopoint;

import java.util.Scanner;

public class DistanceOfTwoPoint {
    public static void main(String[] args) {
        
        
               Scanner input = new Scanner(System.in);
       
        System.out.println("Enter a number for X2: ");
        double X2 = input.nextDouble();
       
        System.out.println("Enter a number for X1: ");
        double X1 = input.nextDouble();
        
        System.out.println("Enter a number for Y2: ");
        double Y2 = input.nextDouble();

        System.out.println("Enter a number for Y1: ");
        double Y1 = input.nextDouble();

        double a = (X2*X2-2*X2*X1+X1*X1) + (Y2*Y2-2*Y2*Y1+Y1*Y1);
        
        System.out.println(Math.pow(a, 0.5));
        
        
    }
    
}
