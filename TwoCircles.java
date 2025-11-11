package two.circles;
import java.util.Scanner;
public class TwoCircles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter circle1's center (x,y) coordinates and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.print("Enter circle2's center (x,y) coordinates and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        
        double dis = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
         if(dis<=r1-r2)
             System.out.println("Circle2 is inside circle1");
         else if(r1-r2<dis && dis<=r1+r2)
             System.out.println("Circle2 overlaps circle1");
         else if(dis>r1+r2)
             System.out.println("Circle2 does not overlap circle1");
    }
    
}
