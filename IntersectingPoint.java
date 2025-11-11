package intersecting.point;

import java.util.Scanner;

public class IntersectingPoint {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter x1 ");
        double x1 = input.nextDouble();
        System.out.println("Enter y1 ");
        double y1 = input.nextDouble();
        System.out.println("Enter x2 ");
        double x2 = input.nextDouble();
        System.out.println("Enter y2 ");
        double y2 = input.nextDouble();
        System.out.println("Enter x3 ");
        double x3 = input.nextDouble();
         System.out.println("Enter y3 ");
        double y3 = input.nextDouble();
         System.out.println("Enter x4 ");
        double x4 = input.nextDouble();
         System.out.println("Enter y4 ");
        double y4 = input.nextDouble();
        
            double D = (y1-y2)*(x3-x4) - (x1-x2)*(y3-y4);
            double dx = ((x1*y2 - y1*x2)*(x3-x4))-((x1-x2)*(x3*y4-y3*x4));
            double dy = ((x1*y2-y1*x2)*(y3-y4))-((y1-y2)*(x3*y4-y3*x4));
            
            double x = dx/D;
            double y = dy/D;
            if (D!=0)
                  System.out.println("The intersection point is at ("+Math.abs(x)+" , "+Math.abs(y)+")");
            else 
                 System.out.println("The two lines are parallel");

        
        
            
        
        
    }
    
}
