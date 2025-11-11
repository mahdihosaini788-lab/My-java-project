
package simpletax;

import java.util.Scanner;


public class SimpleTax {

    
    public static void main(String[] args) {
        
        
            Scanner input = new Scanner(System.in);
        System.out.println("Enter the purchaseAmount: ");
        double purchaseAmount = input.nextDouble();
        
        double tax = purchaseAmount*0.06;
        
        System.out.println("Sales tax is $"+(int)(tax*100)/(100.0));
        
        
        
        
        
        
    }
    
}
