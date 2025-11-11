
package variable;

import java.util.Scanner;


public class Variable {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.println("Enter X1");
        float X1 = input.nextFloat();
         System.out.println("Enter X2");
        float X2 = input.nextFloat();
        System.out.println("Enter Y1");
        float Y1 = input.nextFloat();
        System.out.println("Enter Y2");
        float Y2 = input.nextFloat();

        System.out.println(Math.pow((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1),0.5));
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
