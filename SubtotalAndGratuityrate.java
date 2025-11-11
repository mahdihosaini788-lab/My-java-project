package subtotalandgratuityrate;

import java.util.Scanner;

public class SubtotalAndGratuityrate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the subtotal :");
        double subtotal = input.nextDouble();
        
        System.out.println("Enter the gratuity_rate % :");
        double gratuity_rate = input.nextDouble();
        
        
        double gratuity = subtotal*gratuity_rate/100;
        
        double total = subtotal + gratuity;
        System.out.println("subtotal is"+subtotal);
                System.out.println("total is"+total);

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
