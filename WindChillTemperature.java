
package wind.chill.temperature;

import java.util.Scanner;

public class WindChillTemperature {

    public static void main(String[] args) {
        
        
        
         Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the fahrenheit number but it be should betwen (-58  & 41)");
        double Ta = input.nextDouble();
        
        System.out.println("Enter the speed of the wind in (miles per hour ) it should be more than 2MPH");
        double V = input.nextDouble();
        
        double Twc = 35.74 + 0.6215*Ta - 35.75*Math.pow(V, 0.16)+ 0.4275*Ta*Math.pow(V, 0.16);
        
        System.out.println("The wind chil index is "+Twc);
        
        
        
        
    }
    
}
