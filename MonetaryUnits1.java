
package monetaryunits1;

import java.util.Scanner;
public class MonetaryUnits1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number (two digits)");
        int num = input.nextInt();
        
        int a = num%10;
        num = num/10;
        if(num==1 && a==1)
                System.out.println(num+" dollar and "+a+" penny");
        else if(num==1 && a!=1)
                    System.out.println(num+" dollar and "+a+" pennies");
        else if(num!=1 && a==1)
                    System.out.println(num+" dollars and "+a+" penny");
        else
                    System.out.println(num+" dollars and "+a+" pennies");

        
        
        
        
        
    }
    
}
