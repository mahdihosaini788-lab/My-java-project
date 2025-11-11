
package geometry.area.of.a.triangle;

import java.util.Scanner;

public class GeometryAreaOfATriangle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number for a ");
        float a  = input.nextFloat();
         System.out.println("Enter a number for b ");
        float b  = input.nextFloat();
         System.out.println("Enter a number for c ");
        float c  = input.nextFloat();
        
        double s = (a+b+c)/2;
        
        System.out.println(Math.pow(s*(s-a)*(s-b)*(s-c), 0.5));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
