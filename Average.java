
package average;

import java.util.Scanner;


public class Average {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three number :");
        
        double number1 = input.nextDouble();
                double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        
        double Average = (number1 + number2 + number3)/3;
        
        System.out.println("The Average is\t" + Average);

        
        
        
        
        
        
        
        
        
        
        
        

    }
    
}
