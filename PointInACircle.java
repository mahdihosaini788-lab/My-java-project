package pointinacircle;
import java.util.Scanner;
public class PointInACircle {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        
        System.out.println("Enter x: ");
            double x = input.nextDouble();
        System.out.println("Enter y: ");
            double y = input.nextDouble();

        if((x*x+y*y)<=10*10)
            System.out.println("point ("+x+ ","+y+") is in the circle");
        else  System.out.println("point ("+x+ ","+y+") is not in the circle");
    }
    
}
