
package monetaryunits;

import java.util.Scanner;

public class MonetaryUnits {
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
     
        System.out.println("Enter your money");
        int money = input.nextInt();
        
        
        int Dollars = money/100;
        int Cents = money%100;

        System.out.println(money+" money = "+Dollars+" Dollars and "+Cents+" cents ");
        
        
        
        
        
    }
    
}
