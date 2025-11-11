
package invers;

import java.util.Scanner;


public class Invers {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for value of x");
                int x = input.nextInt();
                System.out.println("Enter a number for value of y");
        int y =input.nextInt();
        x = x+y;
        y = x -y;
        x = x-y;
        System.out.println(" the volue of x " + x);
        System.out.println(" the volue of y " + y);


    }
    
}
