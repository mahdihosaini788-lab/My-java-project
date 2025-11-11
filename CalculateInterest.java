
package calculateinterest;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        
         
        Scanner input = new Scanner(System.in);
     
        System.out.println("What is your balance in  bank ");
        double balance = input.nextDouble();
        
        System.out.println("What is the annualInterestRate ");
        double annualInterestRate = input.nextDouble();
        
        double interest = balance*(annualInterestRate/1200);
        System.out.println("The interest is = "+interest);
        
        
        
        
        
    }
    
}
