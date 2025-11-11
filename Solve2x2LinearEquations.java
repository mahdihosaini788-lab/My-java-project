
package solve2x2linearequations;

import java.util.Scanner;

public class Solve2x2LinearEquations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the a number");
        double a = input.nextDouble();
         System.out.println("Enter the b number");
        double b = input.nextDouble();
         System.out.println("Enter the c number");
        double c = input.nextDouble();
         System.out.println("Enter the d number");
        double d = input.nextDouble();
         System.out.println("Enter the e number");
        double e = input.nextDouble();
         System.out.println("Enter the f number");
        double f = input.nextDouble();
        
        
        double x = (e*d-b*f)/(a*d-b*c);
        double y = (a*f-e*c)/(a*d-b*c);
        
        if(a*d-b*c==0){
            System.out.println("The equation has no solution");}
        else
            System.out.println("x is "+x+" and y is "+y);
        
    }
    
}
